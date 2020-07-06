package com.wipro.inheritance;

class Animal{
	void eat() {
		System.out.println("every animal eats");
	}
	void sleep() {
		System.out.println("every animal sleeps");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("every bird eats");
	}
	void sleep() {
		System.out.println("every bird sleeps");
	}
	void fly()
	{
		System.out.println("every bird fly");
	}
	
}


public class InheritanceEx1 {
	public static void main(String args[]) {
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
		
	}

}