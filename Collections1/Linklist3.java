package Collections1;
import java.util.Queue;
import java.util.*;
public class Linklist3{
    public static void main(String[] args) {
        Queue<String> qs = new LinkedList<>();
        qs.add("Java");
        qs.add("Python");
        qs.add("C++");
        System.out.println("Elements: "+qs);
        String str = qs.peek();
        System.out.println("Top element is : "+str);
        String s = qs.poll();
        System.out.println("Removed Eleemnt is : "+s);
        System.out.println("After polling: "+qs);
        qs.add("DSA");
        System.out.println(qs);
        qs.offer("Programing");
        System.out.println("At end: "+qs);
    }
}
