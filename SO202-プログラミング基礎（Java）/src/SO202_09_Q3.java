/**
プログラミング基礎Java
プログラミング演習
問題3
以下の配列を小さい順に並び替えて表示してください。
    2, 13, 99, 20, 28, 64, 33, 73, 20, 1, 73

コンパイル方法
================
>>> java -jar checkstyle-10.3.4-all.jar -c checkstyle.xml SO202_09_Q3.java
Starting audit...
Audit done.
>>> javac SO202_09_Q3.java
================

実行例
================
>>> java SO202_09_Q3
1, 2, 13, 20, 20, 28, 33, 64, 73, 73, 99
================

*/


// ここより下に解答を記載する。
public class SO202_09_Q3 {
  public static void main(String[] args) {

    int[] data = {2, 13, 99, 20, 28, 64, 33, 73, 20, 1, 73};

    int n = data.length;

 
    for (int i = 0; i < n - 1; i++) {

      int minIndex = i;

      for (int j = i + 1; j < n; j++) {
        
        if (data[j] < data[minIndex]) {
          minIndex = j;
          
        }
      }

      int min = data[minIndex];
      data[minIndex] = data[i];
      data[i] = min;
    
    }

    for (int i = 0; i < n; i++) {

      if (i == 10) {
        System.out.printf("%d", data[i]);
      } else {
        System.out.printf("%d, ", data[i]);
      
      }
    }
  
  }

}
