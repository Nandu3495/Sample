package employeesalary;

public class ChildA extends ParentA {
	double hra, pf, TS;
	public void calculate()
	{
		hra = basicpay*5/100;
		pf = basicpay*20/100;
		TS = basicpay+bon+hra-ded-pf;
	}

}
