package basicofjava;

public class OddNumbers {

	public static void main(String[] args) {
		 int num = 521;
	        
	        System.out.println("Odd numbers between 521 and 229:");
	        
	        while (num >= 229) {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	            num--;
	        }
	    }

	}
