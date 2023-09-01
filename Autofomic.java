import java.util.Scanner;
public class Autofomic {
    public static void main(String[] args){
        int n ;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int r =n%100;
        boolean a =false;
        for(int i =1;i<=9;i++){
            if(r/i==i){
                a=true;
                break;
            }

        }
        if(a){
            System.out.println("Autonomic number");
        }
        else{
             System.out.println(" Not Autonomic number");           
        }
    }
}
