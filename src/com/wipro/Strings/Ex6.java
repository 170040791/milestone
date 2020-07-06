package com.wipro.Strings;



public class Ex6 {

	public static void main(String args[]) {

		String a=args[0];

		String b=args[1];

		if(a.length()>b.length()) {

			System.out.println(b+a+b);

		}

		else if(a.isEmpty()==true) {

			System.out.println(b);

		}

		else if(b.isEmpty()==true) {

			System.out.println(a);

		}

		else {

			System.out.println(a+b+a);

		}

	}



}