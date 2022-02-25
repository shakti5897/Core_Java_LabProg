

import java.util.*;
import java.io.*;

public class Lab10Ex2 {
	public static void fileDetails(File x) throws Exception{
		System.out.println("Information about the file are given below:");

		System.out.println("File Exist: " + x.exists());

		System.out.println("File Readability Status: " + x.canRead());

		System.out.println("File Writeabilty Status: " + x.canWrite());

		//File Extension
		String extension = "";

		int i = x.getName().lastIndexOf(".");

		if(i>=0)
		{
			extension = x.getName().substring(i+1);
		}

		System.out.println("File Extension: " + extension);

		System.out.println("Length of the File: " + x.length() + "Bytes");
	}

	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the path of source file: ");

		String path = sc.nextLine();

		File a  = new File(path);

		fileDetails(a);
	}
} 