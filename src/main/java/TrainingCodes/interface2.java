package TrainingCodes;
interface Parent1{
	void test1();
}
interface Parent2 extends Parent1{
	void test2();
}
class Child implements Parent1,Parent2{
	@Override
	public void test2() {
		
	}
	@Override
	public void test1() {
		
	}
}

public class interface2 {

}
