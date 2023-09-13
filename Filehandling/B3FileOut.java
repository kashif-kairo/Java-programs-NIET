package Filehandling;
import java.io.*;
import java.util.Scanner;;
public class B3FileOut {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the single element");
            int n = sc.nextInt();
            System.out.println("Enter the Arrays");
            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            sc.close();
            FileOutputStream fout = new FileOutputStream("B2File");

            fout.write(n);
            

            for(int i =0;i<n;i++){
                fout.write(arr[i]);;
            }
            fout.close();
            System.out.println("Success....");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
