
import java.util.*;
import java.lang.*;
public class Lab1Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(calculateDifference(n));
	}

	static int calculateDifference(int n) {
		// TODO Auto-generated method stub
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1=sum1+(i*i);

		}
		int sum=n*(n+1)/2;
		sum2=sum*sum;
		int diff=sum1-sum2;
		return diff;
	}

}