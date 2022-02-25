
 import java.util.*;


public class Lab1Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. Red\n2.Green\n3.Yellow");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Stop");
			break;

		case 2:
			System.out.println("Go");
			break;

		case 3:
			System.out.println("Ready");
			break; 
		default:
				System.out.println("Invalid Input");

		}

	}

}