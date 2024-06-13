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
    
   /* // 高校の情報
    String koukou1 = "A高校";

    // 高校の情報を再設定
    String koukou2 = "B高校";

    // 学生の情報
    

    String name1 = "山田";
    String name2 = "田中";

    String bukatu1 = "野球部";
    String bukatu2 = "テニス部"; 

    //SO302_11_Q2_1 SO = new SO302_11_Q2_1(); //技：staticじゃないメソッドを使うため


    jiko(name1, koukou1, bukatu1);

    jiko(name2, koukou1, bukatu2);

    jiko(name1, koukou2, bukatu1);

    jiko(name2, koukou2, bukatu2);
      
    

    // 自己紹介  

    System.out.println ("私の名前は" + name1 + "です。");
    System.out.println (koukou1 + "の" + bukatu1 + "に入っています。\n");

    System.out.println ("私の名前は" + name2 + "です。");
    System.out.println (koukou1 + "の" + bukatu2 + "に入っています。\n");


    

    // 自己紹介
    

    System.out.println ("私の名前は" + name1 + "です。");
    System.out.println (koukou2 + "の" + bukatu1 + "に入っています。\n");

    System.out.println ("私の名前は" + name2 + "です。");
    System.out.println (koukou2 + "の" + bukatu2 + "に入っています。\n");
    */

    String[] koukou = {"A高校", "B高校"};

    String[] name = {"山田", "田中"};

    String[] bukatu = {"野球部", "テニス部"};

    for (int i = 0; i < 2; i++){

      System.out.println ("私の名前は" + name[i] + "です。");
      System.out.println (koukou[0] + "の" + bukatu[i] + "に入っています。\n");
    
    }

    for (int i = 0; i < 2; i++){

      System.out.println ("私の名前は" + name[i] + "です。");
      System.out.println (koukou[1] + "の" + bukatu[i] + "に入っています。\n");
    
    }

    
   }

   /*public static void jiko (String name, String koukou, String bukatu) {
      
      System.out.println ("私の名前は" + name + "です。");
      System.out.println (koukou + "の" + bukatu + "に入っています。\n");
      
    } */
  
}
