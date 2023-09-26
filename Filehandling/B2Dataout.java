package Filehandling;
import java.io.*;
public class B2Dataout {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream( new FileOutputStream("Data1Extream.txt"));
        dos.writeInt(10);
        dos.writeChar((char) 65);
        dos.writeDouble(9.6);
        dos.close();

        

    }
    
}

