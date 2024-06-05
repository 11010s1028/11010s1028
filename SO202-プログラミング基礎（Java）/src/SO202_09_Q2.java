/**
プログラミング基礎Java
プログラミング演習
問題2
コマンドライン引数で指定する範囲の整数を表示してください。
ただし、3の倍数のときは数の代わりに「Fizz」を、5の倍数のときは「Buzz」を出力し、
3と5両方の倍数のときは「FizzBuzz」を出力すること。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_09_Q2.java
Starting audit...
Audit done.
>>> javac SO202_09_Q2.java
================

実行例
================
>>> java SO202_09_Q2
コマンドライン引数が不正です。
================
>>> java SO202_09_Q2 1
コマンドライン引数が不正です。
================
>>> java SO202_09_Q2 1 15
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
================

*/


// ここより下に解答を記載する。
public class SO202_09_Q2 {
  public static void main(String[] args) {
    
    //ターミナルにてコマンドライン引数の指定

    if(args.length != (0 | 3)) {

    for (int i = 0; i < args[1]; i++) {

      if(args[i] = ((i % 3 == 0) | (i % 5 == 0))){

        System.out.println("FizzBuzz");

      } else if {
        if(args[i] = (i % 3 == 0)) {
          System.out.println("Fizz");
        } else if {
          System.out.println("Buzz");
        
      System.out.println(args[i]);
      
    
