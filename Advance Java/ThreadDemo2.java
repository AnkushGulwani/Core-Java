class A1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
			System.out.println("i="+i);
	}
	
}
class B1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j=0;j<10;j++)
			System.out.println("j="+j);
	}
	
}
class C1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int k=0;k<10;k++)
			System.out.println("k="+k);
	}
	
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		B1 b=new B1();
		C1 c=new C1();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
