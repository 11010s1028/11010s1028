import java.util.*;

public class match5 {

    //toi5p toi5pInce = new toi5p();
    sinpan5 sinpanInce = new sinpan5();

    public int lusers = 0;
    
    
    

    public int[] MatchMethod(janken5 janken5,int aikoN,int[] point,playResult PlayresultInce, toi5p toi5pInce, ruru5 ruru5Ince){

        List<String> playerList = toi5pInce.Player();  //ArrayListを受け取る

        //playerList.add(toi5pInce.Player());


        int[] count =new int [playerList.size()];
        
        int count3 = 0;
        


        System.out.println("\n最初はグー！　じゃんけん……");

        // int resultMatch[];

        int aiko = 0;
             

         do {
           
            System.out.println("ポイ！！！\n");

            int[] handMatch = janken5.Hands(toi5pInce);

            int[] resultMatch = sinpanInce.SinpanMethod(handMatch, playerList);

            if (!(resultMatch[0] == 0)) {

                aiko = 0;

                for (int i = 0; i < resultMatch.length; i++) {


                  if (resultMatch[i] == 1) {//player[i]が勝った

                     System.out.println(playerList.get(i) + "が" + "勝った！\n");
                     count[i] = count[i] + point[0];
                
                
                    } else if (resultMatch[i] == 2) {//player[i]が負けた

                      System.out.println(playerList.get(i) + "が" + "負けた。\n");  
                      count[i] = count[i] + point[1];
               
                    } else {//player[i]はあいこ

                        count[i] = count[i] + point[2];
                    }

                }

            } else {

                System.out.println("あいこで...\n");

                aiko = 1;
                

                count3 ++;
            }

            if (count3 > aikoN){

                System.out.println("中断してください、引き分けが５連続続きました。"); 
                lusers = 1;  

                break;
            }

            
        } while (aiko == 1);

        count3 = 0;

        return count;

        
    }
}