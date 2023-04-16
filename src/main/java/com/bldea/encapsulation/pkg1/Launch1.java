package com.bldea.encapsulation.pkg1;

class Animal{
	Animal(){
		super();
		System.out.println("Inside zero-parameterized Constructor");
	}
	Animal(int a){
		super();
		System.out.println("Inside parameterized Constructor");
	}
}
class Dog extends Animal{
	Dog(){
		super(10);
	}
}
public class Launch1 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
	
	}
}
