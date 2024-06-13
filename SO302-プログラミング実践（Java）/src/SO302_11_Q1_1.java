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
    
    // 高校の情報
    public class KoukouClass {
      public String KoukouMethod() {

        return "A高校";
        
      }
    }

    // 学生の情報
    public class GakuseiClass {

      public String name1 = "山田";
      public String name2 = "田中";

      public String bukatu1 = "野球部";
      public String bukatu2 = "テニス部";
      
    }

    // 自己紹介
    public class JikoClass {

      GakuseiClass gakusei = new GakuseiClass();
      KoukouClass koukou = new KoukouClass();
      
      public String JikoMethod {

        System.out.println("私の名前は" + gakusei.name1 + "です。");
        System.out.println(koukou.KoukouMethod + "の" + gakusei.bukatu1 + "に入っています。");

        System.out.println("私の名前は" + gakusei.name2 + "です。");
        System.out.println(koukou.KoukouMethod + "の" + gakusei.bukatu2 + "に入っています。");

      }
      
    }

    // 高校の情報を再設定
    public class Koukou2Class{
      public String Koukou2Method {

        return "B高校";
      }
    }

    // 自己紹介
    public class Jiko2Class {
      
      //GakuseiClass gakusei = new GakuseiClass();
      Koukou2Class koukou2 = new Koukou2Class();
      
      public String JikoMethod {

        System.out.println("私の名前は" + gakusei.name1 + "です。");
        System.out.println(koukou2.Koukou2Method + "の" + gakusei.bukatu1 + "に入っています。");

        System.out.println("私の名前は" + gakusei.name2 + "です。");
        System.out.println(koukou2.Koukou2Method + "の" + gakusei.bukatu2 + "に入っています。");

      }
      
    }

   public static void main(String[] args) {

     JikoClass jiko = new jikoClass();
     Jiko2Class jiko2 = new Jiko2Class();
   }
  
}
