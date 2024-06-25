package com.statements;

import java.util.Scanner;

public class sumofNumbers {
    
  
    public static int sumRange(int n,int m) {
        if (n>m) {
            System.out.println("start value must be less than or equal to end value"); 
        } 
        int sum=0;
        for(int i=n;i<=m;i++) {
        	sum+=i;
        }
        return sum;
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        System.out.println("enter m value");
        int m=sc.nextInt();
        int sum=sumRange(n,m);  
        System.out.println("Sum of numbers from  " +n +"to"+m+"is:"+ sum);
    }
}
