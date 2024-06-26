import java.util.*;


public class match6 {

    //toi6p toi6pInce = new toi6p();
    sinpan6 sinpanInce = new sinpan6();

    public int lusers = 0;
    
    
    

    public int[] MatchMethod(janken6 janken6,int aikoN,int[] point,playResult PlayresultInce, List<String> Player, ruru6 ruru6Ince){

        // List<String> playerList = Player;  //ArrayListを受け取る

        //playerList.add(Player);


        int[] count =new int [Player.size()];
        
        int count3 = 0;
        


        System.out.println("\n最初はグー！　じゃんけん……");

        // int resultMatch[];

        int aiko = 0;
             

         do {
           
            System.out.println("ポイ！！！\n");

            int[] handMatch = janken6.Hands(Player);

            int[] resultMatch = sinpanInce.SinpanMethod(handMatch, Player);

            if (!(resultMatch[0] == 0)) {

                aiko = 0;

                for (int i = 0; i < resultMatch.length; i++) {


                  if (resultMatch[i] == 1) {//player[i]が勝った

                     System.out.println(Player.get(i) + "が" + "勝った！\n");
                     count[i] = count[i] + point[0];
                
                
                    } else if (resultMatch[i] == 2) {//player[i]が負けた

                      System.out.println(Player.get(i) + "が" + "負けた。\n");  
                      count[i] = count[i] + point[1];
               
                    }

                }

            } else {

                System.out.println("あいこで...\n");

                aiko = 1;
                

                count3 ++;//あいこの数
            }

            if (count3 >= aikoN){

                System.out.println("引き分けが指定回数続きました。"); 
                
                for (int i = 0; i <Player.size(); i++) {


                  
                  //player[i]はあいこ

                        count[i] = count[i] + point[2];
                 

                } 

                break;
            }

            
        } while (aiko == 1);

        count3 = 0;

        return count;

        
    }
}