
public class Euler2 {
	
	//By considering the terms in the Fibonacci sequence whose values do not
	//exceed four million, find the sum of the even-valued terms.
	
	public static void main(String args []) {
		
		
		int sum = 2;
		int n1 = 1;
		int n2 = 2;
		int n3 = 0;; 
		
		while (true) {
			
			n3 = n1 + n2; 
			
			if (n3 >= 4000000) {
				break;
			}
			
			//do we have to check this twice?
			
			System.out.println(n3);
			
			if (n3%2 == 0) {
				//if its even, add it to the sum
				sum = sum + n3;
				//System.out.println("Sum "+ sum);
			}
			
			n1 = n2; 
			n2 = n3;
			
		}
		
		System.out.println("Total Sum: " +sum);
		
	}
		

}
