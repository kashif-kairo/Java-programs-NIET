import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    n=sc.nextInt();
    sc.close();
    int temp=n;
    int sum=0;
    while(temp>0){
        int r = temp%10;
        sum=sum*10+r;
        temp=temp/10;
    }
    if(n==sum){
        System.out.println(n+" is a Palindrome");
    }
    else{
        System.out.println(n+" is not a Palindrome");
    }

    
    }
}
