import 'package:flutter/material.dart';

import 'package:flutter/material.dart';
import 'package:second/selective_parameter.dart';
import 'package:second/cascade_grammer.dart';
import 'package:second/extends_test.dart';
import 'package:second/list_test.dart';
import 'package:second/map_test.dart';

void main() {
  selective_parameter_test();
  cascade_grammer_test();
  extends_test();

  List<int> listRef = list_test();
  list_add_test(listRef);
  print(listRef);
  print(listRef);
  list_rm_test(listRef);
  print(listRef);
  print("length: ${listRef.length}");

  Map mapTest = map_test();
  map_test();
  map_add_test(mapTest);
  map_findByKey_test(mapTest);
  map_updateByKey_test(mapTest);


  runApp(MyApp());
}

//이거 디폴트 만드는 약자 stl
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      home: TestPage(),
    );
  }
}

//run하기 전에 pubspec.yaml에 들어가서 Pub Get 클릭
class TestPage extends StatelessWidget {
  const TestPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: SafeArea(
          child: Column(
            children: [
              Padding(
                padding: const EdgeInsets.all(25.0),
                child: Row(
                  children: const [
                    Text("1조", style: TextStyle(fontWeight: FontWeight.bold),),
                    Spacer(), //글자 사이 띄우기
                    Text("2조", style: TextStyle(fontWeight: FontWeight.bold),),
                    Spacer(),
                    Text("3조", style: TextStyle(fontWeight: FontWeight.bold),),
                    Spacer(),
                    Text("4조", style: TextStyle(fontWeight: FontWeight.bold),),
                  ],
                ),
              ),
              Expanded( //asset 디렉토리를 사용한다고 pubspec.yaml에 작성해야한다.
                child:
                Image.asset("assets/fashion1.jpg", fit: BoxFit.cover),
              ),
              const SizedBox(height: 5,), //그림 사이의 간격
              Expanded(
                  child:
                  Image.asset("assets/fashion2.jpg", fit: BoxFit.cover)
              ),
            ],
          ),
        )
    );
  }
}


