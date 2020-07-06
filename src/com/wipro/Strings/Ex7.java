package com.wipro.Strings;



public class Ex7 {

public static void main(String args[]) {

	String x=args[0],p;

	

	if(x.startsWith("x")==true&&x.endsWith("x")==false){

		p=x.substring(1);

		System.out.println(p);

	}

	else if(x.startsWith("x")==false&&x.endsWith("x")==true){

		p=x.substring(0,x.length());

		System.out.println(p);

	}

	else if(x.startsWith("x")==true&&x.endsWith("x")==true){

		p=x.substring(1,x.length()-1);

		System.out.println(p);

	}

	else {

		System.out.println(x);

	}



}

}