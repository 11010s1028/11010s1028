public class toi1p {

     String player1 = "���{�b�g";
     String player2 = "�l��";

    public void Player() {

        System.out.println("\nPlayer1��" + player1 + "�ł��B");
        System.out.println("Player2��" + player2 + "�ł��B\n");
        
        } 

        public void PlayerJan(int action2,janken janken) {

  
       // janken janken = new janken();//����

          String hand1 ;
          String hand2 ;

        
        int action1 = janken.p1;

        System.out.println("�e�X�gaction1= " + action1);
         System.out.println("�e�X�gaction2= " + action2);

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
                hand1 = "����";
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
                hand2 = "����";
                break; 
        }
        
        System.out.println(player1 + "��" + hand1 + "���o���܂����B" );
        System.out.println(player2 + "��" + hand2 + "���o���܂����B\n" );

        }
   
}