import java.util.*;

public class Lab3Ex6 {
	public boolean posString(String str) {
		int n = str.length();

		for(int i=1; i<n; i++) {
			if((int)str.charAt(i) < (int)str.charAt(i-1))
				return false;
		}

		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Exercise6 ex = new Exercise6();

		String str = new String();

		System.out.println("Enter Input String:");
		str = sc.next();

		System.out.println("Entered is String is Positive:" + ex.posString(str));
	}
} 