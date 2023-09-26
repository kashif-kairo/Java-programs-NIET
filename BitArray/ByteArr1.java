package BitArray;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArr1 {
    public static void main(String[] args) throws IOException {
        byte[] array = {1,2,3,4};
        ByteArrayInputStream in = new ByteArrayInputStream(array);
        System.out.println("Elements inside it : ");
        for(int i =0; i<array.length;i++){
            int data = in.read();
            System.out.print((char)data+" ");
        }
        in.close();
        
    }
}
