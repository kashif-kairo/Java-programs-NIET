package Collections1;

import java.util.ArrayList;
import java.util.*;


//to print alternate
public class Second2 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(12);
        a1.add(90);
        a1.add(9);
        a1.add(8);
        a1.add(56);
        Iterator<Integer> it = a1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            if(it.hasNext())
                it.next();
            
        }
        System.out.println("Before removing ");
        System.out.println(a1);
        Iterator<Integer> i = a1.iterator();
        Integer str ;
        while(i.hasNext()){
            str = (Integer) i.next();
            if(str == 56){
                i.remove();
            }
        }
        System.out.println("After removing ");
        System.out.println(a1);
    }
}
