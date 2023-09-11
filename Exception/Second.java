//WAJP to raise a exception if number is eual to 0 and apart from zero print the Sq root
package Exception;

public class Second {
    public static void check(int num){
        try{
            if(num==0){
                throw new ArithmeticException();
            }
            else{
                for(int i =1;i<num;i++){
                    if(num/i==i){
                        System.out.println("Sq root of "+num+" is "+i);
                    }
                }
            }
        }
        catch(Exception e){
                System.out.println(e);
            
        }
    }
    public static void main(String[] args){
        check(16);
    }
}

