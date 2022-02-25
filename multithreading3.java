package lab7;
class MyThr extends Thread{
	public MyThr(String name) {
		super(name);
	}
	public void run() {
		System.out.println("Thread thankyou");
	}
}
public class multithreading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr t1=new MyThr("Palak");
		//t1.setName("Palak");

		MyThr t2=new MyThr("Shalini");
		//t2.setName("Shalini");
		t1.start();
		System.out.println("The id of the thread is " + t1.getId());
		System.out.println("The name of the thread is " + t1.getName());

		t2.start();		
		System.out.println("The id of the thread is " + t2.getId());
		System.out.println("The name of the thread is " + t2.getName());


	}

}