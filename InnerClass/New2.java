package InnerClass;
//write a java code to check weather number is divisible by 5 and 11 or not using anonmynous class
class ABC{
    void check(int num){
        System.out.println("Hii");
    }
}
public class New2 {
    public static void main(String[] args){
        int num =57;
        ABC ch = new ABC(){
            @Override
            public void check(int num){
                if(num%5==0 && num %11==0){
                    System.out.println("Divisible");
                }
                else{
                    System.out.println("Not divisible");
                }
            }

        };
        ch.check(num);
    }

    
}
