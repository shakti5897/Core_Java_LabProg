package lab7;
class MyThreadRunnable1 implements Runnable{
	public void run () {
		System.out.println("I am a thread1");
	}
}
class MyThreadRunnable2 implements Runnable{
	public void run () {
		System.out.println("I am a thread2");
	}
}
public class Multithreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadRunnable1 bullet1=new MyThreadRunnable1();
	    Thread gun1=new Thread(bullet1);

		MyThreadRunnable2 bullet2=new MyThreadRunnable2();
		Thread gun2=new Thread(bullet2);
		//we cannot directly call start method over here.

		gun1.start();
		gun2.start();

	}

}
