public class match {

    public int count1 = 0;
    public int count2 = 0;  

    public void MatchMethod(janken3 janken3){

        toi3p toi3pInce = new toi3p();

        sinpan sinpanInce = new sinpan();


         System.out.println("\n�ŏ��̓O�[�I�@����񂯂�c�c");

        int resultMatch;
             

         do {
           
            System.out.println("�|�C�I�I�I\n");

            int[] handMatch = janken3.Hands(toi3pInce);

            resultMatch = sinpanInce.SinpanMethod(handMatch);


            if (resultMatch == 1) {
                
                System.out.println(toi3pInce.player[0] + " �̏����I");

               

                System.out.println(toi3pInce.player[0] + "�ɂP�|�C���g\n");

                count1 ++;

                System.out.println("@ " + toi3pInce.player[0] + ": " + count1 + "�|�C���g");
                System.out.println("@ " + toi3pInce.player[1] + "  : " + count2 + "�|�C���g\n");


            } else if (resultMatch == 2) {

                System.out.println(toi3pInce.player[1] + " �̏����I");


                System.out.println(toi3pInce.player[1] + "�ɂP�|�C���g\n");

                count2 ++;

                System.out.println("@ " + toi3pInce.player[0] + ": " + count1 + "�|�C���g");
                System.out.println("@ " + toi3pInce.player[1] + "  : " + count2 + "�|�C���g\n");

               
            } else {

                System.out.println(" �������Łc�c");
            }

            
        } while (resultMatch == 3);

        
    }
}