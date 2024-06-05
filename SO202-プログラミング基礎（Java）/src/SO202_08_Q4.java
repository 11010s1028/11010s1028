/**
プログラミング基礎Java
ファイル処理
練習問題4
「キーボードから文字を入力する」のソースコードを作成してください。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_08_Q4.java
Starting audit...
Audit done.
>>> javac SO202_08_Q4.java
================

実行例
================
>>> java SO202_08_Q4 < SO202_08_Q4_input.txt
これはキーボードからの入力です。
処理を終了します。
================

*/


// ここより下に解答を記載する。
import java.io.FileWriter;

public class SO202_08_Q4 {
  public static void main(String[] args) {

    try {
      //キーボード入力用のストリームを開く
      Scanner scanner = new Scanner(System.in);

      System.out.println("これはキーボードからの入力です。");

      //キーボードからの文字入力を待ち受けます
      String text = scanner.next();

      //読み込んだ文字列を出力する
      System.out.println(text);

      //キーボード入力用のストリームを閉じる
      scanner.close();
    } catch (Exception ex) {
      System.out.println("例外が発生しました。");
    } finally {
      System.out.println("処理を終了します。");
    }
