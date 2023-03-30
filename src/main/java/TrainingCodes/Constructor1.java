package TrainingCodes;
class Dog1{
	private String name;
	private String color;
	private int cost;
	
	public Dog1() {
		super();
	}
	public Dog1(String name) {
		super();
		this.name=name;
	}
	public Dog1(String name,String color) {
		super();
		this.name=name;
		this.color=color;
	}
	public Dog1(String name,String color,int cost) {
		super();
		this.name=name;
		this.color=color;
		this.cost=cost;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	
}
public class Constructor1 {
	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		System.out.println(d1.getName());//null
		System.out.println(d1.getColor());//null
		System.out.println(d1.getCost());//0
		System.out.println("--------------------------------------------------------");
		
		Dog1 d2 = new Dog1("Rocky");
		System.out.println(d2.getName());//Rocky
		System.out.println(d2.getColor());//null
		System.out.println(d2.getCost());//0
		System.out.println("--------------------------------------------------------");
		
        Dog1 d3 = new Dog1("Tommy","White");
        System.out.println(d3.getName());//Tommy
		System.out.println(d3.getColor());//White
		System.out.println(d3.getCost());//0
		System.out.println("--------------------------------------------------------");
		
		Dog1 d4 = new Dog1("Jhonny","Black",7000);
		System.out.println(d4.getName());//Jhonny
		System.out.println(d4.getColor());//Black
		System.out.println(d4.getCost());//7000
		System.out.println("--------------------------------------------------------");
		
	}
	
}
