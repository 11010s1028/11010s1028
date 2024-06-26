import java.util.*;

public class ruru5 {
    public void RuruMethod(toi5p toi5pInce, ruru5 ruru5Ince) {

        

        janken5 janken5Ince = new janken5();

        match5 match5Ince = new match5();

        settei5 settei5Ince = new settei5();

        playResult PlayresultInce = new playResult();     

        

        int game = 1;

        System.out.println("\n【じゃんけん大会】");
        System.out.println("======================================================\n");

       

        int[] kaisu = settei5Ince.RoundMethod();
        int aikoN = settei5Ince.AikoMethod();
        int[] point = settei5Ince.PointMethod();


        List<String> playerList = toip5.Player();
        List<String> playerList2;
        int playerSize;
        List<Integer> countHako = new ArrayList<>();

        

         System.out.println("\n＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊\n");

        System.out.println("じゃんけんの大会を始めます。");
        System.out.println("ルールは１試合" + kaisu[0] + "ラウンド、１ラウンド " + kaisu[1] + "プレイとします。");
        System.out.println(aikoN + "回連続で引き分けになった場合、全員を引き分けとします。\n");

        System.out.println("\n＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊\n");

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

                 
                    System.out.println("【　" + game + " 試合目/ " + round + " ラウンド/ " + play + " プレイ目　】\n" );
                    System.out.println("======================================================\n");

                    countt = match5Ince.MatchMethod(janken5Ince, aikoN, point, PlayresultInce, toi5pInce, ruru5Ince);
                    //各プレイヤーのポイント


                    for (int i = 0; i < playerSize; i++){ //playごとにポイントを合算していく

                        countHako.add(i) = countHako.get(i) + countt[i];
                    }

                    for (int i = 0; i < playerSize; i++) {

                    System.out.println(playerList2.get(i) + "に" + countt[i] + "ポイント");

                    }

                    
                    System.out.println("======================================================\n");

                    if (match5Ince.lusers == 1) {

                        break;

                    }

                    play ++;
                }

                System.out.println("【" + round + "ラウンド目 中間発表 】");

                List<String> playerList = playResult.GoodBy();

                //playerList.add(toi5pInce.Player());

                for (int i = 0; i < countt.length; i ++) {

                    System.out.println(playerList.get(i) + "：" + countt[i] + "ポイント");
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

        

        System.out.println("【 試合終了 】\n");

        System.out.println("======================================================\n");

        

        }





        





    


    }
