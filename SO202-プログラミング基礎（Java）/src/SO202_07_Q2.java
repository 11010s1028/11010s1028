/**
プログラミング基礎Java
クラスとインスタンス
練習問題2
「パッケージ」のソースコードを以下の日時を出力するように変更してください。
    2000年1月2日 3時4分5秒

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_07_Q2.java
Starting audit...
Audit done.
>>> javac SO202_07_Q2.java
================

実行例
================
>>> java SO202_07_Q2
2000年1月2日 3時4分5秒
================

*/


// ここより下に解答を記載する。
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SO202_07_Q2 {
  public static void main(String[] args) {

    LocalDateTime date = LocalDateTime.now();

    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    System.out.println(date.format(f));

  }
}

        
