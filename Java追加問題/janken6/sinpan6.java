import java.util.*;


public class sinpan6 {
    public int[] SinpanMethod(int[] handMatch, List<String> Player){

      //toi6p toi6pInce2 = new toi6p();
    
    int[] g_c_p = handMatch; // �o���ꂽ�肪�l���������Ă���
    int gcps = 0;

      // int handP1 = handMatch[0];
      // int handP2 = handMatch[1];
      // int handP3 = handMatch[2];




      // �T�l�łł��邶��񂯂�̃V�X�e��������Ă�������

    for (int i = 0; i < g_c_p.length; i++) {

      if (g_c_p[i] == 18) {

        System.out.println(Player.get(i) + "���o������\n�O�[\n");

      } else if (g_c_p[i] == 4) {

        System.out.println(Player.get(i) + "���o������\n�`���L\n");

      } else if (g_c_p[i] == 9) {

        System.out.println(Player.get(i) + "���o������\n�p�[\n");

      }

      gcps |= g_c_p[i];

      //gcps = gcps & (gcps>>1);

      
      
      
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