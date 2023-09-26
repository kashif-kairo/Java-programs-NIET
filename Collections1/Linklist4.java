package Collections1;

import java.util.LinkedList;
import java.util.List;

// write a java code to sort element in reverse order but print element 
public class Linklist4 {
        public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(25);
        l1.add(32);
        l1.add(45);
        l1.add(10);
        l1.add(12);
        for(int i =0; i<l1.size();i++){
            for(int j =i+1;j<l1.size();j++){
                if(l1.get(j)>l1.get(i)){
                    int temp = l1.get(i);
                    l1.set(i,l1.get(j));
                    l1.set(j,temp);

                }
            }
        }
        for(int i =0;i<l1.size();i=i+2){
            System.out.print(l1.get(i)+" ");
        }
}
}
