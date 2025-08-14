package atmpin;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter your ATM pin");
		int enteredpin=c.nextInt();
				Bank bank=new Bank();
		bank.setPin(enteredpin);
		bank.validatepin();
		// TODO Auto-generated method stub
c.close();
	}

}
