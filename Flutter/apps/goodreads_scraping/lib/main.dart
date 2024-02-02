// ignore_for_file: prefer_const_constructors
import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'package:html/parser.dart' as htmlParser;
import 'package:html/dom.dart' as html;

void main() {
  runApp(MyApp());
}

class BookModel {
  final String title;
  final String imageUrl;
  final String bookLink;

  BookModel(this.title, this.imageUrl, this.bookLink);
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Goodreads Book Search'),
        ),
        body: BookSearchScreen(),
      ),
    );
  }
}

class BookSearchScreen extends StatefulWidget {
  @override
  _BookSearchScreenState createState() => _BookSearchScreenState();
}

class _BookSearchScreenState extends State<BookSearchScreen> {
  List<BookModel> displayList = [];

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Padding(
          padding: const EdgeInsets.all(8.0),
          child: TextField(
            onChanged: (value) => updateList(value),
            decoration: InputDecoration(
              labelText: 'Enter Book Title',
              border: OutlineInputBorder(),
            ),
          ),
        ),
        Expanded(
          child: ListView.builder(
            itemCount: displayList.length,
            itemBuilder: (context, index) {
              final book = displayList[index];
              return ListTile(
                title: Text(book.title),
                subtitle: Text(book.bookLink),
                leading: Image.network(book.imageUrl),
              );
            },
          ),
        ),
      ],
    );
  }

  Future<void> updateList(String query) async {
    final response =
        await http.get(Uri.parse('https://www.goodreads.com/search?q=$query'));

    if (response.statusCode == 200) {
      final document = htmlParser.parse(response.body);

      final List<BookModel> books = [];

      final tbody = document.querySelector('tbody');

      if (tbody != null) {
        final bookRows =
            tbody.querySelectorAll('tr[itemtype="http://schema.org/Book"]');

        for (final row in bookRows) {
          final titleElement =
              row.querySelector('a.bookTitle span[itemprop="name"]');
          final imageElement = row.querySelector('img.bookCover');
          final bookLinkElement = row.querySelector('a.bookTitle');

          final title = titleElement?.text?.trim() ?? 'Unknown Title';
          final imageUrl = imageElement?.attributes['src']?.trim() ?? '';
          final bookLink = bookLinkElement?.attributes['href']?.trim() ?? '';

          books.add(BookModel(title, imageUrl, bookLink));
        }
      }

      setState(() {
        displayList = books;
      });
    } else {
      // Handle error
      print('Failed to fetch data');
    }
  }
}
