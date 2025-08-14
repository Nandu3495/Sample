package exceptionhandling;

public class Excepthand {

	public static void main(String[] args) {
		try {
		int num=5/0;
		System.out.println(num);	
		}
//catch(ArithmeticException e) {
	//System.out.println(e);
//}
		finally {
			System.out.println("Arithmetic Expression");
		}
	}
}