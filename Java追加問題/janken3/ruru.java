public class ruru {
    public void RuruMethod(){

        janken3 janken3Ince = new janken3();

        match matchInce = new match();

        int game = 1;

        System.out.println("\n【じゃんけん大会】");
        System.out.println("======================================================\n");

        System.out.println("\n＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊\n");

        System.out.println("じゃんけんの大会を始めます。");
        System.out.println("ルールは１試合１ラウンド、１ラウンド２プレイとします。");

        System.out.println("\n＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊\n");

        while (game < 2) {

            int round = 1;

            while (round < 2) {

                int play = 1;

                while (play < 3) {

                    System.out.println("【　" + game + " 試合目/ " + round + " ラウンド/ " + play + " プレイ目　】\n" );
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

            //System.out.println(PlayerResult[0] + "の勝ち！\n");

        } else if (matchInce.count1 < matchInce.count2) {

            //System.out.println(PlayerResult[1] + "の勝ち！\n");

        } else if (matchInce.count1 == matchInce.count2) {
            System.out.println("引き分け！！！！\n");
        }

    }
}