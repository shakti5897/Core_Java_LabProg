package lab9;

import java.util.*;

interface intf2{
	String modifyString(String str);
}

public class Exercise2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String str = new String();
		str = sc.next();

		intf2 f1 = (st) -> {

			char[] ch1 = new char[st.length() * 2];
			for(int i=0, j=0; i<st.length(); i++)
			{	
				ch1[j++] = st.charAt(i);
				ch1[j++] = ' ';
			}

			return Arrays.toString(ch1); 
		};

		str = f1.modifyString(str);
		str = str.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\,", ""); // used to remove all aditionals like [ ] ,
		System.out.println("Modified String: " + str);
	}

} 