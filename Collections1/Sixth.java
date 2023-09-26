package Collections1;

import java.util.ArrayList;
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();
        while(true){
            int a=sc.nextInt();
            if(a==0){
                break;
            }
            a1.add(a);

        }
        sc.close();

        int max = a1.get(0); 

        for (int i = 1; i < a1.size(); i++) {
            if (a1.get(i) > max) {
                max = a1.get(i);
            }
        }

        System.out.println("Maximum element in the ArrayList: " + max);
    }
}

