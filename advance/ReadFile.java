package advance;

import java.io.File;
// import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try{
            File file1 = new File("saif2.txt");
            Scanner sc=new Scanner(file1);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data); 
            }
            sc.close();
        }catch(Exception e){
            System.out.println("error finding ,"+e);
        }
    }
}

