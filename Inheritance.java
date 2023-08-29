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
class Pyramid
{   
    int a,b;
    void input()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value a: ");
    a=sc.nextInt();
    System.out.println("Enter value b: ");

    b=sc.nextInt();
    }
    int add()
    {
        return (a+b);
    }
}
class Kashif extends Pyramid
{
    int c;
    void getdata(){
    input();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value c: ");
    c=sc.nextInt();
    }
    int add3(){
    int n=(a+b+c);
    return n;
    }
}

public class Inheritance{
    public static void main(String[] args){
        
//        Pyramid p =new Pyramid();
        Kashif k = new Kashif();
        k.getdata();
//        System.out.println(p.add());
        System.out.println(k.add3());
        k.input();
        System.out.println(k.add());

        
    }
    

}
