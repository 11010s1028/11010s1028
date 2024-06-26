public class match4 {

    public int count1 = 0;
    public int count2 = 0;
    public int count3 = 0;
    public int lusers = 0;

    public void MatchMethod(janken4 janken3){

        toi4p toi3pInce = new toi4p();

        sinpan4 sinpanInce = new sinpan4();


         System.out.println("\n最初はグー！　じゃんけん……");

        int resultMatch;
             

         do {
           
            System.out.println("ポイ！！！\n");

            int[] handMatch = janken3.Hands(toi3pInce);

            resultMatch = sinpanInce.SinpanMethod(handMatch);


            if (resultMatch == 1) {
                
                System.out.println(toi3pInce.player[0] + " の勝ち！");

               

                System.out.println(toi3pInce.player[0] + "に１ポイント\n");

                count1 ++;

                System.out.println("@ " + toi3pInce.player[0] + ": " + count1 + "ポイント");
                System.out.println("@ " + toi3pInce.player[1] + "  : " + count2 + "ポイント\n");


            } else if (resultMatch == 2) {

                System.out.println(toi3pInce.player[1] + " の勝ち！");


                System.out.println(toi3pInce.player[1] + "に１ポイント\n");

                count2 ++;

                System.out.println("@ " + toi3pInce.player[0] + ": " + count1 + "ポイント");
                System.out.println("@ " + toi3pInce.player[1] + "  : " + count2 + "ポイント\n");

               
            } else {

                System.out.println(" あいこで……");

                count3 ++;
            }

            if (count3 > 5){

                System.out.println("中断してください、引き分けが５連続続きました。"); 
                lusers = 1;  

                break;
            }

            
        } while (resultMatch == 3);

        count3 = 0;

        
    }
}