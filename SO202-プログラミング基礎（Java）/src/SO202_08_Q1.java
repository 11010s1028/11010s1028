/**
プログラミング基礎Java
ファイル処理
練習問題1
「ファイルを読み込む」のソースコードを以下に変更してください。
    読み込むファイル名：SO202_08_Q1_input.txt

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_08_Q1.java
Starting audit...
Audit done.
>>> javac SO202_08_Q1.java
================

実行例
================
>>> java SO202_08_Q1
これは、
読み込み用のファイル1
です。
処理を終了します。
================

*/


// ここより下に解答を記載する。
import java.io.FileReader;

public class SO202_08_Q1 {
  public static void main(String[] args) {
    
    try {
      //ファイルを開く
      FileReader fr = new FileReader("./SO202_08_Q1_input.txt");

      //ファイルを読み込む
      while (true) {
        //１文字読み込む
        int c = fr.read();

        //ファイルの終端
        if (c == -1) {
          break;
        }
        //読み込んだ文字を出力する
        System.out.printf("%c", c);
      }
      //ファイルを閉じる
      fr.close();
    } catch (Exception ex) {
      System.out.println("例外が発生しました。");
    } finally {
      System.out.println("処理を終了します。");
    }
  }
}
