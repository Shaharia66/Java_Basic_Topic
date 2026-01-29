package dsa;

import java.util.Collections;
// import java.util.Collections;
import java.util.LinkedList;

// class Linkedlist {

//     // Node class
//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     int size=0;

//     Node head; // head of the list

//     // Add element at the beginning
//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//         size++;
//     }

//     // Add element at the end
//     public void addLast(String data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             size++;
//             return;
//         }

//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         temp.next = newNode;
//     }

//      public void deleteFirst() {
//         if (head == null) {
//             System.out.println("List is empty");
//             size--;
//             return;
//         }
//         head = head.next;
//     }

//     // ✅ Delete last node
//     public void deleteLast() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         // If only one node
//         if (head.next == null) {
//             head = null;
//             size--;
//             return;
//         }

//         Node temp = head;
//         while (temp.next.next != null) {
//             temp = temp.next;
//         }

//         temp.next = null;
//     }

//     //getsize
//     public int getSize(){
//         return size;
//     }

//     // Display the linked list
//     public void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // Main method to test
//     public static void main(String[] args) {
//         Linkedlist list = new Linkedlist();

//         list.addFirst("is");
//         list.addFirst("this");
//         list.display();
//         list.addLast("a");
//         list.addLast("list");

//         list.display();

//         list.deleteFirst();
//         list.display();

//         list.deleteLast();
//         list.display();
//         System.out.println("size is:"+list.getSize());
//         list.addFirst("this");
//         list.display();
//         System.out.println("size is:"+list.getSize());

//     }
// }


public class Linkedlist{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //add 
        list.addFirst("is ");
        list.addFirst("This ");
        list.addLast("a");
        list.add("list");
        System.out.println(list);
        list.add(3,"new");
        System.out.println(list);

        //get

        String g1=list.get(2);
        System.out.println(g1);

        //set

        list.set(3,"full");
        System.out.println(list);

        //loops
        for (int i=0;i<list.size();i++){
            //if(list.get(i)==value){
            // sout(value);}
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        System.out.println(list.size());
        // Collections.sort(list);
        // System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}