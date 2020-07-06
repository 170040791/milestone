package com.wipro.NumberProblems;

public class LoopBasedEx6 {
	void numbers() {
		int i,c=0;
		for(i=107;i<=791;i++)
		{
			if(i%10==7&&i/100==1||i%10==1&&i/100==7)
			{
				System.out.println(i);
				c++;
			}
		}System.out.println("there are total "+c+" numbers");
	}
	
public static void main(String args[]) {
	LoopBasedEx6 l=new LoopBasedEx6();
	l.numbers();
}
}