package com.wipro.Strings;



public class Ex10 {

public static void main(String args[]) {

	String s=args[0],s1="";

	int x=Integer.parseInt(args[1]),i;

	if(x==0) {

		System.out.println("enter valid number");

	}

	else if(x>=s.length()) {

		for(i=0;i<s.length();i++) {

			s1=s1+s;

		}

		System.out.println(s1);

	}

	else {

	for(i=0;i<x;i++) {

		s1=s1+s.substring(s.length()-x);

	}

	System.out.println(s1);}

}

}