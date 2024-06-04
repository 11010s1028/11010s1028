/**
プログラミング基礎Java
関数
練習問題1
「関数の定義方法」のソースコードを変更して、以下の結果を表示してください。
    7.8 + 3.4

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_06_Q1.java
Starting audit...
Audit done.
>>> javac SO202_06_Q1.java
================

実行例
================
>>> java SO202_06_Q1
11.200000
================

*/


// ここより下に解答を記載する。
public class SO202_06_Q1 {
  static double plus(double num1, double num2) {
    double x = num1 + num2;
    return x;
  }

  public static void main(String[] args) {
    double num = plus(7.8, 3.4);
    System.out.printf("%.1f\n", num);
  }
}
