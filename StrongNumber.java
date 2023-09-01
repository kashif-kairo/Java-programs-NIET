import java.util.*;
public class StrongNumber {
    static int fact(int n){
        int p =1;
        for(int i =n; i>0;i--){
            p=p*i;
        }
        return p;
    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = sc.nextInt();
        sc.close();
        int temp=n;
        int sum =0;
        while(temp>0){
                int r = temp%10;
                sum=sum+fact(r);
                temp=temp/10;
        }
        if(n==sum){
            System.out.println(n+" is Strong Number");
        }
        else{
            System.out.println(n+" is not Strong Number");
        }
        }
    
    
}
