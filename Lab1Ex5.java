
import java.util.*;

public class Lab1Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(calculateSum(n));

	}

	static int calculateSum(int n) {
		// TODO Auto-generated method stub
		int i,sum=0;
		for(i=1;i<=n;i++)
		{

			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
		return sum;
	}

}