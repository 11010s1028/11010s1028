import java.awt.event.FocusListener;
import java.util.*;

public class ruru6 {
    public void RuruMethod(toi6p toi6pInce, ruru6 ruru6Ince) {

        

        janken6 janken6Ince = new janken6();

        match6 match6Ince = new match6();

        settei6 settei6Ince = new settei6();

        playResult PlayresultInce = new playResult();     

        

        int game = 1;

        System.out.println("\n�y����񂯂���z");
        System.out.println("======================================================\n");

       

        int[] kaisu = settei6Ince.RoundMethod();
        int aikoN = settei6Ince.AikoMethod();
        int[] point = settei6Ince.PointMethod();

        int playerSize;
        List<Integer> countHako = new ArrayList<>();

        

         System.out.println("\n������������������������������������������������������\n");

        System.out.println("����񂯂�̑����n�߂܂��B");
        System.out.println("���[���͂P����" + kaisu[0] + "���E���h�A�P���E���h " + kaisu[1] + "�v���C�Ƃ��܂��B");
        System.out.println(aikoN + "��A���ň��������ɂȂ����ꍇ�A�S�������������Ƃ��܂��B\n");

        System.out.println("\n������������������������������������������������������\n");

       
        List<String> player = toi6pInce.Player();

            int round = 1;

             List<int[]> roundResult = new ArrayList<int[]>();


            while (round <= kaisu[0]) {


                int play = 1;


                int[] countt = new int[player.size()];

              

                while (play <= kaisu[1] ) {

                 
                    System.out.println("�y�@" + game + " ������/ " + round + " ���E���h/ " + play + " �v���C�ځ@�z\n" );
                    System.out.println("======================================================\n");


                    countt = match6Ince.MatchMethod(janken6Ince, aikoN, point, PlayresultInce, player, ruru6Ince);
                    //�e�v���C���[�̃|�C���g

                   
                    roundResult.add(countt);//���E���h���Ƃ̃|�C���g����

                    if (play == 1 && round == 1) {

                        for (int i = 0; i < player.size(); i++){ //play���ƂɃ|�C���g�����Z���Ă���

                        countHako.add(countt[i]);
                       
                        }
                        
                    } else {
                        
                        for (int i = 0; i < player.size(); i++){ //play���ƂɃ|�C���g�����Z���Ă���

                        countHako.set(i, countHako.get(i) + countt[i]);
                       
                        }

                    }


                    for (int i = 0; i < player.size(); i++) {

                    System.out.println(player.get(i) + "��" + countt[i] + "�|�C���g");

                    }

                    
                    System.out.println("======================================================\n");

                    if (match6Ince.lusers == 1) {

                        break;

                    }

                    play ++;
                }

              

                System.out.println("�y" + round + "���E���h�� ���Ԕ��\ �z");

                

               

                for (int i = 0; i < countt.length; i ++) {

                    System.out.println(player.get(i) + "�F" + countHako.get(i) + "�|�C���g");
                }

                

          

                System.out.println("\n======================================================\n");

         

                
             

             //     if (player.size() == 1) {

                //         System.out.println(player.get(0) + "�͈�l�ɂȂ������ߗD���I�I�I");

                //         break;
             //     }

                round ++;
            }

         

                System.out.println("�y �ŏI���� �z");

                  
                   

                
                
                playResult.GoodBy(match6Ince, player, countHako, janken6Ince, aikoN, point, PlayresultInce, ruru6Ince, roundResult, kaisu);



           

           

                System.out.println("\n======================================================\n");


                    

        System.out.println("�y �����I�� �z\n");

        System.out.println("======================================================\n");

        

        }

    


    }
