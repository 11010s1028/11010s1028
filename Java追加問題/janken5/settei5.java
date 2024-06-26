import java.util.Scanner;

public class settei5 {

    Scanner scan = new Scanner(System.in);//標準入力

    public int[] RoundMethod() {

        System.out.println("ルールの設定です。以下に回答してください。\n");

        System.out.println("一試合で何ラウンドしますか？");

        

        int[] kaisu = new int[2];
        String str3;
        
        while(true){

            try{
             System.out.print("整数を入力して下さい。");
             str3 = scan.next(); //標準入力
             kaisu[0] = Integer.parseInt(str3); //標準入力のint型変換

             System.out.print("\n");
              break;
              }

            catch(NumberFormatException e){
               System.out.println("整数ではありません。");
               break;
               }

            // catch(IOException e){
            //  System.out.println("入力エラー");
            //  break;
            //   }

        }

        System.out.println("1ラウンドで何ゲームしますか？");

        while(true){

            try{
             System.out.print("整数を入力して下さい > ");
             str3 = scan.next(); //標準入力
             kaisu[1] = Integer.parseInt(str3); //標準入力のint型変換

             System.out.print("\n");
              break;
              }

            catch(NumberFormatException e){
               System.out.println("整数ではありません。");
               break;
                }

            // catch(IOException e){
            //  System.out.println("入力エラー");
            //  break;
            //   }

        }


        return kaisu;

    }

    public int AikoMethod() {

        Scanner scan = new Scanner(System.in);//標準入力

        

        System.out.println("何回あいこが連続になったら、プレイヤー全員を失格としますか？");

        int aikoN = 0;
        String str1;
        
        
        while(true){

            try{
             System.out.print("整数を入力して下さい > ");
             str1 = scan.next(); //標準入力
             aikoN = Integer.parseInt(str1); //標準入力のint型変換

             System.out.print("\n");
              break;
              }

            catch(NumberFormatException e){
               System.out.println("整数ではありません。");
               break;
                }

            // catch(IOException e){
            //  System.out.println("入力エラー");
            //  break;
            //   }

        }

        return aikoN;


    }

    public int[] PointMethod() {
        
        System.out.println("勝者、敗者、引き分け、それぞれで入るポイントを何店にしますか");

        int[] point = new int[3];
        String str2;

        for (int i = 0; i < 3; i++) {

            while(true){

                try{

                    if (i == 0) {
                    System.out.print("勝者のポイント > ");
                    } else if (i == 1) {
                    System.out.print("敗者のポイント > ");
                    } else if (i == 2) {
                    System.out.print("引き分けでそれぞれ入るポイント > ");
                    }

                    str2 = scan.next(); //標準入力
                    point[i] = Integer.parseInt(str2); //標準入力のint型変換

                 break;
                } catch(NumberFormatException e) {
                     System.out.println("整数ではありません。");
                     break;
                    }

                    // catch(IOException e){
                    // System.out.println("入力エラー");
                    // break;
                    // }

            }
        }

        System.out.print("\n");

        return point;

    }
}