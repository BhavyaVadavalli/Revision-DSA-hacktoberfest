

class Fibanocci {

	
	static void Fibonacci(int N)
	{
		int num1 = 1, num2 = 3;

		int counter = 0;


		while (counter < N) {

	
			System.out.print(num1 + " ");

			
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}


	public static void main(String args[])
	{
		
		int N = 5;

	
		Fibonacci(N);
	}
}
