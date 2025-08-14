package abstraction;

public class Abstractionparent implements Abstractioninterface{
public void meth()
{
	System.out.println("Abstraction is parentclass");
}
	public static void main(String[] args) {
		Abstractioninterface a=new Abstractionparent();
		a.meth();
		// TODO Auto-generated method stub

	}

}
