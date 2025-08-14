
public class HDFC implements rbi {
public void recurringdeposit(double amount, int duration)
{
	double totaldeposit = amount*duration * 12;
	double interest = (totaldeposit*interestrate*duration)/100;
	double maturityamount = totaldeposit+interest;
	System.out.println("Monthly deposit amount: " + amount);
	System.out.println("Duration:" + duration);
	System.out.println("Interestrate:" + interestrate);
	System.out.println("Maturity amount" +duration + "years:" + maturityamount);
}
}
