package lab5;
import java.util.*;



class EmployeeException extends Exception {
    public EmployeeException(String x)
    {
      super(x);
    }
}
class Excercise3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    try{
      if(n<3000)
      throw new EmployeeException("Salary less than 3000");
      else 
      System.out.print("Salary:"+n);
    }
    catch(EmployeeException e){
      System.out.println(e.getMessage());
    }

  }
} 