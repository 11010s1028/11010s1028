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

      Scanner scan = new Scanner(System.in);//�W������

      System.out.println("���Ȃ����o�������͂��Ă��������B");
      System.out.println("�O�[�F�P�@�`���L�F�Q�@�p�[�F�R\n");

      String str = scan.next(); //�W������

      int inputUser = int.parseInt(str); //�W�����͂�int�^�ϊ�
      
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

         
