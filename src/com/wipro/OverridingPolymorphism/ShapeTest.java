package com.wipro.OverridingPolymorphism;

 class Shape {
void Draw() {
	System.out.println("Drawing Shape");
}
void Erase() {
	System.out.println("Erasing Shape");
}
}
class Circle extends Shape{
	void Draw() {
		System.out.println("Drawing Circle");
	}
	void Erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape{
	void Draw() {
		System.out.println("Drawing Triangle");
	}
	void Erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	void Draw() {
		System.out.println("Drawing Square");
	}
	void Erase() {
		System.out.println("Erasing Square");
	}
}
public class ShapeTest{
	public static void main(String args[]) {
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		c.Draw();
		c.Erase();
		t.Draw();
		t.Erase();
		s.Draw();
		s.Erase();
	}
}