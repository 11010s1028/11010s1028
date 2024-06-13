/**
プログラミング実践Java
オブジェクト指向
練習問題5_4
練習問題4_3のプログラムに対して、以下の修正をしてください。
  自己紹介のの文言に修正する
    私の名前は〇〇です。
    A高校の〇年生で、〇〇部に入っています。
    私の好きな教科は〇〇です。
※〇〇は、以下としてください。
    山田：1年生：野球部：国語
    田中：2年生：テニス部：数学
    鈴木：3年生：吹奏楽部：社会

コンパイル方法
================
>>> javac SO302_11_Q5_4.java
================

実行例
================
>>> java SO302_11_Q5_4
私の名前は山田です。
A高校の1年生で、野球部に入っています。
私の好きな教科は国語です。

私の名前は田中です。
A高校の2年生で、テニス部に入っています。
私の好きな教科は数学です。

私の名前は鈴木です。
A高校の3年生で、吹奏楽部に入っています。
私の好きな教科は社会です。

私の名前は山田です。
B高校の1年生で、野球部に入っています。
私の好きな教科は国語です。

私の名前は田中です。
B高校の2年生で、テニス部に入っています。
私の好きな教科は数学です。

私の名前は鈴木です。
B高校の3年生で、吹奏楽部に入っています。
私の好きな教科は社会です。

================

*/

class GakuseiClass {
  String[] koukou = {"A高校", "B高校"};

  String[] yamada = {"山田", "野球部", "国語", "1"};
  String[] tanaka = {"田中", "テニス部", "数学", "2"};
  String[] suzuki = {"鈴木", "吹奏楽部", "社会", "3"};

  String[][] gakusei= {yamada, tanaka, suzuki};
}

public class SO302_11_Q5_4 {
  public static void main(String[] args) {

    GakuseiClass gakuseiclass = new GakuseiClass();
    
    for(int k = 0; k < 2; k++) { 
      for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 1; j++) {

          System.out.println("私の名前は" + gakuseiclass.gakusei[i][j] + "です。");
          System.out.println(gakuseiclass.koukou[k] + "の" + gakuseiclass.gakusei[i][j+3] + "年生で、" + gakuseiclass.gakusei[i][j+1] + "に入っています。");
          System.out.println("私の好きな教科は" + gakuseiclass.gakusei[i][j+2] + "です。\n");
        }
      }
    }
    
    
  }
  
}
