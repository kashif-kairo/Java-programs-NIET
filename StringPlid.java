/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kashif1;

/**
 *
 * @author E-LAB-PC53
 */
import java.lang.*;
import java.util.*;
public class StringPlid {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s =sc.nextLine();
        char ch[] =s.toCharArray();
        int a =1;
        int st=0;
        int e=s.length()-1;
        while(st<=e){
            if(ch[st]!=ch[e]){
                a=0;
            }
            st++;
            e--;
        }
        if(a==1){
            System.out.println("Palindrome");}
        else{
            System.out.print("Not Palindrome");}
        
        }
    
}
