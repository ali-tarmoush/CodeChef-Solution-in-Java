/*
 * Problem Link   : https://www.codechef.com/problems/CMASKS
 * Problem Name   : Chef and Masks
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
            int disposable =x*100;
            int cloth=y*10;
            if(disposable == cloth | disposable > cloth){
                System.out.println("Cloth");
            }
            else{
                System.out.println("Disposable");
            }
        }
	}
}
