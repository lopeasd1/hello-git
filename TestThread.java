package test;

public class Demo1 implements Runnable {
	int i = 0;
	@Override
	public void run() {
		
		while (i < 20) {
			System.out.println(Thread.currentThread().getName()+"\t"+i++);
		}
	}
	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		Thread t3 = new Thread(d);
		t1.start();
		t2.start();
		t3.start();
	}
}
