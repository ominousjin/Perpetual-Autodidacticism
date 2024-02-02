import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  List<bool> toggleValues = [false, false, false];

  void updateToggleValue(int index, bool value) {
    setState(() {
      toggleValues[index] = value;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Toggle Switches Example'),
      ),
      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          buildToggleSwitch(0),
          buildToggleSwitch(1),
          buildToggleSwitch(2),
        ],
      ),
    );
  }

  Widget buildToggleSwitch(int index) {
    return ToggleSwitch(
      index: index,
      value: toggleValues[index],
      onChanged: (value) {
        updateToggleValue(index, value);
      },
    );
  }
}

class ToggleSwitch extends StatelessWidget {
  final int index;
  final bool value;
  final ValueChanged<bool>? onChanged;

  ToggleSwitch({required this.index, required this.value, this.onChanged});

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Text('Toggle $index:'),
        Switch(
          value: value,
          onChanged: onChanged,
        ),
      ],
    );
  }
}
