import java.util.*;
// import java.util.Iterator;
// import java.util.List;

public class toi5p {

  public List<String> Player() {

      //public String Player() {

      List<String> playerList = new ArrayList<String>();

      playerList.add("���{�b�g�P��");
      playerList.add("���{�b�g�Q��");
      playerList.add("���{�b�g�R��");
      // playerList.add("���{�b�g�S��");
      // playerList.add("���{�b�g�T��");

      //  public String[] player = {"���{�b�g�P��", "���{�b�g�Q��", "���{�b�g�R��", "���{�b�g�S��","���{�b�g�T��"};



       //return player;
        
    //} 
    return (playerList);

  }

      public void Introduction() {

        List<String> playerList = Player();

        for (int i = 0; i < playerList.size(); i ++) {
          
        System.out.println("\nPlayer1��" + playerList.get(i) + "�ł��B");

        }

        System.out.println("\n");
      }

      
   }