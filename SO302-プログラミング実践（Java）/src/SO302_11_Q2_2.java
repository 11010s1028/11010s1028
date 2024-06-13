/**
プログラミング実践Java
オブジェクト指向
練習問題2_2
練習問題2_1のプログラムに対して、以下の修正をしてください。
  自己紹介に以下の文言を追加する
    私の好きな教科は〇〇です。
※〇〇は、以下としてください。
    山田：国語
    田中：数学

コンパイル方法
================
>>> javac SO302_11_Q2_2.java
================

実行例
================
>>> java SO302_11_Q2_2
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

public class SO302_11_Q2_2 {
  public static void main(String[] args) {
    
    // 高校の情報
    String koukou1 = "A高校";

    // 高校の情報を再設定
    String koukou2 = "B高校";

    // 学生の情報
    

    String name1 = "山田";
    String name2 = "田中";

    String bukatu1 = "野球部";
    String bukatu2 = "テニス部";

    String kyouka1 = "国語";
    String kyouka1 = "数学";

    //SO302_11_Q2_1 SO = new SO302_11_Q2_1(); //技：staticじゃないメソッドを使うため


    jiko(name1, koukou1, bukatu1, kyouka1);

    jiko(name2, koukou1, bukatu2, kyouka2);

    jiko(name1, koukou2, bukatu1, kyouka1);

    jiko(name2, koukou2, bukatu2, kyouka2);
      
    
/*
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

    
   }

   public static void jiko (String name, String koukou, String bukatu) {
      
     System.out.println ("私の名前は" + name + "です。");
     System.out.println (koukou + "の" + bukatu + "に入っています。");
     System.out.println ("私の好きな教科は" + kyouka + "です。\n");
      
      
    }
  
}
