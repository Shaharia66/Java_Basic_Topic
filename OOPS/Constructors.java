// // non parameterised constructor::
// package OOPS;

// class Student{
//     String name ;
//     int age ;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age );
//     }
//     Student(){
//         System.out.println("constructor called.");
//     }
// }

// public class Constructors {
//     public static void main(String[] args) {
//         Student sd1=new Student();
//         sd1.name="saif";
//         sd1.age=26;
//         sd1.printInfo();
//     }
// }



// // parameterized Constructors::

// package OOPS;

// class Student{
//     String name ;
//     int age ;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age );
//     }
//     Student(String name, int age){
//         System.out.println("constructor called.");
//         this.name=name;
//         this.age=age;
//     }
// }

// public class Constructors {
//     public static void main(String[] args) {
//         Student sd1=new Student("taif",26);
//         sd1.printInfo();
//     }
// }



// // COPY  Constructors::

// package OOPS;

// class Student{
//     String name ;
//     int age ;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age );
//     }
//     Student(Student s2){
//         System.out.println("constructor called.");
//         this.name=s2.name;
//         this.age=s2.age;
//     }
//     Student(){

//     }
// }

// public class Constructors {
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="rahim";
//         s1.age=25;

//         Student s2=new Student(s1);
//         s2.printInfo();
//     }
// }

