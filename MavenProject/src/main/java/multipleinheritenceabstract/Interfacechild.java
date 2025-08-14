package multipleinheritenceabstract;

public class Interfacechild implements Interfaceparent {
	public void meth() {
		System.out.println("Parent interface child");
		}
	public void display() {
		System.out.println("Parent interface child1");
	}
public void childmeth() {
	System.out.println("Child interface method");
}
	public static void main(String[] args) {
		Interfacechild c=new Interfacechild();
		c.meth();
		c.display();
		c.childmeth();
		// TODO Auto-generated method stub

	}

}
