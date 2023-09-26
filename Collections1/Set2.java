package Collections1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        ArrayList<Integer> en = new ArrayList<>();
        en.add(2);
        en.add(3);
        en.add(4);
        en.add(5);
        en.add(6);
        en.add(7);
        System.out.println("ArrayList : "+en);
        Set<Integer> e = new LinkedHashSet<>(en);
        System.out.println("Linked HashSet: "+e);
    }
}
