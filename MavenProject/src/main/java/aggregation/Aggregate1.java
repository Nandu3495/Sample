package aggregation;

public class Aggregate1 {
	int i,j;
	Aggregate p;
	Aggregate1(int i,int j,Aggregate p)
	{
		this.i=i;
		this.j=j;
		this.p=p;
	}
public void display()
{
	System.out.println(i);
	System.out.println(j);
	System.out.println(p.a);
	System.out.println(p.d);
}
	public static void main(String[] args) {
		Aggregate t=new Aggregate(3,5);
		Aggregate1 s=new Aggregate1(7,8,t);
		s.display();
		// TODO Auto-generated method stub

	}

}
