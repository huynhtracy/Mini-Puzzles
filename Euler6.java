
public class Euler6 {

	//Find the difference between the sum of the squares of the first
	//one hundred natural numbers and the square of the sum.

	public static void main(String args []) {
		
	
		int sumOfSquares = 0;
		int squareOfSums = 0; 
		
		for (int i = 1; i < 101; i++) {
			sumOfSquares = sumOfSquares + (i*i);
					
			squareOfSums = squareOfSums + i;
			
		}
		
		
		squareOfSums = squareOfSums * squareOfSums;
		
		System.out.println(squareOfSums - sumOfSquares);
		
		
		
		
		
	}

	
	
}
