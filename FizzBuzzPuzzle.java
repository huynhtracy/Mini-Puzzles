import java.util.Scanner;

public class FizzBuzzPuzzle {
	
	public static void main(String args[]) {
		
		int N;

		
		System.out.println("Fizz Buzz!");
		
		//Print integers 1 to N
		//“Fizz” if an integer is divisible by 3
		//“Buzz” if an integer is divisible by 5
		//“FizzBuzz” if an integer is divisible by both 3 and 5
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number, N: ");
		N = input.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			if(i%3 ==0) {
				//if divisible by 3
				System.out.print("Fizz");
			}
			
			if(i%5==0) {
				//if divisible by 5
				System.out.print("Buzz");
			}
			
			if (i%3 !=0 && i%5 !=0) {
				//if neither
				System.out.print(i);
			}
			
			System.out.println();
			
			
		}
		
	}

}
