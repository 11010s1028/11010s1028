import java.util.*;

public class ruru5 {
    public void RuruMethod(toi5p toi5pInce, ruru5 ruru5Ince) {

        

        janken5 janken5Ince = new janken5();

        match5 match5Ince = new match5();

        settei5 settei5Ince = new settei5();

        playResult PlayresultInce = new playResult();     

        

        int game = 1;

        System.out.println("\n�y����񂯂���z");
        System.out.println("======================================================\n");

       

        int[] kaisu = settei5Ince.RoundMethod();
        int aikoN = settei5Ince.AikoMethod();
        int[] point = settei5Ince.PointMethod();


        List<String> playerList = toip5.Player();
        List<String> playerList2;
        int playerSize;
        List<Integer> countHako = new ArrayList<>();

        

         System.out.println("\n������������������������������������������������������\n");

        System.out.println("����񂯂�̑����n�߂܂��B");
        System.out.println("���[���͂P����" + kaisu[0] + "���E���h�A�P���E���h " + kaisu[1] + "�v���C�Ƃ��܂��B");
        System.out.println(aikoN + "��A���ň��������ɂȂ����ꍇ�A�S�������������Ƃ��܂��B\n");

        System.out.println("\n������������������������������������������������������\n");

        for (int i = 0; i < playerList.size(); i++){

            countHako.add(i) = 0;
        }

        while (game <= 1) {

            int round = 1;

            while (round <= kaisu[0]) {

                int play = 1;

                playerList2 = toi5pInce.Player();

                playerSize = playerList2.size();

                int[] countt = new int[playerSize];

                while (play <= kaisu[1] ) {

                 
                    System.out.println("�y�@" + game + " ������/ " + round + " ���E���h/ " + play + " �v���C�ځ@�z\n" );
                    System.out.println("======================================================\n");

                    countt = match5Ince.MatchMethod(janken5Ince, aikoN, point, PlayresultInce, toi5pInce, ruru5Ince);
                    //�e�v���C���[�̃|�C���g


                    for (int i = 0; i < playerSize; i++){ //play���ƂɃ|�C���g�����Z���Ă���

                        countHako.add(i) = countHako.get(i) + countt[i];
                    }

                    for (int i = 0; i < playerSize; i++) {

                    System.out.println(playerList2.get(i) + "��" + countt[i] + "�|�C���g");

                    }

                    
                    System.out.println("======================================================\n");

                    if (match5Ince.lusers == 1) {

                        break;

                    }

                    play ++;
                }

                System.out.println("�y" + round + "���E���h�� ���Ԕ��\ �z");

                List<String> playerList = playResult.GoodBy();

                //playerList.add(toi5pInce.Player());

                for (int i = 0; i < countt.length; i ++) {

                    System.out.println(playerList.get(i) + "�F" + countt[i] + "�|�C���g");
                }

                System.out.println("\n======================================================\n");

                

                if (match5Ince.lusers == 1) {
                   
                        break;

                    }

                     

                
                PlayresultInce.GoodBy(match5Ince, toi5pInce, countt, janken5Ince, aikoN,  point,  PlayresultInce, ruru5Ince);


                round ++;
            }

            if (match5Ince.lusers == 1) {

                        break;

                    }

                    

            game ++;
        }

        

        System.out.println("�y �����I�� �z\n");

        System.out.println("======================================================\n");

        

        }





        





    


    }
