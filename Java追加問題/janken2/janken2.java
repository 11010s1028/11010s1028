import java.util.Random;

public class janken2 {


    public int Action(){

      Random random = new Random();

      int hands = random.nextInt(3)+1;

      p1 = hands;

      return hands;

    }

         int result = 4;



    // int random2 = Action();
        int p1; 

    public int Result(int p2){

        //toi1p toi1p = new toi1p();
       //toi1 toi1 = new toi1();

      //  if (result == 4 || result == 0) {

      //  random2 = Action();
      //  p1 = random2;

      // } 

           
            result = 0;

          if (p1 == p2) {

            

            
            
          } else if (p1 == 1 && p2 == 2) {

            result = 1;
            
          } else if (p1 == 1 && p2 == 3) {

            result = 2;
           

          } else if (p1 == 2 && p2 == 1) {

            result = 2;
            

          } else if (p1 == 2 && p2 == 3) {

            result = 1;
           
            
          }  else if (p1 == 3 && p2 == 1) {

            result = 1;
            

          } else if (p1 == 3 && p2 == 2) {

            result = 2;
            
          }


        return result;

    }
}