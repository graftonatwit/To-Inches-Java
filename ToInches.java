
package edu.wit.scds.cs1.lab01;

import java.util.Scanner;
/**
 * 
 * Problem 1 in Lab 01 - convert measurements from yards, feet, and inches to total inches
 * @author Trevor J Grafton
 * @version 1.0.0 2023-10-12 Initial implementation
 *
 */
//*
public class ToInches
    {

    /**
     * 
     * 
     @param args
     */
    public static void main( String[] args )
        {
        @SuppressWarnings( "resource" )
        Scanner yardsInput = new Scanner(System.in);
        System.out.printf("Enter number of yards: ");
        int yards = yardsInput.nextInt();
        
        
        @SuppressWarnings( "resource" )
        Scanner feetInput = new Scanner (System.in);
        System.out.printf( "Enter number of feet: ");
        int feet = feetInput.nextInt();
        
        
        @SuppressWarnings( "resource" )
        Scanner inchesInput = new Scanner (System.in);
        System.out.printf( "Enter number of inches: ");
        int inches = inchesInput.nextInt();
        
        System.out.printf("%n" + "Total number of inches: " +((yards*36)+(feet*12)+inches)+"%n");
        yardsInput.close();
        feetInput.close();
        inchesInput.close();
        }

    }
   // end class ToInches