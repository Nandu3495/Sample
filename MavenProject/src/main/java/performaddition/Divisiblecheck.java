package performaddition;

public class Divisiblecheck extends Addition {
	   Divisiblecheck(int a, int b) {
	        super(a, b); // Call Addition class constructor
	    }

	   public void checkDivisibleBy10() {
	        int result = super.Result(); // Access result using super
	        System.out.println("Addition Result: " + result);
	        if (result % 10 == 0) {
	            System.out.println("The result is divisible by 10.");
	        } else {
	            System.out.println("The result is NOT divisible by 10.");
	        }
	    }

	public static void main(String[] args) {
		 Divisiblecheck obj = new Divisiblecheck(30, 15);
	        obj.checkDivisibleBy10();
		  
		// TODO Auto-generated method stub

	}

}
