package exceptionhandling;

public class Except1 {

	public static void main(String[] args) {
		int age=12;
		if(age>=18)
		{
			System.out.println("Qualified for License");
		}
		else
		{
			throw new ArithmeticException("Age is below 18");
		}
		
		// TODO Auto-generated method stub

	}

}
