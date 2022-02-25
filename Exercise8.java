import java.util.Scanner;

public class Exercise8 {

	public static boolean checkAlphabetic(String input) {
	    for (int i = 0; i != input.length(); ++i) {
	        if (!Character.isLetter(input.charAt(i))) {
	            return false;
	        }
	    }

	    return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     System.out.println(checkAlphabetic(str));

	}

}