interface A{
	void show();
}
interface B extends A{
	void display();
}
class AB implements B{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Inside show");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside display");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB a=new AB();
		a.display();
		a.show();
	}

}
