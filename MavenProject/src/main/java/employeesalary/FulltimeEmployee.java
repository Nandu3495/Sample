package employeesalary;

public class FulltimeEmployee extends Employee {
	FulltimeEmployee(double paymentperhour)
	{
		super(paymentperhour);
	}
double calculateSalary() {
	return paymentperhour*8;
}
	public static void main(String[] args) {
		Contractor contractor = new Contractor(50,6);
		FulltimeEmployee fulltime = new FulltimeEmployee(50);
		System.out.println("Contractor Salary:" + contractor.calculateSalary());
		System.out.println("FulltimeEmployee Salary:" + fulltime.calculateSalary());
		// TODO Auto-generated method stub

	}

}
