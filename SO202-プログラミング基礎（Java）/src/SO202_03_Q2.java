/**
プログラミング基礎Java
変数とデータ型
練習問題2
以下の文字列を変数に代入して表示してください。
    He said "Hello World!!".

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_03_Q2.java
Starting audit...
Audit done.
>>> javac SO202_03_Q2.java
================

実行例
================
>>> java SO202_03_Q2
He said "Hello World!!".
================

*/


// ここより下に解答を記載する。
public class SO202_03_Q2 {
  public static void main(String[] args) {
    String msg = "He said \"Hello World!!\".";
      System.out.println(msg);
    }
}
