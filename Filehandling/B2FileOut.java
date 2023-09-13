package Filehandling;
import java.io.*;
import java.util.Scanner;;
public class B2FileOut {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            String s  = sc.nextLine();
            sc.close();
            FileOutputStream fout = new FileOutputStream("B2File");

            // fout.write(n);
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success....");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
