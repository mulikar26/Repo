package com.test.calculator;

/**
 * Hello world!
 *
 */

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class App {
  
    public static void main(String[] args)
    {
            System.out.println("Simple Calculator");
            System.out.println();
            Calculators cal = new Calculators();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            
            
            
            System.out.println("To add press 1");
            System.out.println("To sub press 2");
            System.out.println("To mul press 3");
            System.out.println("To div press 4");
            System.out.println("To percent press 5");
            
            int ch = sc.nextInt();
      
           
      
            switch (ch) {
            
            case 1 :
            	cal.add(a, b);
                break;
      
            case 2:
            	cal.sub(a, b);
                break;
      
            case 3:
            	cal.mul(a, b);      
                break;
      
            case 4:
            	cal.div(a, b);
            	break;
            	
            case 5 :	
            	cal.per(a, b);
            	break;
    		
    		
            default:
      
                System.out.println("You enter wrong input");
      
                break;
            }
            
            sc.close();
    }
    
    //
    
    
    
    
    static class Calculators {
    	public int add(int i, int j) {
    	        System.out.println("Addition of " + i + "," + j + " is: " + (i + j));
    	        return i + j;
    	    }
    	public int mul(int i, int j) {
    	        System.out.println("Multiplication of " + i + "," + j + " is: " + (i * j));
    	        return i * j;
    	    }
    	public int sub(int i, int j) {
    	        System.out.println("Subtraction of " + i + "," + j + " is: " + (i - j));
    	        return i - j;
    	    }
    	public double div(double i, double j) {
    	        if (j != 0) {
    	            System.out.println("Division of " + i + "," + j + " is: " + (i / j));
    	            return i / j;
    	        } else {
    	            System.out.println("Division with 0 is not possible");
    	            return 0;
    	        }
    	    }
    	
    	public double per(double i, double j) {
	        if (j != 0) {
	            System.out.println("Percentage of " + i + "/" + j + " is: " + ((i / j)*100));
	            return ((i / j)*100);
	        } else {
	            System.out.println("Division with 0 is not possible");
	            return 0;
	        }
    	
    	
    	}
    }  
        
}