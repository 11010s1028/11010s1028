import java.util.*;
// import java.util.Iterator;
// import java.util.List;

public class toi5p {

  public List<String> Player() {

      //public String Player() {

      List<String> playerList = new ArrayList<String>();

      playerList.add("ロボット１号");
      playerList.add("ロボット２号");
      playerList.add("ロボット３号");
      // playerList.add("ロボット４号");
      // playerList.add("ロボット５号");

      //  public String[] player = {"ロボット１号", "ロボット２号", "ロボット３号", "ロボット４号","ロボット５号"};



       //return player;
        
    //} 
    return (playerList);

  }

      public void Introduction() {

        List<String> playerList = Player();

        for (int i = 0; i < playerList.size(); i ++) {
          
        System.out.println("\nPlayer1は" + playerList.get(i) + "です。");

        }

        System.out.println("\n");
      }

      
   }