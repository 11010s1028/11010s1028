import java.util.*;

public class playResult {

    
int count = 0;
     

    

    public static int[] PlayresultMethod(match5 match5Ince,List<Integer> countt,janken5 janken5Ince,int aikoN,int[] point, playResult PlayresultInce, List<String> Player, ruru5 ruru5Ince) {

      

        int countSize = (Player).size();

       
        int count1 = 0;
        int count2 = 0;

       
        int min = countt.get(0);

        for (int i = 1; i < countSize; i++) {
           
            if (min > countt.get(i)) {
               

                min = countt.get(i);
                

            }
        }

        int j = 0; //int�^�̏�����

        

       
            for (j = 0; j < countSize; j++) {

              

                
               if (min == countt.get(j)) {
                
       
                    count2 ++;                   

                
                }

            }

      


       
        int[] lose = new int[count2];//�ŏ��l�̐l�̐�

       
        

        for (int i = 0; i < lose.length; i++) { //��ԃ|�C���g���Ⴂ�l�����l��

    

            for (j = 0; j < countt.size(); j++) {


            if (min == countt.get(j)) {


                
                lose [i] = j;
                //count2 ++;
                i++;

                break;

                
            }

            }
        

           
        }

        
       
        

 

        return lose;

    }

    public static void GoodBy(match5 match5Ince, List<String> Player, List<Integer> countt, janken5 janken5Ince, int aikoN, int[] point, playResult PlayresultInce, ruru5 ruru5Ince) {

      

        int[] result = PlayresultMethod(match5Ince, countt, janken5Ince, aikoN, point, PlayresultInce, Player, ruru5Ince);

       
        
        int sizeLoser = result.length;

        int goodby;

             


        if (sizeLoser == 1){

            goodby = result[0];

            System.out.println("���E���h�I���A�E���҂����܂�\n�@�@�@�@���_���P�ԏ��Ȃ�" + Player.get(goodby) +  "�͒E���ł�\n\n");

            System.out.println("======================================================\n");

            Player.remove(goodby);
            countt.remove(goodby);

            

        } else {

            System.out.println("���E���h�I���A�E���҂͂��܂���\n\n");
            System.out.println("======================================================\n");

        }





    }

  

}