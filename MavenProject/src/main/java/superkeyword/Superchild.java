package superkeyword;

public class Superchild extends Superparent {
int a=40;
public void display() {
	System.out.println("super a");
	System.out.println(a);
	}
	public static void main(String[] args) {
		Superchild s=new Superchild();
		s.display();
		}
		// TODO Auto-generated method stub

	}

