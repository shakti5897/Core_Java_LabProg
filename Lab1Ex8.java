
import java.util.*;
public class Lab1Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     System.out.println(powerOfTwo(n));
	}

	static int powerOfTwo(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 0;
		while(n!=1)
		{
			if(n%2!=0)
				return 0;
			n=n/2;
		}
		return 1;
	}

}
