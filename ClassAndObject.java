/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kashif1;

/**
 *
 * @author E-LAB-PC53
 * 
 */
// Sum of two numbers using Class
import java.util.Scanner;
public class ClassAndObject {
        //Instance Variable
    int n;
    int m;
    //method 1
    public int add(){
            return n+m;
            
    
    }
    //method 2
    public void getdata(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers ");
        n=sc.nextInt();
        m=sc.nextInt();
    }
//    main
    public static void main(String[] args){
        ClassAndObject v= new ClassAndObject();

        v.getdata();
        
        

        System.out.println(v.add());
    }
    
}
/** 
 Class Main{
 * public int addNumbers(int a, int b){
 * int sum = a+b;
 * return sum; 
 * }
  }
  public static void main(String[] args){
  * int num1=25;
  * int num2=15;
  * Main obj=new Main();
  * print(obj.addNumbers())
  * }
 
 */
