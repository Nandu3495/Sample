package arraycolours;

import java.util.ArrayList;

public class ColourList {

	public static void main(String[] args) {
		  ArrayList<String> colours = new ArrayList<>();
	        colours.add("Red");
	        colours.add("Yellow");
	        colours.add("Green");
	        colours.add("Blue");
	        colours.add("Orange");
	        colours.add("Voilet");
	        System.out.println("List of colours: " + colours);
	        for (String clr : colours) {
	            System.out.println(clr);
	        }
		// TODO Auto-generated method stub

	}

}
