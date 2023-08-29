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
public class Strings {
    public static void main(String[] args){
//    String S1="Hello";
//    String S2="Hello";
//    System.out.println(S1==S2);
//    //output True
//    //this s1 and s2 will represent same memory location if s1 and s2 are same eg "Hello"
//    
//    String S3= new String("Hello");
//    System.out.print(S1==S3);
//    
      Scanner sc= new Scanner(System.in);
      String s =sc.nextLine();
      int v=0;
      int c=0;
      char ch[] =s.toCharArray();
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U'){
          v++;
          }
          else if(s.charAt(i)==' '){
              continue;
          }
          else{
          c++;  
          }
      }
      System.out.println("Vowel "+ v);
      System.out.println("Consonant "+ c);
      
    
        
}
}
    

