package TrainingCodes;
class cat{
	private String name;
	private String color;
	private int cost;
	
	void setData(String name, String color, int cost) {
		this.name=name;
		this.color=color;
		this.cost=cost;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
}

public class Shadowproblem {
	public static void main(String[] args) {
		cat d1 = new cat();
	//  d1.name = "tommy";//error cant access private variables	

		d1.setData("Blacky","Black", 5000);
		d1.getData();
				
	}

}
