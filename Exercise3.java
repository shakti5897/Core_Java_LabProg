package lab9;

import java.util.*;

interface intf3{
	boolean authID(String userID, String passID);
}
public class Exercise3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		intf3 f1 = (uID, pID) -> {
			if(uID.equals("123@xyz.com") && pID.equals("password"))
				return true;
			else
				return false;
		};

		String userId = sc.next();
		String passId = sc.next();

		System.out.println("Authentication is: " + f1.authID(userId, passId));
	}
} 