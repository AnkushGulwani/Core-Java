// user defined exception
import java.util.Scanner;
public class ExceptionHandling6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value:");
		x = s.nextInt();
		try 
		{
			if(x%2==1)
			{
				throw new RuntimeException("Only Even value allowed");	
			}
			System.out.println("Valid Value input");
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
