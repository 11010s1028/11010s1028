/**
プログラミング基礎Java
プログラミング演習
問題4
コマンドライン引数で入力された英数字を逆順に並べ替えて表示してください。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_09_Q4.java
Starting audit...
Audit done.
>>> javac SO202_09_Q4.java
================

実行例
================
>>> java SO202_09_Q4
コマンドライン引数が不正です。
================
>>> java SO202_09_Q4 abcdef
fedcba
================
>>> java SO202_09_Q4 1234567890
0987654321
================

*/


// ここより下に解答を記載する。
public class SO202_09_Q4 {
  public static void main(String[] args) {
    
    //ターミナルにてコマンドライン引数の指定
    
    int n = args.length;

    if (n == 0) {
      System.out.println("コマンドライン引数が不正です。");
     
    } else {

      String text = args[0]; //全部入っている
      
      for (int i = (text.length() - 1); i >= 0; i--) {
        System.out.printf("%s", text.charAt(i)); //charAtは()の中身を取り出す
      }

    }

  }

}
    
