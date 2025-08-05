package multilevelinheritance;

public class Daughter extends Father{
	public void daughter() {
		System.out.println("Multilevel inheritance Daughter");
	}

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.grand();
		d.father();
		d.daughter();
		
		// TODO Auto-generated method stub

	}

}
