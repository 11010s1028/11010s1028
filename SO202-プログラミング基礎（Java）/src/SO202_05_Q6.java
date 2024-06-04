/**
プログラミング基礎Java
制御構文
練習問題6
「continue文」のソースコードを以下に変更してください。
    奇数の場合、次の処理に移る。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_05_Q6.java
Starting audit...
Audit done.
>>> javac SO202_05_Q6.java
================

実行例
================
>>> java SO202_05_Q6
2
4
================

*/


// ここより下に解答を記載する。
public class SO202_05_Q6 {
  public static void main(String[] args) {

    for (int i = 1; i < 6; i++) {
      if (i % 2 == 1) {
        continue;
      }
      System.out.printf("%d\n", i);
    }
  }
}
