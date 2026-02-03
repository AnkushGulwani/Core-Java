// using throw in exception handling
class Throw{
	void abc(int x) {
	try
		{
			int a=464/x;
			System.out.println("a="+a);
		}
	catch(ArithmeticException e) {
		System.out.println("Caught exception first time "+e);
		throw e;
	}
	}
}
public class ExceptionHandling4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw t=new Throw();
		try {
			t.abc(0);
		}
		catch(ArithmeticException e) {
			System.out.println("Caught exception second time "+e);
		}
	}

}
