import java.util.Random;
import java.util.Scanner; //�W������

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

      Scanner scan = new Scanner(System.in);//�W������

      System.out.println("���Ȃ����o�������͂��Ă��������B");
      System.out.println("�O�[�F�P�@�`���L�F�Q�@�p�[�F�R\n");

      String str = scan.next(); //�W������

      int inputUser = Integer.parseInt(str); //�W�����͂�int�^�ϊ�
      
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
                hand1  = "�O�[";
                break;
            
          case 2:
                hand1 = "�`���L";
                break;

          case 3:
                hand1 = "�p�[";
                break;
     
          default :
                hand1 = "�G���[";
                break;
        }

        switch (handCp[1]) {

          case 1:
                hand2  = "�O�[";
                break;
            
          case 2:
                hand2 = "�`���L";
                break;

          case 3:
                hand2 = "�p�[";
                break;
     
          default :
                hand2 = "�G���[";
                break;
        }

        String[] playerName = toi4pInce.player;

        for (int i = 0; i < 1; i++){

        System.out.println(playerName[i] + "�F " + hand1);
        System.out.println(playerName[i+1] + "�F " + hand2 + "\n");

        }

        return handSinpan;
  

      }
    
    
    
    }

         
