public class ruru {
    public void RuruMethod(){

        janken3 janken3Ince = new janken3();

        match matchInce = new match();

        int game = 1;

        System.out.println("\n�y����񂯂���z");
        System.out.println("======================================================\n");

        System.out.println("\n������������������������������������������������������\n");

        System.out.println("����񂯂�̑����n�߂܂��B");
        System.out.println("���[���͂P�����P���E���h�A�P���E���h�Q�v���C�Ƃ��܂��B");

        System.out.println("\n������������������������������������������������������\n");

        while (game < 2) {

            int round = 1;

            while (round < 2) {

                int play = 1;

                while (play < 3) {

                    System.out.println("�y�@" + game + " ������/ " + round + " ���E���h/ " + play + " �v���C�ځ@�z\n" );
                    System.out.println("======================================================\n");

                    matchInce.MatchMethod(janken3Ince);
                    System.out.println("======================================================\n");


                    play ++;
                }


                round ++;
            }

            game ++;
        }

        //String[] PlayerResult = toi3p.player;

        if (matchInce.count1 > matchInce.count2) {

            //System.out.println(PlayerResult[0] + "�̏����I\n");

        } else if (matchInce.count1 < matchInce.count2) {

            //System.out.println(PlayerResult[1] + "�̏����I\n");

        } else if (matchInce.count1 == matchInce.count2) {
            System.out.println("���������I�I�I�I\n");
        }

    }
}