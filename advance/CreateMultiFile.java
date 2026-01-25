package advance;

import java.io.FileWriter;

public class CreateMultiFile {
    public static void main(String[] args) {
        try{
            for(int i=0;i<=10;i++){
                String fileName="advance/files/saifstext"+i+".txt";
                FileWriter w1=new FileWriter(fileName);
                w1.write("this a dummy file for practacing multi file creation."+fileName);
                System.out.println(fileName);
                w1.close();
            }
        }catch(Exception e){
            System.out.println("error find:"+e);
        }
    }
}
