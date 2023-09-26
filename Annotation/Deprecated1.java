package Annotation;
//Code run ho jayega but compile time per warning dega

class A3{  
    void m(){
        System.out.println("hello m");
    }  
  
    @Deprecated
     void print(){
        System.out.println("hello print");}  
}  
  
class Deprecated1{  
public static void main(String[] args){  
  
A3 a=new A3();  
a.print();  
}
}  
//C:\Users\E-LAB-PC53\Desktop\Kashif\Annotation\Deprecated1.java