package superkeyword;

public class Childmeth extends Parentmeth {
	public void display() {
		System.out.println("child class super");
	}
	public void methcall() {
		super.display();
		display();
	}

	public static void main(String[] args) {
		Childmeth c=new Childmeth();
		c.methcall();
		// TODO Auto-generated method stub

	}

}
