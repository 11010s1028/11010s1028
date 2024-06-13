/**
プログラミング実践Java
オブジェクト指向
練習問題5_3
練習問題5_2のプログラムに対して、以下の修正をしてください。
  新しい学生を追加する
    鈴木：吹奏楽部：社会

コンパイル方法
================
>>> javac SO302_11_Q5_3.java
================

実行例
================
>>> java SO302_11_Q5_3
私の名前は山田です。
A高校の野球部に入っています。
私の好きな教科は国語です。

私の名前は田中です。
A高校のテニス部に入っています。
私の好きな教科は数学です。

私の名前は鈴木です。
A高校の吹奏楽部に入っています。
私の好きな教科は社会です。

私の名前は山田です。
B高校の野球部に入っています。
私の好きな教科は国語です。

私の名前は田中です。
B高校のテニス部に入っています。
私の好きな教科は数学です。

私の名前は鈴木です。
B高校の吹奏楽部に入っています。
私の好きな教科は社会です。

================

*/

class GakuseiClass {
  String[] koukou = {"A高校", "B高校"};

  String[] yamada = {"山田", "野球部", "国語"};
  String[] tanaka = {"田中", "テニス部", "数学"};
  String[] suzuki = {"鈴木","吹奏楽部","社会"}

  String[][] gakusei= {yamada, tanaka, suzuki};
}

public class SO302_11_Q5_3 {
  public static void main(String[] args) {

    GakuseiClass gakuseiclass = new GakuseiClass();
    
    for(int k = 0; k < 2; k++) { 
      for(int i = 0; i < 2; i++) {
        for(int j = 0; j < 1; j++) {

          System.out.println("私の名前は" + gakuseiclass.gakusei[i][j] + "です。");
          System.out.println(gakuseiclass.koukou[k] + "の" + gakuseiclass.gakusei[i][j+1] + "に入っています。");
          System.out.println("私の好きな教科は" + gakuseiclass.gakusei[i][j+2] + "です。\n");
        }
      }
    }
    
    
  }
  
}
