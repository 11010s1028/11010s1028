import java.util.*;


public class sinpan5 {
    public int[] SinpanMethod(int[] handMatch, List<String> Player){

    
    
    int[] g_c_p = handMatch; // �o���ꂽ�肪�l���������Ă���
    int gcps = 0;



    for (int i = 0; i < g_c_p.length; i++) {

      if (g_c_p[i] == 18) {

        System.out.println(Player.get(i) + "���o������F�O�[\n");

      } else if (g_c_p[i] == 4) {

        System.out.println(Player.get(i) + "���o������F�`���L\n");

      } else if (g_c_p[i] == 9) {

        System.out.println(Player.get(i) + "���o������F�p�[\n");

      }

      gcps |= g_c_p[i];

   

      
      
      
      }

      int win_hand = gcps & (2 + 4 + 8) & (gcps >> 1) & ~(gcps << 1);


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