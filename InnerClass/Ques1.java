package InnerClass;
import java.util.Scanner;
class Outer{
    void print(){
        System.out.println("Even number");
    }
    class Inner{
        void print(){
            System.out.println("Odd number");
        }
    }
}
public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();
        sc.close();
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        if(a%2==0){
            o.print();
        }
        else{
            i.print();

        }
    }
}
// An