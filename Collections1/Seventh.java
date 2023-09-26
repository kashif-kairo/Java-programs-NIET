package Collections1;
import java.util.*;

//write a java program to return the element at odd position in a list
public class Seventh {
    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(5,3,11,25,36);
        for(int i =0;i<a1.size();i++){
            if(i%2==1){
                System.out.print(a1.get(i)+" ");
            }
        }

    }

}
