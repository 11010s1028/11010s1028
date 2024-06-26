import java.util.Random;

public class janken {


    public int Action(){

      Random random = new Random();

      int hands = random.nextInt(3)+1;

      return hands;

    }

         int result;

    int random2 = Action();
    int p1 = random2;

    public int Result(int p2){

        //toi1p toi1p = new toi1p();
       //toi1 toi1 = new toi1();

        
   
     
            result = 0;

          if (p1 == p2) {

            System.out.println("テストaction1= " + p1);
            System.out.println("テストaction2= " + p2);

            
            
          } else if (p1 == 1 && p2 == 2) {

            result = 1;
            System.out.println("テストaction1= " + p1);
            System.out.println("テストaction2= " + p2);

          } else if (p1 == 1 && p2 == 3) {

            result = 2;
            System.out.println("テストaction1= " + p1);
            System.out.println("テストaction2= " + p2);

          } else if (p1 == 2 && p2 == 1) {

            result = 2;
            System.out.println("テストaction1= " + p1);
            System.out.println("テストaction2= " + p2);

          } else if (p1 == 2 && p2 == 3) {

            result = 1;
            System.out.println("テストaction1= " + p1);
            System.out.println("テストaction2= " + p2);
            
          }  else if (p1 == 3 && p2 == 1) {

            result = 1;
            System.out.println("テストaction1= " + p1);
            System.out.println("テストaction2= " + p2);

          } else if (p1 == 3 && p2 == 2) {

            result = 2;
            System.out.println("テストaction1= " + p1);
            System.out.println("テストaction2= " + p2);

          }


        return result;

    }
}