public class toi2p {

     String player1 = "���{�b�g";
     String player2 = "�l��";

    public void Player() {

        System.out.println("\nPlayer1��" + player1 + "�ł��B");
        System.out.println("Player2��" + player2 + "�ł��B\n");
        
        } 

        public void PlayerJan(int action2,janken2 janken2) {

  
       // janken janken = new janken();//����

          String hand1 ;
          String hand2 ;

        
        int action1 = janken2.Action();


        switch (action1) {
            case 1:
                hand1  = "�O�[";
                break;
            
            case 2:
                hand1 = "�`���L";
                break;
            case 3:
                hand1 = "�p�[";
                break;
     
            default:
                hand1 = "�G���[";
                break;
        } 

        switch (action2) {
            case 1:
                hand2  = "�O�[";
                break;
            
            case 2:
                hand2 = "�`���L";
                break;

            case 3:
                hand2 = "�p�[";
                break;
     
            default:
                hand2 = "�G���[";
                break; 
        }
        
        System.out.println(player1 + "��" + hand1 + "���o���܂����B" );
        System.out.println(player2 + "��" + hand2 + "���o���܂����B\n" );

        }
   
}