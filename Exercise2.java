package lab5;
import java.util.*;

public class Exercise2 {


	  public static void main(String[] args){
	    Scanner s= new Scanner(System.in);
	    String c;
	    System.out.print("First Name:");
	    String fname=s.nextLine();
	    System.out.print("Second Name: ");
	    String lname=s.nextLine();

	    try{
	      if(fname.isEmpty()||lname.isEmpty()){
	      throw new Exception("First name and last name can't be blank");     
	      }
	      else
	      System.out.println("Name:"+fname+" "+lname);
	    }
	    catch(Exception e){
	      System.out.println(e);
	    }
	  }
	} 