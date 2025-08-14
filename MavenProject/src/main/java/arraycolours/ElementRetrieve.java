package arraycolours;

import java.util.ArrayList;

public class ElementRetrieve {

	public static void main(String[] args) {
		 ArrayList<String> colours = new ArrayList<>();
	        colours.add("Red");
	        colours.add("Yellow");
	        colours.add("Green");
	        colours.add("Blue");
	        colours.add("Orange");
	        colours.add("Voilet");
	        int index=3;
	        String element = colours.get(index);
	        System.out.println("Element at index is: " + element);
		// TODO Auto-generated method stub

	}

}
