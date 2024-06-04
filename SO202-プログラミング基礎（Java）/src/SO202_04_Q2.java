/**
プログラミング基礎Java
演算子
練習問題2
a = 6、b = 7のとき、以下の演算結果を表示してください。
    aとbの論理積
    aとbの排他的論理和
    aのビットの反転
    aを3ビット左シフト

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_04_Q2.java
Starting audit...
Audit done.
>>> javac SO202_04_Q2.java
================

実行例
================
>>> java SO202_04_Q2
6
1
-7
48
================

*/


// ここより下に解答を記載する。
public class SO202_04_Q2 {
  public static void main(String[] args) {

  int a = 6;
  int b = 7;
  int and, xor, ab, ashif;
  and = a & b;
  xor = a ^ b;
  ab = ~a;
  ashif = a << 3;
  System.out.println(and);
  System.out.println(xor);
  System.out.println(ab);
  System.out.println(ashif);
    
  }
}
