import java.util.*;

public class playResult {

     

    

    public int[][] PlayresultMethod(match5 match5Ince,int[] countt,janken5 janken5Ince,int aikoN,int[] point, playResult PlayresultInce, toi5p toi5pInce, ruru5 ruru5Ince) {


        //ここでカウントを呼ぶ

        // int[] countt = match5Ince.count;

        int countSize = (toi5pInce.Player()).size();

        // int[] max = new ArrayList<>();
        // int[] min = new ArrayList<>();

        int count1 = 0;
        int count2 = 0;

        int max = countt[0];
        int min = countt[0];

        for (int i = 1; i < countSize; i++) {

            if(max < countt[i]) {
             
                max = countt[i];

            } else if (min > countt[i]) {

                min = countt[i];
                

            }
        }

        int j = 0; //int型の初期化

        

        for (int i = 0; j < countt.length;) { //一番ポイントが高い人が何人か
            for (j = 0; j < countt.length; j++) {

            if (max == countt[j]) {

                
                //winList [i] = j;
                count1 ++;
                i++;

                break;

                
            }

            }
        }

        for (int i = 0; j < countt.length;) { //一番ポイントが低い人が何人か
            for (j = 0; j < countt.length; j++) {

            if (min == countt[j]) {

                
                //loseList [i] = j;
                count2 ++;
                i++;

                break;

                
            }

            }

           
        }

        int[] win = new int[count1];
        int[] lose = new int[count2];

        for (int i = 0; j < countt.length;) { //一番ポイントが高い人が何人か
            for (j = 0; j < countt.length; j++) {

            if (max == countt[j]) {

                
                win [i] = j;
                //count1 ++;
                i++;

                break;

                
            }

            }
        }

        for (int i = 0; j < countt.length;) { //一番ポイントが低い人が何人か
            for (j = 0; j < countt.length; j++) {

            if (min == countt[j]) {

                
                lose [i] = j;
                //count2 ++;
                i++;

                break;

                
            }

            }

           
        }

        
        int[][] result = new int[2][];

        result[0] = win;
        result[1] = lose;
       

        // result.setVegeInfo(winList);//リストにリストを入れるための処理？
        // result.setVegeInfo(loseList);

        // result.addAll(winList); //リストにリストを追加
        // result.addAll(loseList);

        

       

        return result;

    }

    public List<String> GoodBy(match5 match5Ince, toi5p toi5pInce, int[] countt, janken5 janken5Ince, int aikoN, int[] point, playResult PlayresultInce, ruru5 ruru5Ince) {

        //toi5p toi5pInce = new toi5p();

        // List<String> playerList = toi5pInce.Player();

     

        int[][] result = PlayresultMethod(match5Ince, countt, janken5Ince, aikoN, point, PlayresultInce, toi5pInce, ruru5Ince);

        
        int sizeLoser = result[1].length;

        int goodby;

       


        if (sizeLoser == 1){

            goodby = result[1][0];

            newPlayer = newPlayer.remove(goodby);
            

        } else {

            // newPlayer = toi5pInce.Player();

        }


       return newPlayer;

    }

  

}