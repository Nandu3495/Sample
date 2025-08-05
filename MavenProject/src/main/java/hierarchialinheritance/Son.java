package hierarchialinheritance;

public class Son extends Singleparent{
public void childson() {
	System.out.println("Son Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		Childdaughter d=new Childdaughter();
		s.childson();
		d.daughter();
		d.parent();
		s.parent();

	}

}
