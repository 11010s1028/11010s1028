import java.util.Scanner; //�W������

public class toi2 {
    public static void main (String[] args) {

        toi2p toi2p = new toi2p();
        janken2 janken2 = new janken2();//����

        toi2p.Player();//�v���C���[���\��

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println((i+1) + "���E���h��" + "/�P�O���E���h");

        Scanner scan = new Scanner(System.in);//�W������

        System.out.println("���Ȃ����o�������͂��Ă��������B");
         System.out.println("�O�[�F�P�@�`���L�F�Q�@�p�[�F�R\n");

        String str = scan.next(); //�W������

        int input = Integer.parseInt(str); //�W�����͂�int�^�ϊ�

       

        if ((input == 1) || (input == 2) || (input == 3)) {

            toi2p.PlayerJan(input,janken2);
                    
            int handResult = janken2.Result(input);
 
            while (handResult == 0) {

                System.out.println("�������ł���I\n");
                System.out.println("���ɂ��Ȃ����o�������͂��Ă��������B");
                System.out.println("�O�[�F�P�@�`���L�F�Q�@�p�[�F�R\n");

                str = scan.next();
                input = Integer.parseInt(str);

                janken2.Action();

                toi2p.PlayerJan(input,janken2);

                handResult = janken2.Result(input);

                
                }

                if (handResult == 1) {

                    System.out.println(toi2p.player1 + "�ɂP�|�C���g\n");

                    count1++;


                } else if (handResult == 2) {

                    System.out.println(toi2p.player2 + "�ɂP�|�C���g\n");

                    count2++;

                }
                
                System.out.println(toi2p.player1 + ":" + count1 + "�|�C���g");
                System.out.println(toi2p.player2 + ":" + count2 + "�|�C���g\n");



        }   else {

             System.out.println("�G���[�I�I�I�@��蒼���Ă��������B\n");
             break;


        }

        }

        if (count1 > count2) {

            System.out.println(toi2p.player1 + "�̏����I\n");

            double parse1;

            double countt1 = (double)count1;
            double countt2 = (double)count2;

            parse1 = ((countt2) / (countt1 + countt2)) * 100;
            System.out.printf("�����F%2.2f��\n\n", parse1);

        } else if (count1 < count2) {

            System.out.println(toi2p.player2 + "�̏����I\n");

            double parse2;

            double countt1 = (double)count1;
            double countt2 = (double)count2;

            parse2 = ((countt2) / (countt1 + countt2)) * 100;
            System.out.printf("�����F%2.2f��\n\n", parse2);

        } else if (count1 == count2) {
            System.out.println("���������I�I�I�I\n");
        }


       

    

        



    }
}