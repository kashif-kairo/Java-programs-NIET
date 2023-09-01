import java.util.*;
public class Sumofn {
    public static void main(String[] args){
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        n=sc.nextInt();
        System.out.println("Enter the Elements  of Array : ");
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            int a =sc.nextInt();
            arr[i]=a;
        }
        sc.close();
        int p =1;
        for(int j =0;j<n;j++){
            if(arr[j]%2==1){
                p=p*arr[j];
            }
        }
        System.out.println("Product of odd numbers of Arrays : "+p);




    
}
}
