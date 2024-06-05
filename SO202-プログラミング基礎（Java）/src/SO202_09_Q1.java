/**
プログラミング基礎Java
プログラミング演習
問題1
1から100までの整数を足し合わせた結果を表示してください。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_09_Q1.java
Starting audit...
Audit done.
>>> javac SO202_09_Q1.java
================

実行例
================
>>> java SO202_09_Q1
5050
================

*/


// ここより下に解答を記載する。
public class SO202_09_Q1 {
  public static void main(String[] args) {
    
    int i;
    int total = 0;

    for(i = 1; i <=100; i++) {
      total += i;
    }
    System.out.println(total);
  }
}

  
