import java.text.SimpleDateFormat;
import java.util.Calendar;


public class toi5 {
    public static void main (String[] args) {

        

        //try {

        

        Calendar calendar = Calendar.getInstance();

        /*calendar.set(Calendar.YEAR,2022);
        calendar.set(Calendar.MONTH,02);
        calendar.set(Calendar.DATE,22);*/

        calendar.set(2022, Calendar.MARCH, 22);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        

        calendar.add(Calendar.DATE, 4);

        System.out.println(sdf.format(calendar.getTime()));

        //calendar.setTime(sdf);
        
        /*} catch(ParseException e) {
            e.printStackTrace();
        }*/


    }
}