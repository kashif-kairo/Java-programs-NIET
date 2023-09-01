
import java.util.Scanner;
public class Prime {
    static boolean prime(int n){

        for(int i =2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s , e;
        System.out.println("Enter the starting number");
        s = sc.nextInt();
        System.out.println("Enter the starting number");
        e = sc.nextInt();
        sc.close();
        for(int i =s; i<=e;i++){
            if(prime(i)){

                System.out.println(i+" is prime number");
            }
        }

    }
    
}
