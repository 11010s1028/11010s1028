import java.util.*;

public class ruru5 {
    public void RuruMethod(toi5p toi5pInce, ruru5 ruru5Ince) { //�S�̗̂����\�����Ă���B

    //matuch5�Asettei5�AplayResult�̊e���\�b�h�̌Ăяo��

        

        janken5 janken5Ince = new janken5();

        match5 match5Ince = new match5();

        settei5 settei5Ince = new settei5();

        playResult PlayresultInce = new playResult();     

        

        int game = 1;

        System.out.println("\n�@�@�@�@�@�@�@�@�y����񂯂���z");
        System.out.println("======================================================\n");

       

        int[] kaisu = settei5Ince.RoundMethod(); //�ݒ荀�ڂ��L�q����settei5�̃��\�b�h�̌Ăяo��
        int aikoN = settei5Ince.AikoMethod();
        int[] point = settei5Ince.PointMethod();

        int playerSize;
        List<Integer> countHako = new ArrayList<>();

        

         System.out.println("\n������������������������������������������������������\n");

        System.out.println("�@�@�@����񂯂�̑����n�߂܂��B\n");
        System.out.println("�@�@�@�@�@�@�@�@�@�@�y ���[�� �z");
        System.out.println("�@�@(1) ���[���͂P����" + kaisu[0] + "���E���h�A�P���E���h " + kaisu[1] + "�v���C");
        System.out.println("�@�@(2) " + aikoN + "��A���ň��������̎��A�S���Ɉ��������_�����Z");
        System.out.println("�@�@(3) ���E���h���ƂɈ�ԓ��_�̒Ⴂ�v���C���[�͒E��\n");
        System.out.println("�@�@* �ł����_�̒Ⴂ�v���C���[�������l�̂Ƃ�\n�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�E���҂͖���\n");

        System.out.println("\n������������������������������������������������������\n");

       
        List<String> player = toi5pInce.Player();

            int round = 1;

            while (round <= kaisu[0]) { //���E���h���w��񐔌J��Ԃ�


                int play = 1;


                int[] countt = new int[player.size()];

               

                while (play <= kaisu[1] ) {//�v���C���w��񐔌J��Ԃ�

                 
                    System.out.println("�@�@�@�y�@" + game + " ������/ " + round + " ���E���h/ " + play + " �v���C�ځ@�z\n" );
                    System.out.println("======================================================\n");


                    countt = match5Ince.MatchMethod(janken5Ince, aikoN, point, PlayresultInce, player, ruru5Ince);
                    //�e�v���C���[�̃|�C���g

                    if (play == 1 && round == 1) {

                        for (int i = 0; i < player.size(); i++){ //�P���E���h�ڌ���@play���ƂɃ|�C���g�����Z���Ă���

                        countHako.add(countt[i]);
                       
                        }
                        
                    } else {
                        
                        for (int i = 0; i < player.size(); i++){ //�Q���E���h�ڈȍ~�@play���ƂɃ|�C���g�����Z���Ă���

                        countHako.set(i, countHako.get(i) + countt[i]);
                       
                        }

                    }


                    for (int i = 0; i < player.size(); i++) {//�v���C���Ƃ̊e�v���C���[�ɓ���_���\��

                    System.out.println(" >  " + player.get(i) + "��" + countt[i] + "�|�C���g\n");

                    }

                    
                    System.out.println("======================================================\n");

                    

                    play ++;
                }

              

                System.out.println("�@�@�@�@�@�@�@�y" + round + "���E���h�� ���Ԕ��\ �z\n");

                

               

                for (int i = 0; i < countt.length; i ++) { //���E���h�I�����ɂ���܂ł̊e�v���C���[�̑������_��\��

                    System.out.println("�@�@�@�@�@�@�@" + player.get(i) + "�F" + countHako.get(i) + "�|�C���g");
                }
               

          

                System.out.println("\n======================================================\n");

                System.out.printf("\n�@�@�@�@�@�@%d", round);

         
                playResult.GoodBy(match5Ince, player, countHako, janken5Ince, aikoN, point, PlayresultInce, ruru5Ince);
                
               


                if (player.size() == 1) { //�E���҂������A�v���C���[����l�ɂȂ��Ă��܂������ɕ\��

                    System.out.println("\n�@�@�@" + player.get(0) + "�͂P�l�ɂȂ������ߗD���I�I�I\n");

                    break;
                }

                round ++;
            }

            if (!(player.size() == 1)) { //���ׂẴ��E���h���I������Ƃ��ɕ\��

                System.out.println("�@�@�@�@�@�@�@�@�@�@�y �ŏI���� �z");

                  
                   



                   //�ȉ��A�ŏI���ʂ�\�����邽�߂̏���(toi5p�ɂ���v���C���[����countHako�ɓ����Ă���v���C���[�������ѕt���Ă���)


                List<Integer> countHako2 = new ArrayList<>();

                countHako2.addAll(countHako); 


                Collections.sort(countHako2, Collections.reverseOrder());

               

                List<Integer> tyohuku = new ArrayList<Integer>(new LinkedHashSet<Integer>(countHako2)); 


                for (int i = 0; i < tyohuku.size(); i++) {              
                  for (int j = 0; j < player.size(); j++) {

               

                

                  if (countHako.get(j) == tyohuku.get(i)){

                  

                   
                     System.out.println("�@�@�@�@�@�@�@" + (i+1) + "�ʁ@" + player.get(j) + "�F" + tyohuku.get(i) + "�|�C���g");

                     

                }
                


              }

            }

         

            }

                System.out.println("\n======================================================\n");


                    

        System.out.println("�@�@�@�@�@�@�@�@�@�y �����I�� �z\n");

        
        

        }

    


    }
