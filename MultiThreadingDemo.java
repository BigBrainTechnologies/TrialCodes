package basicPrograms;


public class MultiThreadingDemo implements Runnable {

	public static void main(String[] args) {
		try {
			MultiThreadingDemo oMultiThreadingDemo1 = new MultiThreadingDemo();
			Thread thread1 = new Thread(oMultiThreadingDemo1, "ClientRequest1");
			thread1.start();

			MultiThreadingDemo oMultiThreadingDemo2 = new MultiThreadingDemo();
			Thread thread2 = new Thread(oMultiThreadingDemo2, "ClientRequest2");
			thread2.start();

			MultiThreadingDemo oMultiThreadingDemo3 = new MultiThreadingDemo();
			oMultiThreadingDemo3.run();
			
			thread1.join();
			thread2.join();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("Main Thread exit");

	}

	@Override
	public void run() {
			String thread = "Thread : " + Thread.currentThread().getName() + " : ";

			for (int i = 0; i < 5; i++) {
				System.out.println(thread + i);
			}
			

	}
}
