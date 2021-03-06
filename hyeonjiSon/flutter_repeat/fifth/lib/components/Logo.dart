import 'package:flutter/cupertino.dart';

class Logo extends StatelessWidget {
  const Logo(this.title);

  final String title;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Image(
          image: AssetImage("assets/hogwart.png"),
        ),
        Text(
          title,
          style: TextStyle(fontSize: 40, fontWeight: FontWeight.bold),
        )
      ],
    );
  }
}