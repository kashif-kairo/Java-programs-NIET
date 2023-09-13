package Filehandling;
import java.io.*;
public class B4FileOut {
    public static void main(String[] args) {
        try{
        FileInputStream fin = new FileInputStream("B2File.txt");
        // System.out.println(fin.available());
        // System.out.println(fin.getChannel());
        // fin.skip(4);
        
        
        int i =0;
        while((i = fin.read())!=-1){
            System.out.print((char) i);
        }
        fin.close();
    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    
}
}
