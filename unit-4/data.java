public class For {
	public static void main(String[] args) {

		for (int waterLevel = 0; waterLevel < 7; waterLevel++) {

			System.out.println("The pool's water level is at " + waterLevel + " feet.");

		}
    import java.util.ArrayList;

    public class TemperaturesForEach {
  	public static void main(String[] args) {

		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
	  	weeklyTemperatures.add(78);
	  	weeklyTemperatures.add(67);
	  	weeklyTemperatures.add(89); 
	  	weeklyTemperatures.add(94);
		
		for (Integer temperature : weeklyTemperatures) {
			System.out.println(temperature);
		}
	
	}
}

import java.util.HashMap;

public class Restaurant {
	public static void main(String[] args) {

	HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

	}
}

import java.util.HashMap;

  public class Restaurant {
	public static void main(String[] args) {

	HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();
		
		restaurantMenu.put("Turkey Burger", 13);
		restaurantMenu.put("Naan Pizza", 11);
    restaurantMenu.put("Cranberry Kale Salad", 10);

		System.out.println(restaurantMenu.get("Naan Pizza") );
		System.out.println(restaurantMenu.size() );

		for (String item : restaurantMenu.keySet()) {

			System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");

		}

	}
}
