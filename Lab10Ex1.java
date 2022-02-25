

import java.io.*;
import java.util.*;

public class Lab10Ex1 {
	public static void dispFile(File a) throws Exception{

		try {
			Scanner sc = new Scanner(a);
			String line;
			int i = 1;
			while(sc.hasNextLine())
			{
				line = sc.nextLine();
				System.out.println(i++ + " " + line);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("File Read Completely");
		}
	}


	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the path of source file: ");
		String a = sc.nextLine();

		File x = new File(a);

		dispFile(x);
	}
} 