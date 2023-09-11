package InnerClass;

import java.util.Scanner;

// write a java code to print the given number in reverse using local inner class

class Outter1 {

    int reverse(int x) {
        class Inner {
            int display(int a) {
                if (a >= 0) {
                    int sum = 0;
                    while (a > 0) {
                        int r = a % 10;
                        sum = sum * 10 + r;
                        a = a / 10;
                    }
                    return sum;
                } else {
                    a = a * -1;
                    int sum = 0;
                    while (a > 0) {
                        int r = a % 10;
                        sum = sum * 10 + r;
                        a = a / 10;
                    }
                    return (sum);
                }
            }
        }

        Inner i = new Inner();
        int j = i.display(x);
        return j;
    }
}

public class Q3 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        sc.close();
        Outter1 ob = new Outter1();
        int n = ob.reverse(x);
        String s=Integer.toString(n);
        System.out.println(s+'-');
    }
}
