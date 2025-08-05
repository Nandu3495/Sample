package employeesalary;

public class ChildB extends ChildA{

	public static void main(String[] args) {
		ChildB obj=new ChildB();
		obj.calculate();
		obj.salaryslip();
	}
	public void salaryslip()
	{
		System.out.println("Salary slip");
		System.out.println("Basic Pay :"+basicpay);
		System.out.println("Deduction :"+ded);
		System.out.println("HRA :"+hra);
		System.out.println("Provident fund :"+pf);
		System.out.println("Bonus :"+bon);
		System.out.println("Total salary :"+TS);
		// TODO Auto-generated method stub

	}

}
