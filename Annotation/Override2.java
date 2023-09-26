package Annotation;

class Animal1{  
void eatSomething(){
    System.out.println("eating something");
}  
}  
  
class Dog1 extends Animal1{  
@Override  
void eatSomething(){
    System.out.println("eating foods");
}//should be eatSomething  
}  
  
class Override2{  
public static void main(String args[]){  
Animal1 a=new Dog1();  
a.eatSomething();  
}}  
