/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kashif1;

/**
 *
 * How to take input from user and display it
 */
import java.util.Scanner;
public class First {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(n);
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the char");
        char a = st.next().charAt(0);
        System.out.println(a);
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter the String");
        String c = sk.next(); // next() will not all line if line has a space
        System.out.println(c);
        Scanner sv = new Scanner(System.in);
        System.out.println("Enter the Line");
        String d = sk.nextLine();
        System.out.println(d); //nextLine() will take whole line
        
        /** Exwecise 1
         write a java program to read integer value and print its equivalent character value **/
        
        Scanner sp = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sp.nextInt();
        
        char C =(char)N;
        System.out.println("sample output ");
        System.out.println(C);
        
    }
}
