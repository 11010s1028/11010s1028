import java.util.*;


public class match5 {

   
    sinpan5 sinpanInce = new sinpan5();

    public int lusers = 0;
    
    
    

    public int[] MatchMethod(janken5 janken5,int aikoN,int[] point,playResult PlayresultInce, List<String> Player, ruru5 ruru5Ince){

       


        int[] count =new int [Player.size()];
        
        int count3 = 0;
        


        System.out.println("\n�ŏ��̓O�[�I�@����񂯂�c�c");

      

        int aiko = 0;
             

         do {
           
            System.out.println("�|�C�I�I�I\n");

            int[] handMatch = janken5.Hands(Player);//janken5�ōs���Ă���W�����P���̎�̐ݒ���Ăяo��

            int[] resultMatch = sinpanInce.SinpanMethod(handMatch, Player);//�W�����P���̔���

            if (!(resultMatch[0] == 0)) {

                aiko = 0;

                for (int i = 0; i < resultMatch.length; i++) {


                  if (resultMatch[i] == 1) {//player[i]��������

                     System.out.println(Player.get(i) + "��" + "�������I\n");
                     count[i] = count[i] + point[0];
                
                
                    } else if (resultMatch[i] == 2) {//player[i]��������

                      System.out.println(Player.get(i) + "��" + "�������B\n");  
                      count[i] = count[i] + point[1];
               
                    }

                }

            } else {

                System.out.println("��������...\n");

                aiko = 1;
                

                count3 ++;//�������̐�
            }

            if (count3 >= aikoN){

                System.out.println("�����������w��񐔑����܂����B"); 
                
                for (int i = 0; i <Player.size(); i++) {


                  
                  //player[i]�͂�����

                        count[i] = count[i] + point[2];
                 

                } 

                break;
            }

            
        } while (aiko == 1);

        count3 = 0;

        return count;

        
    }
}