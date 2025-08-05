
public class Factnum {
	 int calculate(int number) {
	        int fact = 1;
	        for (int i = 1; i <= number; i++) {
	            fact *= i;
	        }
	        return fact;
	    }
	    void printResult(int number) {
	        int result = calculate(number);
	        System.out.println("Factorial of " + number + " is: " + result);
	    }

	public static void main(String[] args) {
		Factnum obj=new Factnum();
		obj.printResult(8);
		// TODO Auto-generated method stub

	}
}
