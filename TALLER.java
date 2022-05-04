/*
 * Problem Link   : https://www.codechef.com/problems/TALLER
 * Problem Name   : Who is taller! 
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
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
	}
}
