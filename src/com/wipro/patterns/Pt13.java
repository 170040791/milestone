package com.wipro.patterns;


//1 2 3 4 
//5 6 7 
//8 9 
//10 

public class Pt13 {
	public static void main(String args[]) {
		int i,j,k=1;
		int n=Integer.parseInt(args[0]);
		for(i=n;i>0;i--)
		{
			for(j=1;j<i+1;j++)
			{
				System.out.print(k+" ");
				k++;
			}System.out.println("");
		}
	}
}