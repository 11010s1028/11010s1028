import java.awt.event.FocusListener;
import java.util.*;

public class ruru6 {
    public void RuruMethod(toi6p toi6pInce, ruru6 ruru6Ince) {

        

        janken6 janken6Ince = new janken6();

        match6 match6Ince = new match6();

        settei6 settei6Ince = new settei6();

        playResult PlayresultInce = new playResult();     

        

        int game = 1;

        System.out.println("\n【じゃんけん大会】");
        System.out.println("======================================================\n");

       

        int[] kaisu = settei6Ince.RoundMethod();
        int aikoN = settei6Ince.AikoMethod();
        int[] point = settei6Ince.PointMethod();

        int playerSize;
        List<Integer> countHako = new ArrayList<>();

        

         System.out.println("\n＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊\n");

        System.out.println("じゃんけんの大会を始めます。");
        System.out.println("ルールは１試合" + kaisu[0] + "ラウンド、１ラウンド " + kaisu[1] + "プレイとします。");
        System.out.println(aikoN + "回連続で引き分けになった場合、全員を引き分けとします。\n");

        System.out.println("\n＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊\n");

       
        List<String> player = toi6pInce.Player();

            int round = 1;

             List<int[]> roundResult = new ArrayList<int[]>();


            while (round <= kaisu[0]) {


                int play = 1;


                int[] countt = new int[player.size()];

              

                while (play <= kaisu[1] ) {

                 
                    System.out.println("【　" + game + " 試合目/ " + round + " ラウンド/ " + play + " プレイ目　】\n" );
                    System.out.println("======================================================\n");


                    countt = match6Ince.MatchMethod(janken6Ince, aikoN, point, PlayresultInce, player, ruru6Ince);
                    //各プレイヤーのポイント

                   
                    roundResult.add(countt);//ラウンドごとのポイント結果

                    if (play == 1 && round == 1) {

                        for (int i = 0; i < player.size(); i++){ //playごとにポイントを合算していく

                        countHako.add(countt[i]);
                       
                        }
                        
                    } else {
                        
                        for (int i = 0; i < player.size(); i++){ //playごとにポイントを合算していく

                        countHako.set(i, countHako.get(i) + countt[i]);
                       
                        }

                    }


                    for (int i = 0; i < player.size(); i++) {

                    System.out.println(player.get(i) + "に" + countt[i] + "ポイント");

                    }

                    
                    System.out.println("======================================================\n");

                    if (match6Ince.lusers == 1) {

                        break;

                    }

                    play ++;
                }

              

                System.out.println("【" + round + "ラウンド目 中間発表 】");

                

               

                for (int i = 0; i < countt.length; i ++) {

                    System.out.println(player.get(i) + "：" + countHako.get(i) + "ポイント");
                }

                

          

                System.out.println("\n======================================================\n");

         

                
             

             //     if (player.size() == 1) {

                //         System.out.println(player.get(0) + "は一人になったため優勝！！！");

                //         break;
             //     }

                round ++;
            }

         

                System.out.println("【 最終結果 】");

                  
                   

                
                
                playResult.GoodBy(match6Ince, player, countHako, janken6Ince, aikoN, point, PlayresultInce, ruru6Ince, roundResult, kaisu);



           

           

                System.out.println("\n======================================================\n");


                    

        System.out.println("【 試合終了 】\n");

        System.out.println("======================================================\n");

        

        }

    


    }
