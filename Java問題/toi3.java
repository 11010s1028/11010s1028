import java.io.File;

public class toi3 {
    public static void main (String[] args) {
        
        try{
            
            File file = new File("C:/Users/h-hiratsuka/Documents/部署配属直後研修2024/Java研修2024/Java基礎"); //パスを指定して取得
            
            File[] list = file.listFiles(); //ファイルのリスト作成

            System.out.println();


            for (int i = 0; i < list.length; i++) {

                System.out.println("[" + i + "]" + list[i] + "\n");
            }
            
            }catch(Exception e){
                
                System.out.println("例外が発生しました。");
                System.out.println(e);
                
            }
                
    }
                
                
}