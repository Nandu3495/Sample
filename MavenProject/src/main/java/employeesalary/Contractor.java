package employeesalary;
public  class Contractor extends Employee {
	int workinghours;
	Contractor(double paymentperhour, int workinghours){
		super(paymentperhour);
		this.workinghours=workinghours;}
double calculateSalary() {
	return paymentperhour*workinghours;
}

}
