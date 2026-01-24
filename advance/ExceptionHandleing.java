// package advance;

// public class ExceptionHandleing {
//     public static void main(String[] args) {
//         try{
//         // int x =10;
//         // int y=0;
//         // int res=x/y;
//         // System.out.println("Result is :"+res);
//         int[] a= new int[4];
//         a[5]=56;
//         // }catch(ArithmeticException e1){
//         //     System.out.println("Exception:"+e1);
//         // }catch(ArrayIndexOutOfBoundsException e2){
//         //     System.out.println("Exception :"+e2);

//         // eksathe 3 ta rekhe dileo just first er ta dekhato


//         }catch(Exception e3){
//             System.out.println("Exception :"+e3);
//         }
//         finally{
//             System.out.println("this is the last line.");
//         }
//     }
    
// }


//THROW AND THROWS..

package advance;

public class ExceptionHandleing{
    public static void main(String[] args) {
        // try{
        //     int a=10;
        //     System.out.println(10/2);
        //     if(a==10){
        //         throw new ArithmeticException("test");
        //     }
        // }catch(ArithmeticException e){
        //     System.out.println("find some error:"+e);
        // }

        try{
            checkAge();
        }catch(ArithmeticException e){
            System.out.println("find error:"+e);
        }
    }
    public static void checkAge() throws ArithmeticException{

        System.out.println(18/0);
    }
}
