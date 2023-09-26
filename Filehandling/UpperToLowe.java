package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpperToLowe {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("B2File.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("kashif.txt"));
        int i;
        do{
            i = br.read();
            if(i != -1) {
                char c = (char)i;
                if(Character.isLowerCase(c)) {
                    c = Character.toUpperCase(c);
                } else if(Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                }
                bw.write(c);
            }
        }while(i!=-1);
        br.close();
        bw.close();
    }
}

