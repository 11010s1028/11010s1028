import java.util.Random;
import java.util.Scanner; //標準入力

public class janken4 {

  public int[] Cp() {

      Random random = new Random();

      int[] inputRandom = new int[5];

      for (int i = 0; i < 2; i++){

      inputRandom[i] = random.nextInt(3)+1;
      
      }

      return inputRandom;

    }

    /*public int User() {

      Scanner scan = new Scanner(System.in);//標準入力

      System.out.println("あなたが出す手を入力してください。");
      System.out.println("グー：１　チョキ：２　パー：３\n");

      String str = scan.next(); //標準入力

      int inputUser = Integer.parseInt(str); //標準入力のint型変換
      
      return inputUser;

      } */

      public int[] Hands(toi4p toi4pInce) {


        int[] handCp;
        int handUser;

        handCp = Cp();
        //handUser = User();

        int[] handSinpan = {handCp[0],handCp[1]};

        String hand1;
        String hand2;

        switch (handCp[0]) {

          case 1:
                hand1  = "グー";
                break;
            
          case 2:
                hand1 = "チョキ";
                break;

          case 3:
                hand1 = "パー";
                break;
     
          default :
                hand1 = "エラー";
                break;
        }

        switch (handCp[1]) {

          case 1:
                hand2  = "グー";
                break;
            
          case 2:
                hand2 = "チョキ";
                break;

          case 3:
                hand2 = "パー";
                break;
     
          default :
                hand2 = "エラー";
                break;
        }

        String[] playerName = toi4pInce.player;

        for (int i = 0; i < 1; i++){

        System.out.println(playerName[i] + "： " + hand1);
        System.out.println(playerName[i+1] + "： " + hand2 + "\n");

        }

        return handSinpan;
  

      }
    
    
    
    }

         
