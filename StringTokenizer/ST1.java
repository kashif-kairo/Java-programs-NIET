package StringTokenizer;

import java.util.StringTokenizer;

public class ST1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is Kashif");
        StringTokenizer sp = new StringTokenizer("My@name@is@Kashif");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        while(sp.hasMoreTokens()){
            System.out.println(sp.nextToken("@"));
        }
    }
    
}
