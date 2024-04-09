package dataStructures;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        /*
         * Lists are ordered collections that allow duplicate elements and offer dynamic
         * resizing.
         */

        ArrayList<String> cities = new ArrayList<>();
        cities.add("São Paulo");
        cities.add("Rio de Janeiro");
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");

        System.out.println("Oficial List: \n");
        for (String city : cities) {
            System.out.println("City: " + city);
        }

        cities.remove(0);
        cities.remove(1);

        System.out.println("\nOficial List Updated: \n");
        for (String city : cities) {
            System.out.println("City: " + city);
        }

        /*
         * Oficial List:
         * 
         * City: São Paulo
         * City: Rio de Janeiro
         * City: New York
         * City: London
         * City: Paris
         * 
         * Oficial List Updated:
         * 
         * City: Rio de Janeiro
         * City: London
         * City: Paris
         */
    }
}
