import java.util.Scanner;

public class FunctionAndMethod {
    // public static void printName(String name ){
    //     System.out.println(name);
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     String name=sc.nextLine();
    //     printName(name);
    //     sc.close();
        
    // }

    // //Add two num.
    // public static int AddTwoNum(int a, int b){
    //     int sum=a+b;
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int sum= AddTwoNum(a, b);
    //     System.out.println("sum is:"+ sum);
    //     sc.close();  
    // }

    //factorial.
    public static void factorialNum(int n){
        if(n<0){System.out.println("invalide number");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("factorial is :"+ factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorialNum(n);
        sc.close();
    }
    
}
