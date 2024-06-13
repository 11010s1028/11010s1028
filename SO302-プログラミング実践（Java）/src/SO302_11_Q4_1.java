/**
プログラミング実践Java
オブジェクト指向
練習問題4_1
練習問題3_1のプログラムに対して、以下の修正をしてください。
  複数の学生を配列で管理する

コンパイル方法
================
>>> javac SO302_11_Q4_1.java
================

実行例
================
>>> java SO302_11_Q4_1
私の名前は山田です。
A高校の野球部に入っています。

私の名前は田中です。
A高校のテニス部に入っています。

私の名前は山田です。
B高校の野球部に入っています。

私の名前は田中です。
B高校のテニス部に入っています。

================

*/

public class SO302_11_Q4_1 {
  public static void main(String[] args) {

    String[] koukou = {"A高校", "B高校"};

    String[] yamada = {"山田", "野球部"};
    String[] tanaka = {"田中", "テニス部"};

    String[][] gakusei= {yamada, tanaka};
    
    for(int k = 0; k < 2; k++) { 
      for(int i = 0; i < 2; i++) {
        for(int j = 0; j < 1; j++) {

          System.out.println("私の名前は" + gakusei[i][j] + "です。");
          System.out.println(koukou[k] + "の" + gakusei[i][j+1] + "に入っています。\n");
        }
      }
    }
    
    
  }
  
}

