package Collections1;

import java.util.LinkedList;
import java.util.*;



public class Linklist1 {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(25);
        l1.add(32);
        l1.add(45);
        l1.add(10);
        l1.add(12);
        System.out.println(l1);
        System.out.println("For Each loop");
        for(Integer i:l1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Using Iterator");
        Iterator<Integer> it =l1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("Reverse Iteror");
        ListIterator<Integer> lit = l1.listIterator(l1.size());
        while(lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
        System.out.println();
        l1.set(2,10);
        System.out.println(l1);
        l1.remove(3);
        System.out.println(l1);
        l1.add(3,67);
        System.out.println(l1);
        Collections.addAll(l1, 87,98,9,76,25,43);
        System.out.println(l1);
        System.out.println("First Occurence: "+l1.indexOf(25));
        System.out.println("last Occurence: "+l1.lastIndexOf(25));

    }
}
// write a java code to implement elements in the odd elements by using Linked