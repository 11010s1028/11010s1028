/**
プログラミング基礎Java
関数
練習問題5
Mathクラスのメソッドを使用して、以下を表示してください。
    21の平方根を小数点以下3桁まで

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_06_Q5.java
Starting audit...
Audit done.
>>> javac SO202_06_Q5.java
================

実行例
================
>>> java SO202_06_Q5
4.583
================

*/


// ここより下に解答を記載する。
public class SO202_06_Q5 {
  public static void main(String[] args) {

    double num1 = 21;

    num1 = Math.sqrt(num1);
    
    System.out.printf("%.3f", num1);
  }
}
