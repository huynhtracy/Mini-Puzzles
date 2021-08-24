
public class Euler9 {
	
	//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

	//a2 + b2 = c2
	//For example, 3^2 + 4^2 = 25 = 5^2.

	//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	
	//Find the product abc.
	
	
	public static void main (String args []) {
		
		//the different ways you can sum to 1000:
		
		//if its in 3 series:
		//1,...						2,                 3,         		 4,5, .... 997
		//2,3,...996, 997			3,4,.....995  	   4,5,...993
		//997,996, ..3,2			995,994,.... 3 	   993, 992, ...4
		

		//there is redundancy...definitely
		
		int c = 0;
			
		for (int a = 1; a < 999; a++) {
			for (int b = 2; b <= 997; b++){
		
				c = 1000 - a - b;
					
					if ((a*a)+(b*b)==(c*c)) {
						System.out.println(a + " " + b + " " + c);
						System.out.println(a*b*c);
						break;
					}
								
			}
	
		}
		
		
	}
	

}
