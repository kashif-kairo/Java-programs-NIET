/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kashif1;

/**
 *
 * @author E-LAB-PC53
 */
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = obj.nextInt();
//        int i;
        int arr[]=new int[n];
        System.out.println("Enter the Elements of an array ");
        for(int i=0; i<n; i++){
            arr[i]=obj.nextInt();
        }
//        int sum=Integer.MIN_VALUE;
//        for(int j=0;j<n;j++){
//            if(arr[j]>sum){
//                sum=arr[j];
//            }}
//        System.out.println("max "+sum);
//    
}
        
            
        
    }

