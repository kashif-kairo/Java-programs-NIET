package Exception;

public class Third {
    public static void check(int a){
        for(int i =1;i<=a;i++){
            try{
                if(i==5){
                    throw new ArithmeticException();
                }
                else{
                    System.out.println("Number of iteration is "+i);
                }
            }
            catch(Exception e){
                System.out.println("Number 5 is not allowed");
            }
        }
    }
    
    public static void main(String[] args){
        check(6);
    }
}
