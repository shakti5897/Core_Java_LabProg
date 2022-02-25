import java.util.*;


public class Lab3Ex2 {
	public static String getImage(String str)
	{
		StringBuffer strb = new StringBuffer(str);

		strb.reverse();

		str += "|";
		str += new String(strb);
		System.out.println("New String is: " + str);
		return str;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String str = new String();

		System.out.println("Enter The String: ");
		str = sc.next();

		str = getImage(str);
	}
} 