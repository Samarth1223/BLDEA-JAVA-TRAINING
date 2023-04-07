package com.bldea.encapsulation.pkg1;
class Plane{
	void takeoff() {
		System.out.println("plane took off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("Plane landed");
	}}
class CargoPlane extends Plane{ 
	void fly() {
		System.out.println("Flies at lower height");
	}
	void CarryGoods() {
		System.out.println("Carry Goods");
	}
}

class FighterPlane extends Plane{ 
	void fly() {
		System.out.println("Flies at Higher");
	}
	void CarryWeapon() {
		System.out.println("It carries Weapons");
	}
	
}
class PassengerPlane extends Plane{ 
	void fly() {
		System.out.println("Flies at medium height");
	}
	void CarryPassenger() {
		System.out.println("It carry Passengers");
	}
}

public class InheritExm {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		PassengerPlane pp = new PassengerPlane();

		cp.takeoff();
		cp.fly();
		cp.land();
		cp.CarryGoods();
		System.out.println("--------------------------------");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.CarryWeapon();
		System.out.println("--------------------------------");
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.CarryPassenger();

	}

}
