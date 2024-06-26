import java.util.List;

public class toi6 {
    public static void main(String[] args) {

        PrimeNumber primeNumber = new PrimeNumber();

        int number = 10;

        List<Integer> generateList = primeNumber.generate(number);


        
        for (int i = 0; i < number; i++){

           

            System.out.println( (i+1) + "F" + generateList.get(i));
        } 




    }
}

