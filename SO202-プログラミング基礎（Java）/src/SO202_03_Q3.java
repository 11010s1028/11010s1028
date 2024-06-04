/**
プログラミング基礎Python
変数とデータ型
練習問題3
以下のリストを宣言して、0番目の要素を表示してください。
    1
    2
    3
    4

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_03_Q3.java
Starting audit...
Audit done.
>>> javac SO202_03_Q3.java
================

実行例
================
>>> java SO202_03_Q3
1
================

*/


// ここより下に解答を記載する。
public class SO202_03_Q3 {
    public static void main(String[] args) {
        int[] l = new int[] {1,2,3,4};
        System.out.println(l [0]);
    }
    
    }
