// First technique is try-catch in exception handling
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Hello......!");
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		n=s.nextInt();
		try
		{
			int b=123/n;
			System.out.println("b ="+b);
		}
		catch(ArithmeticException e) {
			System.out.println("Zero input is not allowed "+e);
		}
		System.out.println("bye...........!");
	}

}
