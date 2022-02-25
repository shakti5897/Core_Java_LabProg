package lab5;
import java.util.Scanner;

public class Exercise1 {

 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter your age: ");
  int age = s.nextInt();

  try {
   if(age <= 15) 
    throw new Exception("Invalid age");
   else
    System.out.println("Valid age");
  }
  catch (Exception a) {
   System.out.println(a);
  }
 }
}