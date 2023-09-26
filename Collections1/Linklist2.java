package Collections1;

import java.util.LinkedList;
import java.util.List;

// write a java code to implement elements in the odd elements by using Linked
public class Linklist2 {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(25);
        l1.add(32);
        l1.add(45);
        l1.add(10);
        l1.add(12);
        for(int i =0;i<l1.size();i++){
            if((l1.get(i))%2==1){
                System.out.print(l1.get(i)+" ");
            }
        }
    }
}
