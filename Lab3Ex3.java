import java.util.*;


public class Lab3Ex3 {
	public static boolean isAlphabet(Character ch)
	{
		if(ch>='a' && ch<='z') 
			return true;

		if(ch>='A' && ch<='Z')
			return true;

		return false;
	}

	public static String alterString(String str) {

		String res = new String();

		Character arr[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

		List<Character> al = Arrays.asList(arr);

		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);

			if(!al.contains(str.charAt(i)) && isAlphabet(str.charAt(i)))
			{
				if(c == 'z')
					c = 'b';

				else if (c=='Z')
					c = 'B';

				else 
					c++;
			}

			res += c;

		}
		return res;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = new String();

		System.out.println("Enter String: ");
		str = sc.next();

		str = alterString(str);

		System.out.println("New String after changes is: " + str);
	}
} 