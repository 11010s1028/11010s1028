import java.util.*;

public class match5 {

    //toi5p toi5pInce = new toi5p();
    sinpan5 sinpanInce = new sinpan5();

    public int lusers = 0;
    
    
    

    public int[] MatchMethod(janken5 janken5,int aikoN,int[] point,playResult PlayresultInce, toi5p toi5pInce, ruru5 ruru5Ince){

        List<String> playerList = toi5pInce.Player();  //ArrayList���󂯎��

        //playerList.add(toi5pInce.Player());


        int[] count =new int [playerList.size()];
        
        int count3 = 0;
        


        System.out.println("\n�ŏ��̓O�[�I�@����񂯂�c�c");

        // int resultMatch[];

        int aiko = 0;
             

         do {
           
            System.out.println("�|�C�I�I�I\n");

            int[] handMatch = janken5.Hands(toi5pInce);

            int[] resultMatch = sinpanInce.SinpanMethod(handMatch, playerList);

            if (!(resultMatch[0] == 0)) {

                aiko = 0;

                for (int i = 0; i < resultMatch.length; i++) {


                  if (resultMatch[i] == 1) {//player[i]��������

                     System.out.println(playerList.get(i) + "��" + "�������I\n");
                     count[i] = count[i] + point[0];
                
                
                    } else if (resultMatch[i] == 2) {//player[i]��������

                      System.out.println(playerList.get(i) + "��" + "�������B\n");  
                      count[i] = count[i] + point[1];
               
                    } else {//player[i]�͂�����

                        count[i] = count[i] + point[2];
                    }

                }

            } else {

                System.out.println("��������...\n");

                aiko = 1;
                

                count3 ++;
            }

            if (count3 > aikoN){

                System.out.println("���f���Ă��������A�����������T�A�������܂����B"); 
                lusers = 1;  

                break;
            }

            
        } while (aiko == 1);

        count3 = 0;

        return count;

        
    }
}