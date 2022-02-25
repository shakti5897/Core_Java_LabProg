import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Exercise9 {
   public static void main(String[] args) {
	   int y,m,d;
	   Scanner sc=new Scanner(System.in);
	   y=sc.nextInt();
	   m=sc.nextInt();
	   d=sc.nextInt();
      LocalDate date1 = LocalDate.of(y, m, d);
      LocalDate date2 = LocalDate.of(2022,2,18);
      System.out.println("Date 1 = "+date1);
      System.out.println("Date 2 = "+date2);
      Period p = Period.between(date1, date2);
      System.out.println("Period = "+p);
      System.out.println("Years (Difference) = "+p.getYears());
      System.out.println("Month (Difference) = "+p.getMonths());
      System.out.println("Days (Difference) = "+p.getDays());
   }
} 