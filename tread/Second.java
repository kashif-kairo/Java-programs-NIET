package tread;

public class Second {
    public static void main(String[] args) {
        for(int i =1; i<=5;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(100);
            }
            catch(Exception e ){};
        }
    }
}
