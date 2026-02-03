//Using multiple inheritance in interfaces
interface A1{
	void show();
}
interface B1{
	void display();
}
class AB1 implements A1,B1{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside display");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("inside show");
	}
	
}
public class InterfaceDemo2 {
	public static void main(String args[]) {
		AB1 a=new AB1();
		a.display();
		a.show();
	}
}
