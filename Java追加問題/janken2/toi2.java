import java.util.Scanner; //標準入力

public class toi2 {
    public static void main (String[] args) {

        toi2p toi2p = new toi2p();
        janken2 janken2 = new janken2();//ここ

        toi2p.Player();//プレイヤー名表示

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println((i+1) + "ラウンド目" + "/１０ラウンド");

        Scanner scan = new Scanner(System.in);//標準入力

        System.out.println("あなたが出す手を入力してください。");
         System.out.println("グー：１　チョキ：２　パー：３\n");

        String str = scan.next(); //標準入力

        int input = Integer.parseInt(str); //標準入力のint型変換

       

        if ((input == 1) || (input == 2) || (input == 3)) {

            toi2p.PlayerJan(input,janken2);
                    
            int handResult = janken2.Result(input);
 
            while (handResult == 0) {

                System.out.println("あいこでしょ！\n");
                System.out.println("次にあなたが出す手を入力してください。");
                System.out.println("グー：１　チョキ：２　パー：３\n");

                str = scan.next();
                input = Integer.parseInt(str);

                janken2.Action();

                toi2p.PlayerJan(input,janken2);

                handResult = janken2.Result(input);

                
                }

                if (handResult == 1) {

                    System.out.println(toi2p.player1 + "に１ポイント\n");

                    count1++;


                } else if (handResult == 2) {

                    System.out.println(toi2p.player2 + "に１ポイント\n");

                    count2++;

                }
                
                System.out.println(toi2p.player1 + ":" + count1 + "ポイント");
                System.out.println(toi2p.player2 + ":" + count2 + "ポイント\n");



        }   else {

             System.out.println("エラー！！！　やり直してください。\n");
             break;


        }

        }

        if (count1 > count2) {

            System.out.println(toi2p.player1 + "の勝ち！\n");

            double parse1;

            double countt1 = (double)count1;
            double countt2 = (double)count2;

            parse1 = ((countt2) / (countt1 + countt2)) * 100;
            System.out.printf("勝率：%2.2f％\n\n", parse1);

        } else if (count1 < count2) {

            System.out.println(toi2p.player2 + "の勝ち！\n");

            double parse2;

            double countt1 = (double)count1;
            double countt2 = (double)count2;

            parse2 = ((countt2) / (countt1 + countt2)) * 100;
            System.out.printf("勝率：%2.2f％\n\n", parse2);

        } else if (count1 == count2) {
            System.out.println("引き分け！！！！\n");
        }


       

    

        



    }
}