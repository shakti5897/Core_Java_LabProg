package lab9;

class FactNum{
	int num;

	FactNum(){
	}

	public int factorialNum(int num) {
		int res = 1;

		for(int i=1; i<=num; i++)
			res *= i;

		return res;
	}
}

@FunctionalInterface
interface intf5{
	int fact(int num);
}

public class Exercise5 {

	public static void main(String args[]) {
		FactNum f = new FactNum();

		intf5  f1 = f::factorialNum; //method reference to a non static method of the FactNum class

		System.out.println("Factorial of the num is:" + f1.fact(5));
	}
} 