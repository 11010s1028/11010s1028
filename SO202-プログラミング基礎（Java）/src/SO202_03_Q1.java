/**
プログラミング基礎Java
変数とデータ型
練習問題1
以下の数値を変数に代入して表示してください。
    2進数の1000（10進数で表示）
    16進数の1000（10進数で表示）
    0.56
    7.8 × 10の9乗

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_03_Q1.java
Starting audit...
Audit done.
>>> javac SO202_03_Q1.java
================

実行例
================
>>> java SO202_03_Q1
8
4096
0.56
7.8E9
================

*/


// ここより下に解答を記載する。
public class SO202_03_Q1 {
    public static void main(String[] args) {
        String bin = "1000";
        String hex = "1000";
        double c = 0.56;
        double d = 7.8 * 10;
        int total = 1;

        int i = Integer.parseInt(bin, 2); //2 → 10変換
        int j = Integer.parseInt(hex, 16); //16 → 10変換

        for(int k = 0; k < 9; k++){
            total = c * total;
        }

        System.out.printf("%d", i);
        System.out.printf("%d", j);
        System.out.printf("%f", c);
        System.out.printf("%d", total);
    }
}


        

        
        

        
        

