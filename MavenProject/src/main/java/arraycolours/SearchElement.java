package arraycolours;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Orange");
        colours.add("Voilet");
        System.out.println("List of colours: " + colours);
        String searchcolour = "Purple";
        if (colours.contains(searchcolour)) {
            System.out.println(searchcolour + " is found in the list.");
        } else {
            System.out.println(searchcolour + " is not found in the list.");
        }


	}

}
