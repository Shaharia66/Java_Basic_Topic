import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int count=sc.nextInt();
        // for(int counter=0;counter<count;counter++){
        //     // System.out.println("counter");
        //     System.out.println(counter);
        // }
        // sc.close();
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(i*n);
        }
        sc.close();

    }
}

