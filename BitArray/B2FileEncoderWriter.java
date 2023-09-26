package BitArray;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.*;
public class B2FileEncoderWriter {
    public static void main(String[] args) throws IOException {
        String fil = "Output.txt";
        FileWriter o1 = new FileWriter(fil);
        FileWriter o2 = new FileWriter(fil,Charset.forName("UTF1"));
        o1.close();
        o2.close();

    }
}
