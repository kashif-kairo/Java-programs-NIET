package Filehandling;
import java.io.*;
public class B2DataIn {
    public static void main(String[] args) throws IOException {
        DataInputStream dos = new DataInputStream( new FileInputStream("Data1Extream.txt"));
        int a = dos.readInt();
        char ch = dos.readChar();
        Double d=dos.readDouble();
        System.out.println(a+" "+d+" "+ch);
        dos.close();
        
        

    }
}