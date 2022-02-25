
import java.util.*;

public class Lab1Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		 System.out.println(fib2(n));
		 System.out.print(fib1(n));
	}

	static int  fib2(int n) {
		// TODO Auto-generated method stub
		int n1=1,n2=1,n3=0;
		for(int i=2;i<n;i++) {
			 n3=n1+n2;
			 n1=n2;
			 n2=n3;
		 }
		return n3;
	}

	static int fib1(int n)
	{
	    if (n <= 1)
	        return n;
	    return fib1(n-1) + fib1(n-2);
	}

}