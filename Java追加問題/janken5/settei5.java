import java.util.Scanner;

public class settei5 {

    Scanner scan = new Scanner(System.in);//�W������

    public int[] RoundMethod() {

        System.out.println("���[���̐ݒ�ł��B�ȉ��ɉ񓚂��Ă��������B\n");

        System.out.println("�ꎎ���ŉ����E���h���܂����H");

        

        int[] kaisu = new int[2];
        String str3;
        
        while(true){

            try{
             System.out.print("��������͂��ĉ������B");
             str3 = scan.next(); //�W������
             kaisu[0] = Integer.parseInt(str3); //�W�����͂�int�^�ϊ�

             System.out.print("\n");
              break;
              }

            catch(NumberFormatException e){
               System.out.println("�����ł͂���܂���B");
               break;
               }

            // catch(IOException e){
            //  System.out.println("���̓G���[");
            //  break;
            //   }

        }

        System.out.println("1���E���h�ŉ��Q�[�����܂����H");

        while(true){

            try{
             System.out.print("��������͂��ĉ����� > ");
             str3 = scan.next(); //�W������
             kaisu[1] = Integer.parseInt(str3); //�W�����͂�int�^�ϊ�

             System.out.print("\n");
              break;
              }

            catch(NumberFormatException e){
               System.out.println("�����ł͂���܂���B");
               break;
                }

            // catch(IOException e){
            //  System.out.println("���̓G���[");
            //  break;
            //   }

        }


        return kaisu;

    }

    public int AikoMethod() {

        Scanner scan = new Scanner(System.in);//�W������

        

        System.out.println("���񂠂������A���ɂȂ�����A�v���C���[�S�������i�Ƃ��܂����H");

        int aikoN = 0;
        String str1;
        
        
        while(true){

            try{
             System.out.print("��������͂��ĉ����� > ");
             str1 = scan.next(); //�W������
             aikoN = Integer.parseInt(str1); //�W�����͂�int�^�ϊ�

             System.out.print("\n");
              break;
              }

            catch(NumberFormatException e){
               System.out.println("�����ł͂���܂���B");
               break;
                }

            // catch(IOException e){
            //  System.out.println("���̓G���[");
            //  break;
            //   }

        }

        return aikoN;


    }

    public int[] PointMethod() {
        
        System.out.println("���ҁA�s�ҁA���������A���ꂼ��œ���|�C���g�����X�ɂ��܂���");

        int[] point = new int[3];
        String str2;

        for (int i = 0; i < 3; i++) {

            while(true){

                try{

                    if (i == 0) {
                    System.out.print("���҂̃|�C���g > ");
                    } else if (i == 1) {
                    System.out.print("�s�҂̃|�C���g > ");
                    } else if (i == 2) {
                    System.out.print("���������ł��ꂼ�����|�C���g > ");
                    }

                    str2 = scan.next(); //�W������
                    point[i] = Integer.parseInt(str2); //�W�����͂�int�^�ϊ�

                 break;
                } catch(NumberFormatException e) {
                     System.out.println("�����ł͂���܂���B");
                     break;
                    }

                    // catch(IOException e){
                    // System.out.println("���̓G���[");
                    // break;
                    // }

            }
        }

        System.out.print("\n");

        return point;

    }
}