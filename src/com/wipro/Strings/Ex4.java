
package com.wipro.Strings;



public class Ex4 {

public static void main(String args[]) {

	String x=args[0];

	if(x.length()%2==0) {

		System.out.println(x.substring(0,x.length()/2));

	}

	else {

		System.out.println("null");

	}

}

}