
public class Euler5 {

	//2520 is the smallest number that can be divided by
	//each of the numbers from 1 to 10 without any remainder.

	//What is the smallest positive number that is evenly divisible
	//by all of the numbers from 1 to 20?
	
	public static void main (String args[]) {
		
		int N = 1; 
		int streak = 0;
		
		while (true) {
			for (int i = 1; i <= 20; i++) {
				if (N%i == 0) {
					streak++;
					
					if(streak == 20) {
						System.out.println("done");
						System.out.println(N);
					}
				}
				else {
					break;
				} 
				
			}
			if (streak == 20) {
				break;
			}
			streak =0;
			N++;
		}

	}
}