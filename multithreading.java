package lab7;



	class MyThread1 extends Thread{
		//override
		public void run() {
			int i=0;
			while(i<10)
			{
				System.out.println("My thread is running");
				System.out.println("I am happy");
				i++;
			}
		}

	}
	class MyThread2 extends Thread{
		//override
		public void run() {
			int i=0;
			while(i>10)
			{
				System.out.println("Thread2 is good");
				System.out.println("I am sad");
				i++;
			}
		}

	}
	public class multithreading {
	public static void main(String[] args) {

	 	MyThread1 t1=new MyThread1();
	 	MyThread2 t2=new MyThread2();
	 	t1.start();
	 	t2.start();
	}

}