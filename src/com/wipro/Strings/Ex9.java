package com.wipro.Strings;



public class Ex9 {

	public static void main(String args[]) {

		String s=args[0],p="",p1="";

		String s1=args[1];

		

		for(int i=0;i<Math.min(s.length(),s1.length());i++) {

			p=p+Character.toString(s.charAt(i))+Character.toString(s1.charAt(i));

		

		}



		if(s.length()>s1.length()) {

			p1=p+s.substring(s1.length()+1,s.length());

			System.out.println(p1);

		}

		else if(s.length()<s1.length()) {

			p1=p+s1.substring(s.length()+1,s1.length());

			System.out.println(p1);

		}

		else {

			System.out.println(p);

		}

	}



}