package lab9;

import java.util.*;

interface intf1{
	int powNum(int x, int y);
}

public class Exercise1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		intf1 f1 = (x, y) -> {
			int ans = 1;
			for(int i=1; i<=y; i++)
				ans = ans*x;

			return ans;
		};

		System.out.println("Enter Two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Result: " + f1.powNum(a, b));
        }
}