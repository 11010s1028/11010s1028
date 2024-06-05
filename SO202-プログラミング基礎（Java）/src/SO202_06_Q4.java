/**
プログラミング基礎Java
関数
練習問題4
Mathクラスのメソッドを使用して、以下を表示してください。
    -2.4の絶対値

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_06_Q4.java
Starting audit...
Audit done.
>>> javac SO202_06_Q4.java
================

実行例
================
>>> java SO202_06_Q4
2.400000
================

*/


// ここより下に解答を記載する。
public class SO202_06_Q4 {
  public static void main(String[] args) {
    
    double num1 = -2.4;

    num1 = Math.abs(num1);

    System.out.println(num1);
  }
}
