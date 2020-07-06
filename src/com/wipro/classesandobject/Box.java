package com.wipro.classesandobject;







public class Box {



	int width;



	int height;



	int depth;



	Box(int x,int y,int z){







		width=x;



		height=y;



		depth=z;



	}



	int m1() {



		return width*height*depth;



	}











	public static void main(String args[]) {



		Box b=new Box(5,6,7);



		System.out.println(b.m1());



	}







}