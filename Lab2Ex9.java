import java.util.*;

public class Lab2Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n;
      Scanner sc =new Scanner(System.in);
    		  n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
        System.out.println(minimum(arr,n));
	}
      static int minimum(int[] a,int number) {
		// TODO Auto-generated method stub
    	  Arrays.sort(a);  
    	  return a[1];   

	}



}