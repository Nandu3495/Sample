package polymorphism;

public class Child1 extends Runtimepoly {
	public void parent()
	{
		super.parent();// to call Parentclass method
		System.out.println("Runtime polymorphism in Childclass");
	}

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.parent();
		Runtimepoly r=new Child1();// upcasting
		r.parent();
		// TODO Auto-generated method stub

	}

}
