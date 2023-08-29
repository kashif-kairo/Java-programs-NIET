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
class A{
    int a;
    int b;
    void getdata(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter value a: ");
        a=sc.nextInt();
            System.out.println("Enter value b: ");
        b=sc.nextInt();
    }
}
class B extends A
{
    int sum(){
        return (a+b);
    }
}

class C extends B
{
    int c;
    void getc(){
        System.out.println("Enter value c: ");
        Scanner sc = new Scanner(System.in);
        c=sc.nextInt();
    }
    int multi(){
        return a*b*c;
    }
}
public class MultilevelInheritance {
    public static void main(String[] args){
    C c= new C();
    c.getdata();
    System.out.println("Sum "+c.sum());
    c.getc();
    System.out.println("Multipication "+c.multi());
    }
    
}
