import java.util.*;

public class Lab3Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter numbers with one space between them");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			int n = Integer.parseInt(temp);
			System.out.println(n);
			sum += n;
		}

		System.out.println("Sum of the integers is:" + sum);
	}
} 