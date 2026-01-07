
// //((SINGLE LEVEL INHERITANCE))
// package OOPS;

// class Shape{
//     String color;
//     int length;
//     int height;

//     public void area(){
//         System.out.println("find area");
//     }
// }
// class Triangle extends Shape{
//     public void area(int length, int height){
//         System.out.println((length*height)*1/2);
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         Triangle t1=new Triangle();
//         t1.color="red";
//         t1.area();
//         t1.length=4;
//         t1.height=5;
//         t1.area(t1.length,t1.height);

//     }
// }


// //((MULTI LEVEL INHERITANCE))
// package OOPS;

// class Shape{
//     String color;
//     int length;
//     int height;

//     public void area(){
//         System.out.println("find area");
//     }
// }
// class Triangle extends Shape{
//     public void area(int length, int height){
//         System.out.println((length*height)*1/2);
//     }
// }
// class EquilateralTriangle extends Triangle{
//     public void area2( int length , int height){
//         System.out.println((length*height));
//     }
// }


// public class Inheritance {
//     public static void main(String[] args) {
//         EquilateralTriangle t1= new EquilateralTriangle();
//         t1.color="red";
//         t1.area();
//         t1.length=4;
//         t1.height=5;
//         t1.area(t1.length,t1.height);
//         t1.area2(t1.length,t1.height);
//         System.out.println(t1.color);
//     }
// }


//((HIERARCHIAL LEVEL INHERITANCE))
package OOPS;

class Shape{
    String color;
    int length;
    int height;

    public void area(){
        System.out.println("find area");
    }
}
class Triangle extends Shape{
    public void area(int length, int height){
        System.out.println((length*height)*1/2);
    }
}
class Circle extends Shape{
    public void area(int height){
        System.out.println((3.1416)*height*height);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Circle c1= new Circle();
        Triangle t1=new Triangle();
        t1.color="red";
        c1.color="blue";
        t1.area();
        t1.length=4;
        t1.height=5;
        c1.height=10;
        t1.area(t1.length,t1.height);
        c1.area(c1.height);
        System.out.println(t1.color+ " " +c1.color);
    }
}


//((HYBRIDE INHERITANCE))  DONE