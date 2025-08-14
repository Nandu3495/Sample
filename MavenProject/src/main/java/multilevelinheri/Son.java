package multilevelinheri;

public class Son extends Mother {
	public void son() {
		System.out.println("son multilevel inheritance");
	}

	public static void main(String[] args) {
		Son s=new Son();
		s.grnd();
		s.mother();
		s.son();
		// TODO Auto-generated method stub

	}

}
