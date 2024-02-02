import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Colored Grid'),
        ),
        body: MyGrid(),
      ),
    );
  }
}

class MyGrid extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return GridView.builder(
      gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
        crossAxisCount: 2,
        childAspectRatio: 1.3,
      ),
      itemCount: 10,
      itemBuilder: (BuildContext context, int index) {
        return MyTile(index);
      },
    );
  }
}

class MyTile extends StatelessWidget {
  final int index;

  MyTile(this.index);

  final List<Color> tileColors = [
    Colors.red,
    Colors.blue,
    Colors.green,
    Colors.yellow,
    Colors.orange,
    Colors.purple,
    Colors.teal,
    Colors.indigo,
    Colors.pink,
    Colors.cyan,
  ];

  @override
  Widget build(BuildContext context) {
    Color tileColor = tileColors[index % tileColors.length];

    return Padding(
      padding: const EdgeInsets.symmetric(
          horizontal: 2), // Adjust the padding as needed
      child: Card(
        color: tileColor,
        child: Center(
          child: Text(
            'Tile $index',
            style: TextStyle(
              fontSize: 20.0,
              color: Colors.white,
            ),
          ),
        ),
      ),
    );
  }
}
