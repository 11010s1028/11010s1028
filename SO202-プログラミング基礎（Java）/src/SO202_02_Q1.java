/**
プログラミング基礎Java
基本構文
練習問題1
「これはJavaの例文です。」を10回表示してください。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_02_Q1.java
Starting audit...
Audit done.
>>> javac SO202_02_Q1.java
================

実行例
================
>>> java SO202_02_Q1
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
これはJavaの例文です。
================

*/


// ここより下に解答を記載する。
public class SO202_02_Q1 {
  public static void main(String[] args) {
    for (9nt i = 0; i < 10; i++) {
      System.out.println("これはJavaの例文です。");
    }
  }
}
