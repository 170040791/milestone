package com.wipro.Arrays;

import java.util.Arrays;

public class Ex10 {
	public static void main(String args[]) {
		int arr[]=new int[args.length];
		int arr1[]=new int[args.length];
		
		int i,m=0,n=args.length-1;
		for(i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<args.length;i++)
		{
			if(arr[i]%2==0)
			{
				arr1[m]=arr[i];   
				m++;
			}
			else {
				arr1[n]=arr[i];
				n--;
							}
		}
		System.out.println(Arrays.toString(arr1));

}}