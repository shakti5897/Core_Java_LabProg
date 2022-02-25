import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;

public class Lab3Ex7 {
	public static void duration(Date date1) {

		Date d1 = new Date();
		System.out.println(d1);

		long diff_in_day = d1.getDay() - date1.getDay();
		long diff_in_month = d1.getMonth() - date1.getMonth();
		long diff_in_year = d1.getYear() - date1.getYear();

		System.out.println("Difference is: " + diff_in_day + " days " + diff_in_month + " months " + diff_in_year + " years");
	}

	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the date in dd/mm/yyyy format");
		String str = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date date1 = sdf.parse(str);

		duration(date1);
	}
} 