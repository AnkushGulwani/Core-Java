// Second method in exception handling is multiple catch blocks
import java.util.Scanner;
public class ExceptionHandling2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello......!");
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		n=s.nextInt();
		try
		{
			int b=123/n;
			System.out.println("b ="+b);
			if(n==1) {
				int arr[]= {1,2,3,4};
				arr[6]=7;
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Zero input is not allowed "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds"+e);
		}
		System.out.println("bye...........!");

	}

}
