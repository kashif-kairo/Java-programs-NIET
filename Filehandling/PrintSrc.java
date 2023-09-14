package Filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class PrintSrc {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("Sample.txt");
        PrintStream ps = new PrintStream(fout);
        ps.println(2016);
        ps.println("Hello Kashif");
        ps.println("We done it");
        ps.close();
        fout.close();
    
    }
}
