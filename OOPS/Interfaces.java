package OOPS;

interface Animal2{
    int eye=2;
    void walk();

}
interface Herbivore{

}
class Horse implements Animal2,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs .");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
    }
}
