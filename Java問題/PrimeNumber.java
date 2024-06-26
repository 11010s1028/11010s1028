import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public List<Integer> generate (Integer number) {

        
        List<Integer> generateList = new ArrayList<Integer>();

        //‘f””»’èFŒvZ‚ª‚Q‰ñ‚Ì‚à‚Ì‚ğŠi”[‚·‚éi‚P‚Æ©•ª©g‚Å‚µ‚©Š„‚èØ‚ê‚È‚¢‚½‚ßj

        int n = 2; //‘f””»’è‚Ì‘ÎÛ
        int count = 0;//‚Q‰ñ‚©”»’è‚·‚é‘ÎÛ
        

        for (int i = 0; i < number; n++) { //number‚Í‘f”‚ÌŒÂ”‚ğw’è‚·‚éˆø”

            count = 0; //count‚ÌƒŠƒZƒbƒg

            for (int j = 1; j <= n; j++){//‚P‚©‚ç©•ª©g‚Ì”‚Ü‚ÅŠ„‚èZ

                if (n % j == 0) {
                    count++;
                }

            }
            if(count == 2) {
                generateList.add(n);

                i++;
            }


        }
        
        return generateList;

        //Integer result;

        //result = generateList.get(number);
        

        
    }
}