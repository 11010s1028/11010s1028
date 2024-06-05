/**
プログラミング基礎Java
ファイル処理
練習問題3
「ファイルに書き出す」のソースコードを以下に変更してください。
    書き出すファイル名：SO202_08_Q3_output.txt
    モード：追記
    書き込む文字列：ジャバ

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_08_Q3.java
Starting audit...
Audit done.
>>> javac SO202_08_Q3.java
================

実行例
================
>>> java SO202_08_Q3
処理を終了します。
>>> cat SO202_08_Q3_output.txt
ハロー
ジャバ
================

*/


// ここより下に解答を記載する。
import java.io.FileWriter;

public class SO202_08_Q2 {
  public static void main(String[] args) {

    try {
      //ファイルを開く
      FileWriter fw = new FileWriter("./SO202_08_Q3_output.txt");

      //ファイルに書き出す
      fw.write("ジャバ\n");

      //ファイルを閉じる
      fw.close();
    } catch (Exception ex) {
      System.out.println("例外が発生しました。");
    } finally {
      System.out.println("処理を終了します。");
    }
  }
}
