
package com.wipro.Strings;



public class Ex2 {

	public static void main(String args[]) {

		String a=args[0];

		String b=args[1];

		String c="",d="";

		c=a.toLowerCase();

		d=b.toLowerCase();

		if(a.charAt(a.length()-1)==b.charAt(0)) {

			System.out.println(c+d.substring(1));

		}

		else {

			System.out.println(c+" "+d);

		}

	}



}