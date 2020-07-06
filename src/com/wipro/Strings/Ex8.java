package com.wipro.Strings;



public class Ex8 {

public static void main(String args[]) {

	String s=args[0];

	int x=s.indexOf('*');

	String p;

	p=s.substring(0,x-1)+s.substring(x+2,s.length());

	System.out.println(p);

}

}