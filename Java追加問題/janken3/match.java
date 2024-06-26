public class match {

    public int count1 = 0;
    public int count2 = 0;  

    public void MatchMethod(janken3 janken3){

        toi3p toi3pInce = new toi3p();

        sinpan sinpanInce = new sinpan();


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
            }

            
        } while (resultMatch == 3);

        
    }
}