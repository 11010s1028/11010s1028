import java.util.*;

public class playResult {

    
    int count = 0;
     

    

    public static int[] PlayresultMethod(match6 match6Ince,List<Integer> countt,janken6 janken6Ince,int aikoN,int[] point, playResult PlayresultInce, List<String> Player, ruru6 ruru6Ince) {

      

        int countSize = (Player).size();

       
        int count1 = 0;
        int count2 = 0;

        int max = countt.get(0);
        int min = countt.get(0);

                


        for (int i = 1; i < countSize; i++) {

           
           
            if(max < countt.get(i)) {
                
             
                max = countt.get(i);

            } else if (min > countt.get(i)) {
               

                min = countt.get(i);
                

            }
        }

        int j = 0; //int�^�̏�����

        

       
            for (j = 0; j < countSize; j++) {

              

                
               if (max == countt.get(j)) {

           

                
       
                    count2 ++;                   

                
                }

            }

      


        //int[] win = new int[count1];//�ő�l�̐l�̐�
        int[] win = new int[count2];//�ő�l�̐l�̐�

       
        

        for (int i = 0; i < win.length; i++) { //��ԃ|�C���g�������l�����l��

    

            for (j = 0; j < countt.size(); j++) {


            if (max == countt.get(j)) {


                
                win [i] = countt.get(j);
                //count2 ++;
                i++;

                break;

                
            }

            }
        

           
        }

        
            

        return win;

    }

    public static void GoodBy(match6 match6Ince, List<String> Player, List<Integer> countt, janken6 janken6Ince, int aikoN, int[] point, playResult PlayresultInce, ruru6 ruru6Ince, List<int[]> roundResult, int[] kaisu) {

        

       
      

        int[] result = PlayresultMethod(match6Ince, countt, janken6Ince, aikoN, point, PlayresultInce, Player, ruru6Ince);

       
        
        int sizeLoser = result.length;

        int goodby;

         int[] roundResult2 = roundResult.get(kaisu[0]);
         
         int lastplayer ;

         


             


        if (sizeLoser == 1){

            goodby = result[0];
            
                for (int j = 0; j < Player.size(); j++) {

               

                

                if (countt.get(j) == goodby){

                  

                   
                     System.out.println("�ŏI���E���h���� 1�ʁ@" + Player.get(j) + "�F" + goodby + "�|�C���g");

                     break;

                     

                }


            

           }

        

          
               

        // } else {


        //     if (countt.get(j) == lastplayer){

                  

                   
        //              System.out.println("�ŏI���E���h���� 1�ʁ@" + Player.get(j) + "�F" + goodby + "�|�C���g");

        //              break;

                     

        //         }


        }





  

                }

}