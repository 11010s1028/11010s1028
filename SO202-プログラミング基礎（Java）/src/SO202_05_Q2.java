/**
プログラミング基礎Java
制御構文
練習問題2
「switch文」のソースコードを以下に変更してください。
    num = 8

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_05_Q2.java
Starting audit...
Audit done.
>>> javac SO202_05_Q2.java
================

実行例
================
>>> java SO202_05_Q2
numを3で割った余りは、2です。
================

*/


// ここより下に解答を記載する。
public class SO202_05_Q2 {
  public static void main(String[] args) {
    
    int num = 8;

    switch (num % 3) {
      case 0:
        System.out.println("numを3で割った余りは、0です。");
        break;
      case 1:
        System.out.println("numを3で割った余りは、1です。");
        break;
      case 2:
        System.out.println("numを3で割った余りは、2です。");
        break;
      default:
        System.out.println("numに誤りがあります、");
        break;
    }
  }
}

  
