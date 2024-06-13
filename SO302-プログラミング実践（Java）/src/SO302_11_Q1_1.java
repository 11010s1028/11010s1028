/**
プログラミング実践Java
オブジェクト指向
練習問題1_1
学生を表現するプログラムを作成してください。
ただし、手続き型プログラミングのみを使用し、配列や関数も使用してはいけません。
    私の名前は〇〇です。
    〇〇の〇〇に入っています。
※〇〇は、以下としてください。
    山田：野球部
    田中：テニス部

コンパイル方法
================
>>> javac SO302_11_Q1_1.java
================

実行例
================
>>> java SO302_11_Q1_1
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

public class SO302_11_Q1_1 {
  public static void main(String[] args) {
    
    // 高校の情報
    public String koukou1 = "A高校";

    // 学生の情報
    

    public String name1 = "山田";
    public String name2 = "田中";

    public String bukatu1 = "野球部";
    public String bukatu2 = "テニス部";
      
    

    // 自己紹介
   

    GakuseiClass gakusei = new GakuseiClass();    

    System.out.println("私の名前は" + name1 + "です。");
    System.out.println(koukou1 + "の" + gakusei.bukatu1 + "に入っています。");

    System.out.println("私の名前は" + name2 + "です。");
    System.out.println(koukou1 + "の" + bukatu2 + "に入っています。");


    // 高校の情報を再設定
    public String koukou2 = "B高校";

    // 自己紹介
    

    System.out.println("私の名前は" + name1 + "です。");
    System.out.println(koukou2 + "の" + bukatu1 + "に入っています。");

    System.out.println("私の名前は" + name2 + "です。");
    System.out.println(koukou2 + "の" + bukatu2 + "に入っています。");
   }
  
}
