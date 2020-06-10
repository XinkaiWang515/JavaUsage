package Structures;

import java.util.concurrent.*;

class shared {
	static int count = 0;
}

class MyThread extends Thread {
	Semaphore sem;
	String threadName;
	
	public MyThread(Semaphore sem, String threadName) {
		super(threadName);
		this.sem = sem;
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		if (this.getName().equals("thread1")) {
			System.out.println("starting " + threadName);
			try {
				System.out.println(threadName + " is waiting for a permit.");
				sem.acquire();
				System.out.println(threadName + " gets a permit."); 
				for (int i = 0; i < 5; i++) {
					System.out.println(threadName + " counts to " + ++shared.count);
					Thread.sleep(5); 
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			System.out.println(threadName + " releases the permit."); 
            sem.release(); 
		} else {
			System.out.println("starting " + threadName);
			try {
				System.out.println(threadName + " is waiting for a permit.");
				sem.acquire();
				System.out.println(threadName + " gets a permit."); 
				for (int i = 0; i < 5; i++) {
					System.out.println(threadName + " counts to " + --shared.count);
					Thread.sleep(5); 
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			System.out.println(threadName + " releases the permit."); 
            sem.release();
		}
	}
}

public class countSemaphore {

	public static void main(String[] args) throws InterruptedException {
		Semaphore sem = new Semaphore(1);
		MyThread mt1 = new MyThread(sem, "thread1"); 
        MyThread mt2 = new MyThread(sem, "thread2"); 
        
        mt1.start();
        mt2.start();
        
        mt1.join();
        mt2.join();
        
        System.out.println(shared.count);
	}

}
