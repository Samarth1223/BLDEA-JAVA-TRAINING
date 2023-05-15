package TrainingCodes;

import java.util.Scanner;

abstract class Shapes {
	double area;
	abstract void collect();
	abstract void calculate();
	void disp() {
		System.out.println(area);
	}

}
class Circle extends Shapes{
	double pi = 3.147;
	double r;
	void collect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		r = sc.nextDouble();
		
	}
	void calculate() {
		area = pi*r*r;
	}
}
class Rectangle extends Shapes{
	double l,b;
	void collect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		l = sc.nextDouble();
		System.out.println("Enter Breadth");
		b=sc.nextDouble();
	}
	void calculate() {
		area=l*b;
	}
	
}
class Square extends Shapes{
	double side;
	void collect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side");
		side = sc.nextDouble();
		
	}
	void calculate() {
		area = side*side;
	}
}
class Geometry


















