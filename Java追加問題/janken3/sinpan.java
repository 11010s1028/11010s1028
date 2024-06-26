public class sinpan {
    public int SinpanMethod(int[] handMatch){

        

      //int win = 0, lose = 0,aiko = 0;
      int result = 0;

      /*int[] hand;
      int userHand;*/

     /* hand = janken3Ince.Cp();
      userHand = janken3Ince.User(); */


      

      int handP1 = handMatch[0];
      int handP2 = handMatch[1];


      if (handP1 == handP2) {

        result = 3; 

      } else if ((handP1 == 1) && (handP2 == 2)) {

        result = 1;
          
      } else if ((handP1 == 1) && (handP2 == 3)) {

        result = 2;
          
      } else if ((handP1 == 2) && (handP2 == 1)) {

        result = 2;
          
      } else if ((handP1 == 2) && (handP2 == 3)) {

        result = 1;
          
      } else if ((handP1 == 3) && (handP2 == 1)){

        result = 1;

      } else if ((handP1 == 3) && (handP2 == 2)) {

        result = 2;
          
      }

      return result;

      

        

    }
}