/*
 * Problem Link   : https://www.codechef.com/problems/MANGOES
 * Problem Name   : The Mango Truck
 * Language:      : Java
 * Programmer     : Ali Tarmoush 
 * Status         : Accepted
 */

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            // Mango weighs
            int x=sc.nextInt();
            // Truck weighs  
            int y=sc.nextInt();
            // Bridge that can withstand a weight
            int z=sc.nextInt();
            // The maximum number of mangoes that you can load in the truck.
            int maximum=0;
            while((maximum*x)+y <= z){
                maximum++;
            }
            System.out.println(maximum-1);
        }
	}
}
