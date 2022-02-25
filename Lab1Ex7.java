
import java.util.*;
public class Lab1Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc=new Scanner(System.in);
		    int n;
		    n=sc.nextInt();
		    int cur=999999,p;
		    int flag=0;
		    while(n>0){
		      p=n%10;
		      if(cur<=p){
		        flag=1;
		        break;
		      }
		      cur=p;
		      n=n/10;
		    }
		    if(flag==1)
		    System.out.println("false");
		    else 
		    System.out.println("true");
		  }

		}