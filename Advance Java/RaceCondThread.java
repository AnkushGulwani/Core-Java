class Counter {
    int count;

    public synchronized void increment() {// synchronized is used to make sure only one thread is using this at a
                                          // particular time
        count++;
    }
}

public class RaceCondThread {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("T1="+i);
                counter.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("T2="+i);
                counter.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
