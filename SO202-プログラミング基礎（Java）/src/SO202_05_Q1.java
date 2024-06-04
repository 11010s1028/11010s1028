/**
プログラミング基礎Java
制御構文
練習問題1
「if文」のソースコードを以下に変更してください。
    num = 30

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_05_Q1.java
Starting audit...
Audit done.
>>> javac SO202_05_Q1.java
================

実行例
================
>>> java SO202_05_Q1
numは、50未満の数字です。
================

*/


// ここより下に解答を記載する。
public class SO202_05_Q1 {
  public static void main(String[] args) {

    int num = 30;

    if (num < 50) {
      System.out.println("numは、50未満の数字です。");
    } else if (num < 80) {
      System.out.println("numは、50以上80未満の数字です。");
    } else {
      System.out.println("numは、80以上の数字です。");
    }
  }
}

    
