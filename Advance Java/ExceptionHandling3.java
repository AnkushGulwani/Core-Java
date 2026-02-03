// Third method is universal catch block in exception handling
import java.util.Scanner;
public class ExceptionHandling3 {

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
			if(n==2) {
				String str="123y";
				int a=Integer.parseInt(str);
			}
		}
		catch(Exception e) {
			System.out.println("exception caught using universal exception. "+e);
		}
	}

}
