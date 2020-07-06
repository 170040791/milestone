package com.wipro.classesandobject;







import java.lang.Math;







public class Calculator {







	static double powerInt(int num1,int num2) {



		return Math.pow(num1, num2);



	}



	static double powerDouble(double num1,int num2) {



		return Math.pow(num1, num2);



	}



	public static void main(String args[]) {



		System.out.println(Calculator.powerInt(Integer.parseInt(args[0]), Integer.parseInt(args[1])));



		System.out.println(Calculator.powerDouble(Double.parseDouble(args[2]), Integer.parseInt(args[3])));







	}







}