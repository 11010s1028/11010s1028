/**
 * プログラミング基礎Java
クラスとインスタンス
練習問題1
学生クラス（Student.java）を拡張して、以下の文言も表示してください。
    私の好きな教科は〇〇です。
※〇〇は、以下としてください。
    山田：国語
    田中：数学

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_07_Q1.java
Starting audit...
Audit done.
>>> javac SO202_07_Q1.java
================

実行例
================
>>> java SO202_07_Q1
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


// ここより下に解答を記載する。
class Student {
  static String school = "A高校";

  String name;
  String club;
  String subject;

  Student(String name, String club, String subject) {

    this.name = name;
    this.club = club;
    this.subject = subject;

  }

    String introduce() {

      String text = String.format("私の名前は%sです。\n", this.name);

      text += String.format("%sの%sに入っています。\n", school, this.club);

      text += String.format("私の好きな教科は%sです。\n", this.subject);

      return text;
    }
  }


public class SO202_07_Q1 {
  public static void main(String[] args) {

    Student yamada = new Student("山田", "野球部", "国語");
    Student tanaka = new Student("田中", "テニス部", "数学");

    System.out.println(yamada.introduce());
    System.out.println(tanaka.introduce());

    Student.school = "B高校";

    System.out.println(yamada.introduce());
    System.out.println(tanaka.introduce());

  }
}
