package com.wipro.Strings;



public class Ex1 {

	public static void main(String args[]) {

		String x=args[0];

		int i=0,flag=0;

		for(i=0;i<x.length()/2;i++)

		{

			if(x.charAt(i)==(x.charAt(x.length()-i-1))){

				continue;

			}

			else {

				flag=1;

				break;

			}

		}if(flag==0) {

			System.out.println("palindrome");

		}

		else {

			System.out.println("not palindrome");

		}

	}



}