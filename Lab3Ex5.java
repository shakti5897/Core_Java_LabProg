import java.util.*;
import java.io.*;

public class Lab3Ex5 {

	public static void fileInfo(File f) throws Exception{
		int lines = 0, ch = 0, words = 0;

		FileInputStream fin = new FileInputStream(f);

		try {
			int n;
			while((n = fin.read()) != -1)
			{
				//System.out.println("Inside 1st while loop");
				ch++;
				if((char)n == ' ')
					words++;
			}

			Scanner sc = new Scanner(f);

			while(sc.hasNext())
			{
				//System.out.println("Inside 2nd while loop");
				lines++;
				sc.nextLine();
			}
		}

		catch(Exception e){
			e.printStackTrace();
		}

		finally{
			if(fin!= null)
				fin.close();
		}

		System.out.println("Numbers of characters are: " +  ch);
		System.out.println("Number of words are: " + words);
		System.out.println("Number of lines are: " + lines);	
	}

	public static void main(String args[])  throws Exception{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the path of the source of the file");
		String a = sc.nextLine();

		File f1 = new File(a);

		fileInfo(f1);
	}
}