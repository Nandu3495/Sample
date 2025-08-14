package collection;

import java.util.HashSet;
import java.util.Set;

public class Methodset {

	public static void main(String[] args) {
		Set<String> c= new HashSet<String>();
		Set<String> s= new HashSet<String>();
		c.add("Dresses");
		c.add("Books");
		c.add("Tools");
		s.add("Cars");
		s.add("Boxes");
		s.add("Tables");
		System.out.println(c);
		System.out.println(s);
		c.addAll(s);
		System.out.println(c);
		System.out.println(s.size());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("Books"));
		System.out.println(s.containsAll(c));
		s.remove("Boxes");
		System.out.println(s);
		c.removeAll(s);
		System.out.println(c);
		s.clear();
		System.out.println(s);
		
		// TODO Auto-generated method stub

	}

}
