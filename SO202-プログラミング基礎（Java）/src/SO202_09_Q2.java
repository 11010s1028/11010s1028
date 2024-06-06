/**
プログラミング基礎Java
プログラミング演習
問題2
コマンドライン引数で指定する範囲の整数を表示してください。
ただし、3の倍数のときは数の代わりに「Fizz」を、5の倍数のときは「Buzz」を出力し、
3と5両方の倍数のときは「FizzBuzz」を出力すること。

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_09_Q2.java
Starting audit...
Audit done.
>>> javac SO202_09_Q2.java
================

実行例
================
>>> java SO202_09_Q2
コマンドライン引数が不正です。
================
>>> java SO202_09_Q2 1
コマンドライン引数が不正です。
================
>>> java SO202_09_Q2 1 15
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
================

*/


// ここより下に解答を記載する。
public class SO202_09_Q2 {
  public static void main(String[] args) {
    
    //ターミナルにてコマンドライン引数の指定
    
    int n = args.length;

    if (n == 2) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        for (int i = num1; i < num2 + 1; i++) {
            
            if (i % 3 == 0 || i % 5 == 0){
                System.out.println("FizzBuzz");
                
                } else if (i % 3 == 0) {
                    
                    System.out.println("Fizz");
                    
                } else if (i % 5 == 0) {
                    System.out.println("Buzz"); 
                    
                } else {
                    System.out.println(i);
                    
                    }
        }
    
    } else {
      System.out.println("コマンドライン引数が不正です。");
    }
  }
}                
