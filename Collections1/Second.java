package Collections1;

import java.util.ArrayList;
import java.util.*;



public class Second {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(12);
        a1.add(90);
        a1.add(9);
        a1.add(8);
        a1.add(56);
        System.out.println(a1);
        Iterator<Integer> it = a1.iterator();
        System.out.println("Iterating");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
