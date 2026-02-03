// using throws in exception handling
class Throws{
	void abc(int x) throws Exception
	{
	try
		{
			int a=464/x;
			System.out.println("a="+a);
			if(x==1)
			{
				int arr[]= {1,2,3,4,5};
				arr[9]=10;
			}
			if(x==2)
			{
				String str="hdiqieh1343";
				int b=Integer.parseInt(str);
			}
		}
	finally {
		System.out.println("This finally keyword will always exexute");
	}
	}
}
public class ExceptionHandling5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Throws t1=new Throws();
		
		try {
			t1.abc(2);
		}
		
		catch(Exception e) {
			System.out.println("Caught exception "+e);
		}
	
	}
}
