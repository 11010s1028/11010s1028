/**
プログラミング実践Java
オブジェクト指向
練習問題4_2
練習問題4_1のプログラムに対して、以下の修正をしてください。
  自己紹介に以下の文言を追加する
    私の好きな教科は〇〇です。
※〇〇は、以下としてください。
    山田：国語
    田中：数学

コンパイル方法
================
>>> javac SO302_11_Q4_2.java
================

実行例
================
>>> java SO302_11_Q4_2
私の名前は山田です。
A高校の野球部に入っています。
私の好きな教科は国語です。

私の名前は田中です。
A高校のテニス部に入っています。
私の好きな教科は数学です。

私の名前は山田です。
B高校の野球部に入っています。
私の好きな教科は国語です。

私の名前は田中です。
B高校のテニス部に入っています。
私の好きな教科は数学です。

================

*/

public class SO302_11_Q4_2 {
  public static void main(String[] args) {

    String[] koukou = {"A高校", "B高校"};

    String[] yamada = {"山田", "野球部", "国語"};
    String[] tanaka = {"田中", "テニス部", "数学"};

    String[][] gakusei= {yamada, tanaka};
    
    for(int k = 0; k < 2; k++) { 
      for(int i = 0; i < 2; i++) {
        for(int j = 0; j < 1; j++) {

          System.out.println("私の名前は" + gakusei[i][j] + "です。");
          System.out.println(koukou[k] + "の" + gakusei[i][j+1] + "に入っています。");
          System.out.println("私の好きな教科は" + gakusei[i][j+2] + "です。\n");
        }
      }
    }
    
    
  }
  
}
