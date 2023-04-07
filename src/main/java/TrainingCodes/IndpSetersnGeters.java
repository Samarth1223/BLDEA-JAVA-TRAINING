package TrainingCodes;
class Tiger{
	private String name;
	private String color;
	private int age;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
public class IndpSetersnGeters {

	public static void main(String[] args) {
		Tiger t1=new Tiger();
		t1.setName("Ramu");
		t1.setColor("orange");
		t1.setAge(5);
		t1.setCountry("India");
		System.out.println(t1.getName());
		System.out.println(t1.getColor());
		System.out.println(t1.getAge());
		System.out.println(t1.getCountry());
		

	}

}
