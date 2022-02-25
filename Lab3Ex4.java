import java.util.*;

public class Lab3Ex4 {

	public static int modifyNumber(int num)
	{
		int temp = num, digit=0;

		//calculating the number of digits.
		while(temp > 0)
		{
			digit++;
			temp/=10;
		}

		//creating a array based on the digits
		int arr[] = new int[digit];
		//creating a simple int iterator
		int i =0;
		digit = 0;
		temp = num;

		//creating a array of input number in reverse
		while(temp>0)
		{
			digit = temp%10;
			arr[i++] = digit;
			temp = temp/10;
		}

		//reversing the array to get the original place back of the digits.
		for(i=0; i<=(arr.length)/2; i++)
		{
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		//updating the array with new digit which is absolute diff. between two cons. numbers
		for(i=0; i<arr.length-1; i++)
		{
			arr[i] = Math.abs(arr[i] - arr[i+1]);
		}

//		for(i=0; i<arr.length; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}

		int res = 0; //creating a number from the obtained array
		for(i=0; i<arr.length; i++)
		{
			res = res*10;
			res+=arr[i];
		}

//		System.out.println(res);

		return res;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int num = sc.nextInt();

		num = modifyNumber(num);

		System.out.println("Modified Number is: " + num);
	}
} 