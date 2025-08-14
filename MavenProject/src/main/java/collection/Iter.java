package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iter {

	public static void main(String[] args) {
		Set<String> fr = new HashSet<String>();
		fr.add("Apple");
		fr.add("Banana");
		fr.add("Mango");
		Iterator<String> i = fr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(fr);

	}

}
