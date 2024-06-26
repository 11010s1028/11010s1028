import java.util.*;

public class sinpan5 {
    public int[] SinpanMethod(int[] handMatch,List<String> playerList){

      //toi5p toi5pInce2 = new toi5p();
    
    int[] g_c_p = handMatch; // 出された手が人数分入っている
    int gcps = 0;

      // int handP1 = handMatch[0];
      // int handP2 = handMatch[1];
      // int handP3 = handMatch[2];




      // ５人でできるじゃんけんのシステムを作ってください

    for (int i = 0; i < g_c_p.length; i++) {

      if (g_c_p[i] == 18) {

        System.out.println(playerList.get(i) + "が出した手：グー\n");

      } else if (g_c_p[i] == 4) {

        System.out.println(playerList.get(i) + "が出した手：チョキ\n");

      } else if (g_c_p[i] == 9) {

        System.out.println(playerList.get(i) + "が出した手：パー\n");

      }

      gcps |= g_c_p[i];

      //gcps = gcps & (gcps>>1);

      System.out.println(gcps);
      
      
      
      }

      int win_hand = gcps & (2 + 4 + 8) & (gcps >> 1) & ~(gcps << 1);

      System.out.println(win_hand);

      int[] results = new int[g_c_p.length];

      for (int i = 0; i < g_c_p.length; i ++){

        if (win_hand == 0) {

          results[i] = 0;

        } else if ((win_hand & g_c_p[i]) != 0){

          results[i] = 1;

        } else {

          results[i] = 2;

        }

      }
     

      return results;

      

        

    }
}