/*
 * Problem Link   : https://www.codechef.com/problems/CGYM
 * Problem Name   : Chef and Gym
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
            // The monthly cost of the gym
            int x=sc.nextInt();
            // personal training will cost 
            int y=sc.nextInt();
            // Chef's total budget per month 
            int z=sc.nextInt();
            if(z >= x+y){
                System.out.println(2);
            }else if(z >= x){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
	}
}
