
import java.util.*;
import java.lang.*;

public class Lab1Ex1 {
	 public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println(CubeSum(n));
		}

		static int CubeSum(int n) {
			int digit;
	    int sum=0;
			while(n>0)
			{
				digit=n%10;
	      sum=sum+(digit*digit*digit);
	      n=n/10;
			}
	    return sum;
		}
	}
