package TrainingCodes;
interface Calculator{
	void add();
	void sub();
	
}
abstract class Calcy1 implements Calculator{

	@Override
	public void add() {
		
	}
	
}
class Calcy2 implements Calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}
public class interface1 {
	public static void main(String[] args) {
		//interface object
		Calculator c = new Calculator() {
			
			@Override
			public void sub() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println(c);
		//abstract class object
		Calcy1 c1 = new Calcy1() {
			
			@Override
			public void sub() {
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println(c1);
	}

}
