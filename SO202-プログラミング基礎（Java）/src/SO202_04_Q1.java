/**
プログラミング基礎Java
演算子
練習問題1
以下の演算結果を変数に代入して表示してください。
    11を3で割った整数部分
    11を3で割った余り

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_04_Q1.java
Starting audit...
Audit done.
>>> javac SO202_04_Q1.java
================

実行例
================
>>> java SO202_04_Q1
3
2
================

*/


// ここより下に解答を記載する。
public class SO202_04_Q1 {
  public static void main(String[] args) {
    
    int a;
    double b;

    a = 11 / 3;
    b = 11 % 3;

    System.out.println(a);
    System.out.printf(%3d, b);
  }
}
    
