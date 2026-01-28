package dsa;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add element 

        list.add(1);
        list.add(5);
        list.add(4);
        list.add(0);
        System.out.println(list);
        //get element

        int e1= list.get(2);
        System.out.println(e1);
        //add element in between 
        list.add(2,3);
        System.out.println(list);

        //set element
        list.set(4,7);
        System.out.println(list);
        //delete element;
        list.remove(4);
        System.out.println(list);

        //size 
        int size= list.size();
        System.out.println(size);
        //loops in arraylist:
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting in array

        Collections.sort(list);
        System.out.println(list);

    }
}
//end
