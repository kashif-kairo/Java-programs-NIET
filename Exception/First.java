package Exception;

public class First {
    public static void main(String[] args){
        String n ="26";
        try{
            System.out.println("try block");
            char a  = n.charAt(n.length());
            System.out.println(a);
        }
        catch(Exception ae){
            System.out.println("Catch block");
            System.out.println(ae.getMessage());
        }
        finally{
            char a1  = n.charAt(n.length()-1);
            System.out.println("Final "+a1+" At Last Index ");
        }

    }
}
