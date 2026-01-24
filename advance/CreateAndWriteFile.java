package advance;

// import java.io.File;
import java.io.FileWriter;
// import java.io.IOException; // file create er jonno ai 2 ta commentout kore nao

public class CreateAndWriteFile {
    // public static void main(String[] args) throws IOException {
    //     File myFile = new File("saif.txt");
    //     // myFile.createNewFile();
    //     if(myFile.createNewFile()){
    //         System.out.println("file created");
    //     }else{
    //         System.out.println("already existed");
    //     }

    public static void main(String[] args) {
        try{
            FileWriter myFW=new FileWriter("saif2.txt");
            myFW.write("this is my 2nd file.and i write here something . ");
            myFW.close();

        }catch(Exception e){
            System.out.println("erreor find:"+e);
        }
    }
}
