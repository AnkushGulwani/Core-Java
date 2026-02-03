

class A extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
			System.out.println("i=" + i);
	}

}

class B extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 10; j++)
			System.out.println("j=" + j);
	}

}

class C extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int k = 0; k < 10; k++)
			System.out.println("k=" + k);
	}

}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();

		a.start();
		b.start();
		c.start();

	}

}
