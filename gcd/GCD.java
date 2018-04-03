package gcd;

import java.util.Scanner;

/*
 * Author: Osmel Savon - CSC 300-601 
 * 
 * Notes: I tried using Eucleads Algorithm but I was having some difficulty so I did some research and 
 * 		  tried using the scanner tool, which worked out.
 */

public class GCD {


        public static void main(String args[])throws Exception
        {
        	/* Scanner is a tool that scans input and produces values. Also it converts bytes to characters
        	 * In this section the variables are initiated and the user is prompted for input
        	 */
        	
            Scanner num = new Scanner(System.in);
            System.out.print("Enter first number : ");
            int n1 = num.nextInt();
            System.out.print("Enter second number : ");
            int n2 = num.nextInt();
            int r;
            
            /* This section is a while loop to determine the GCD */ 
            
            while(n2 != 0)
            {
                r = n1 % n2;
                n1 = n2;
                n2 = r;
            }
            System.out.print("GCD = "+n1);
        }
    }