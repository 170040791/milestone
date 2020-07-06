package com.wipro.Strings;



public class Ex3 {

	public static void main(String args[]) {

		String x=args[0],p="";

		int i;

		for(i=0;i<x.length();i++) {

			p=p+x.substring(0, 2);

		}System.out.println(p);

	}



}