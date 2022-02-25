
import java.util.*;

public class Lab1Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<n;i++) {
			x=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					x=1;
			}
			if(x==0)
				System.out.println(i);
		}

	}

}