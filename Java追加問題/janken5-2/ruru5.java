import java.util.*;

public class ruru5 {
    public void RuruMethod(toi5p toi5pInce, ruru5 ruru5Ince) { //全体の流れを表示している。

    //matuch5、settei5、playResultの各メソッドの呼び出し

        

        janken5 janken5Ince = new janken5();

        match5 match5Ince = new match5();

        settei5 settei5Ince = new settei5();

        playResult PlayresultInce = new playResult();     

        

        int game = 1;

        System.out.println("\n　　　　　　　　【じゃんけん大会】");
        System.out.println("======================================================\n");

       

        int[] kaisu = settei5Ince.RoundMethod(); //設定項目を記述するsettei5のメソッドの呼び出し
        int aikoN = settei5Ince.AikoMethod();
        int[] point = settei5Ince.PointMethod();

        int playerSize;
        List<Integer> countHako = new ArrayList<>();

        

         System.out.println("\n＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊\n");

        System.out.println("　　　じゃんけんの大会を始めます。\n");
        System.out.println("　　　　　　　　　　【 ルール 】");
        System.out.println("　　(1) ルールは１試合" + kaisu[0] + "ラウンド、１ラウンド " + kaisu[1] + "プレイ");
        System.out.println("　　(2) " + aikoN + "回連続で引き分けの時、全員に引き分け点を加算");
        System.out.println("　　(3) ラウンドごとに一番得点の低いプレイヤーは脱落\n");
        System.out.println("　　* 最も得点の低いプレイヤーが複数人のとき\n　　　　　　　　　　　　　　　　　　脱落者は無し\n");

        System.out.println("\n＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊\n");

       
        List<String> player = toi5pInce.Player();

            int round = 1;

            while (round <= kaisu[0]) { //ラウンドを指定回数繰り返す


                int play = 1;


                int[] countt = new int[player.size()];

               

                while (play <= kaisu[1] ) {//プレイを指定回数繰り返す

                 
                    System.out.println("　　　【　" + game + " 試合目/ " + round + " ラウンド/ " + play + " プレイ目　】\n" );
                    System.out.println("======================================================\n");


                    countt = match5Ince.MatchMethod(janken5Ince, aikoN, point, PlayresultInce, player, ruru5Ince);
                    //各プレイヤーのポイント

                    if (play == 1 && round == 1) {

                        for (int i = 0; i < player.size(); i++){ //１ラウンド目限定　playごとにポイントを合算していく

                        countHako.add(countt[i]);
                       
                        }
                        
                    } else {
                        
                        for (int i = 0; i < player.size(); i++){ //２ラウンド目以降　playごとにポイントを合算していく

                        countHako.set(i, countHako.get(i) + countt[i]);
                       
                        }

                    }


                    for (int i = 0; i < player.size(); i++) {//プレイごとの各プレイヤーに入る点数表示

                    System.out.println(" >  " + player.get(i) + "に" + countt[i] + "ポイント\n");

                    }

                    
                    System.out.println("======================================================\n");

                    

                    play ++;
                }

              

                System.out.println("　　　　　　　【" + round + "ラウンド目 中間発表 】\n");

                

               

                for (int i = 0; i < countt.length; i ++) { //ラウンド終了時にそれまでの各プレイヤーの総合得点を表示

                    System.out.println("　　　　　　　" + player.get(i) + "：" + countHako.get(i) + "ポイント");
                }
               

          

                System.out.println("\n======================================================\n");

                System.out.printf("\n　　　　　　%d", round);

         
                playResult.GoodBy(match5Ince, player, countHako, janken5Ince, aikoN, point, PlayresultInce, ruru5Ince);
                
               


                if (player.size() == 1) { //脱落者が続き、プレイヤーが一人になってしまった時に表示

                    System.out.println("\n　　　" + player.get(0) + "は１人になったため優勝！！！\n");

                    break;
                }

                round ++;
            }

            if (!(player.size() == 1)) { //すべてのラウンドが終わったときに表示

                System.out.println("　　　　　　　　　　【 最終結果 】");

                  
                   



                   //以下、最終結果を表示するための処理(toi5pにあるプレイヤー情報とcountHakoに入っているプレイヤー情報を結び付けている)


                List<Integer> countHako2 = new ArrayList<>();

                countHako2.addAll(countHako); 


                Collections.sort(countHako2, Collections.reverseOrder());

               

                List<Integer> tyohuku = new ArrayList<Integer>(new LinkedHashSet<Integer>(countHako2)); 


                for (int i = 0; i < tyohuku.size(); i++) {              
                  for (int j = 0; j < player.size(); j++) {

               

                

                  if (countHako.get(j) == tyohuku.get(i)){

                  

                   
                     System.out.println("　　　　　　　" + (i+1) + "位　" + player.get(j) + "：" + tyohuku.get(i) + "ポイント");

                     

                }
                


              }

            }

         

            }

                System.out.println("\n======================================================\n");


                    

        System.out.println("　　　　　　　　　【 試合終了 】\n");

        
        

        }

    


    }
