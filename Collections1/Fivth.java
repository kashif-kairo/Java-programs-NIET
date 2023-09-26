package Collections1;

import java.util.ArrayList;
import java.util.Collections;


public class Fivth {
    public static void main(String[] args) {
        ArrayList<String> as = new ArrayList<>();
        as.add("Java");
        as.add("Python");
        as.add("C++");
        Collections.addAll(as, "HTML","C#","JS");
        System.out.println(as);
        System.out.println(as.get(4));
        System.out.println("Update");
        as.set(4, "Algo");
        System.out.println(as);
    }
}
// writre a java code to print maximum element from the array list

