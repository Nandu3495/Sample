package singleinheritance;

public class SingleChildclass extends Parentclass {
	public void child() {
		System.out.println("Single inheritance Child class");
	}

	public static void main(String[] args) {
		SingleChildclass c = new SingleChildclass();
		c.child();
		c.parent();
		// TODO Auto-generated method stub

	}

}
