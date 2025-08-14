package abstraction;

public class Abstractchild extends Abstractparent {
	public void meth() {
		System.out.println("Abstract method overriding");
	}

	public static void main(String[] args) {
		Abstractparent c=new Abstractchild();
		c.meth();
		c.display();
		// TODO Auto-generated method stub

	}

}
