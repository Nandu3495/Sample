package arraycolours;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		 ArrayList<String> colours = new ArrayList<>();
	        colours.add("Red");
	        colours.add("Yellow");
	        colours.add("Green");
	        colours.add("Blue");
	        colours.add("Orange");
	        colours.add("Voilet");
	        System.out.println("List of colours: " + colours);
	        colours.remove(4);

	        System.out.println("After removing fifth element: " + colours);
	    }

	}

