import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class toi4 {
    public static void main (String[] args) {
        
        try {

            File file = new File("toi4.txt"); 
            FileWriter file2 = new FileWriter("toi4o.txt"); 
            PrintWriter pw = new PrintWriter(file2);
            

            if (!file.exists()) {
                System.out.print("�t�@�C�������݂��܂���");
                return;
            }
            
             // BufferedReader�N���X��readLine���\�b�h���g����1�s���ǂݍ��ݕ\������
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String data;

            int i = 1;

            while ((data = bufferedReader.readLine()) != null) {

                pw.println("[" + i + "]" + data);
                i++;
                
            }

            pw.close();
            //file.close();�J���ĂȂ�����v��Ȃ�
            file2.close();
            bufferedReader.close();
            fileReader.close();

           
            
            }catch(Exception e){
                
                System.out.println("��O���������܂����B\n");
                System.out.println(e);
                
            }
                
    }
                
                
}