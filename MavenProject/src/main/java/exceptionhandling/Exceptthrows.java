package exceptionhandling;

public class Exceptthrows {

	public static void main(String[] args) throws VotingException {
		int age=12;
		if(age>=18)
		{
			System.out.println("Qualified for License");
		}
		else
		{
			throw new VotingException("Age is below 18");
		}
		// TODO Auto-generated method stub

	}

}
