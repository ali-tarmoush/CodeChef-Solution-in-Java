/*
 * Problem Link   : https://www.codechef.com/problems/MINHEIGHT
 * Problem Name   : Roller Coaster 
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
            int h=sc.nextInt();
            if(x >= h){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}
