public class toi1p {

     String player1 = "ロボット";
     String player2 = "人間";

    public void Player() {

        System.out.println("\nPlayer1は" + player1 + "です。");
        System.out.println("Player2は" + player2 + "です。\n");
        
        } 

        public void PlayerJan(int action2,janken janken) {

  
       // janken janken = new janken();//ここ

          String hand1 ;
          String hand2 ;

        
        int action1 = janken.p1;

        System.out.println("テストaction1= " + action1);
         System.out.println("テストaction2= " + action2);

        switch (action1) {
            case 1:
                hand1  = "グー";
                break;
            
            case 2:
                hand1 = "チョキ";
                break;
            case 3:
                hand1 = "パー";
                break;
     
            default:
                hand1 = "ああ";
                break;
        } 

        switch (action2) {
            case 1:
                hand2  = "グー";
                break;
            
            case 2:
                hand2 = "チョキ";
                break;

            case 3:
                hand2 = "パー";
                break;
     
            default:
                hand2 = "ああ";
                break; 
        }
        
        System.out.println(player1 + "が" + hand1 + "を出しました。" );
        System.out.println(player2 + "が" + hand2 + "を出しました。\n" );

        }
   
}