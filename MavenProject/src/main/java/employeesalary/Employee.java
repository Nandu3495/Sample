package employeesalary;

abstract class Employee {
	double paymentperhour;
	Employee(double paymentperhour){
		this.paymentperhour=paymentperhour;
	}
abstract double calculateSalary();
}
