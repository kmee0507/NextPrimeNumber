import java.util.*;
public class NextPrimeNumber {
	
	
	static boolean isPrime(int n) {
	    if (n == 2)
	    	return true;
	    if (n%2==0) return false;
	    
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String keepGoing = "y";
		int counter = 1;
		int number = 1;
		boolean prime = false;
		while (keepGoing.equals("y")){
			System.out.println("Prime Number " + counter + ":");
			while (!prime){
				number +=1;
				prime = isPrime(number);
				
			}
			if(prime)
				System.out.println(number);
			System.out.print("\nDo you want to keep going(y/n)? ");
			keepGoing = sc.nextLine().toLowerCase();
			while(!keepGoing.equals("y") && !keepGoing.equals("n")){
				System.out.print("Invalid Input, Do you want to keep going(y/n)? ");
				keepGoing = sc.nextLine().toLowerCase();
			}
			counter+=1;
			prime = false;
			System.out.println("");
		}
		
	}

}
