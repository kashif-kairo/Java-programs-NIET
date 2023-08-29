/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kashif1;

/**
 *
 * @author E-LAB-PC53
 */
import java.util.*;

class Quad
{
    int l;
    int b;
    int area(){
        return l*b;
    }
    int perimeter(){
     
        return 2*(l+b);
    }
}
class Square extends Quad{
    int a;
    
    Square(){
        getside();
    }
    void getside(){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value Side: ");
    a=sc.nextInt();
    l=a;
    b=a;
    }   
    
}
class Rectangle extends Quad{
    int a;
    int b1;
    
    Rectangle(){
    getside();
    }
    
    void getside(){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value length: ");
    a=sc.nextInt();
    System.out.println("Enter value breath : ");
    b1=sc.nextInt();
    l=a;
    b=b1;
    } 
}
public class HierarchicalInheritance {
        public static void main(String[] args){
        
            Square sq= new Square();
//            sq.getside();
            System.out.println("Area of square: "+sq.area());
            System.out.println("Perimeter of square: "+sq.perimeter());
            
            Rectangle rt = new Rectangle();
//            rt.getside();
            System.out.println("Area of Rectangle: "+rt.area());
            System.out.println("Perimter of Rectangle: "+rt.perimeter());
            
        
        
        
        
        
        }
    
}
