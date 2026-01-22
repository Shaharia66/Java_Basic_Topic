
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int[] marks=new int[4];
        // marks[0]=50;
        // marks[1]=55;
        // marks[2]=70;
        // marks[3]=80;
        // for(int i=0;i<4;i++){
        //     System.out.println(marks[i ]);
        // }

        // Scanner sc= new Scanner(System.in);
        // int size =sc.nextInt();
        // int numbers[]=new int[size];
        // for(int i=0;i<size;i++){
        //     numbers[i]=sc.nextInt();
        // }
        // for(int i=0;i<size;i++){
        //     System.out.println(numbers[i]);
        // }
        // sc.close();


        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns =sc.nextInt();
        int[][] numbers =new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(numbers[i][j]==x){
                    System.out.println("x is found at (" + i+","+j+")");
                }
            }
        }
        sc.close();
    }
    
}
