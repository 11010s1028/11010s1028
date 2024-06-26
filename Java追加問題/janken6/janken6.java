// import java.util.Random;
import java.util.*;

public class janken6 {

  public int Cp() {

      
      int number = 0;

      Random random = new Random();

    
      number = random.nextInt(3);
    

      int[] gcp = {18,4,9};

      int te = gcp[number];
      


      return te;

    }

    /*public int User() {

      Scanner scan = new Scanner(System.in);//標準入力

      System.out.println("あなたが出す手を入力してください。");
      System.out.println("グー：１　チョキ：２　パー：３\n");

      String str = scan.next(); //標準入力

      int inputUser = int.parseInt(str); //標準入力のint型変換
      
      return inputUser;

      } */

      public int[] Hands(List<String> Player) {

       //List<String> playerList = toi6pInce.Player();

        int size = Player.size();



        int[] gcpResult = new int[size];

        int teCp;

        for (int i = 0; i < size; i++) {

            teCp = Cp();

            gcpResult[i] = teCp;
        

        }
        

        return gcpResult;
  

      }
    
    
    
    }

         
