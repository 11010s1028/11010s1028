public class ruru4 {
    public void RuruMethod(){

        janken4 janken3Ince = new janken4();

        match4 matchInce = new match4();

        int game = 1;

        System.out.println("\n�y����񂯂���z");
        System.out.println("======================================================\n");

        System.out.println("\n������������������������������������������������������\n");

        System.out.println("����񂯂�̑����n�߂܂��B");
        System.out.println("���[���͂P�����P���E���h�A�P���E���h�Q�v���C�Ƃ��܂��B");

        System.out.println("\n������������������������������������������������������\n");

        while (game < 2) {

            int round = 1;

            while (round < 4) {

                int play = 1;

                while (play < 11) {

                    System.out.println("�y�@" + game + " ������/ " + round + " ���E���h/ " + play + " �v���C�ځ@�z\n" );
                    System.out.println("======================================================\n");

                    matchInce.MatchMethod(janken3Ince);

                    
                    System.out.println("======================================================\n");

                    if (matchInce.lusers == 1) {

                        break;

                    }

                    play ++;
                }

                if (matchInce.lusers == 1) {

                        break;

                    }


                round ++;
            }

            if (matchInce.lusers == 1) {

                        break;

                    }

            game ++;
        }

        System.out.println("�y �����I�� �z\n");

        System.out.println("======================================================\n");

        if (!(matchInce.lusers == 1)) {

        //String[] PlayerResult = toi3p.player;

        if (matchInce.count1 > matchInce.count2) {

            System.out.println("���{�b�g�P��" + "�̏����I\n");

            double parse1;

            double countt1 = (double)matchInce.count1;
            double countt2 = (double)matchInce.count2;

            parse1 = ((countt1)  / (countt1 + countt2)) * 100;
            System.out.printf("�����F%2.3f��\n\n", parse1);

        } else if (matchInce.count1 < matchInce.count2) {

            System.out.println("���{�b�g�Q��" + "�̏����I\n");

            double parse2;

            double countt1 = (double)matchInce.count1;
            double countt2 = (double)matchInce.count2;

            parse2 = ((countt2) / (countt1 + countt2)) * 100;
            System.out.printf("�����F%2.2f��\n\n", parse2);

        } else if (matchInce.count1 == matchInce.count2) {
            System.out.println("���������I�I�I�I\n");
        }

        } else {

            System.out.println("���Ҏ��i\n");

        }

    }
}