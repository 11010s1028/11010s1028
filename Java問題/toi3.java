import java.io.File;

public class toi3 {
    public static void main (String[] args) {
        
        try{
            
            File file = new File("C:/Users/h-hiratsuka/Documents/�����z�����㌤�C2024/Java���C2024/Java��b"); //�p�X���w�肵�Ď擾
            
            File[] list = file.listFiles(); //�t�@�C���̃��X�g�쐬

            System.out.println();


            for (int i = 0; i < list.length; i++) {

                System.out.println("[" + i + "]" + list[i] + "\n");
            }
            
            }catch(Exception e){
                
                System.out.println("��O���������܂����B");
                System.out.println(e);
                
            }
                
    }
                
                
}