import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int a=sc.nextInt();
        // if(a>18){
        //     System.out.println("adult");
        // }else{
        //     System.out.println("not adult");
        // }
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // if(a==0){
        //     System.out.println("equal");
        // }else{
        //     if(b>c){
        //         System.out.println("b is big");
        //     }else{
        //         System.out.println("b is smaller than c");
        //     }
        // }
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.println("red");
            break;
            case 2:System.out.println("yellow");
            break;
            case 3:System.out.println("blue");
            break;
            default:System.out.println("green");
        }
        sc.close();
    }
}