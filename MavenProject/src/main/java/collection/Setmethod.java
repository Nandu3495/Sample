package collection;

import java.util.HashSet;
import java.util.Set;

public class Setmethod {

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
for(String item:c) {
System.out.println(item);
}
System.out.println(s);
for(String item:s) {
System.out.println(item);
}
	}
}

