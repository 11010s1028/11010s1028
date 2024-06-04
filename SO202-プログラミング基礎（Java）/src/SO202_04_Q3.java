/**
プログラミング基礎Java
演算子
練習問題3
以下の文字列を表示してください。
    2つの文字列「Good」と「Morning」を結合した文字列

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_04_Q3.java
Starting audit...
Audit done.
>>> javac SO202_04_Q3.java
================

実行例
================
>>> java SO202_04_Q3
GoodMorning
================

*/


// ここより下に解答を記載する。
public class SO202_04_Q3 {
  public static void main(String[] args) {

    String total = "Good" + "Morning";

    System.out.println(total);

  }
}
    
