import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContinentFinder {
    private static final Map<String, String> countryToContinentMap;

    static {
        countryToContinentMap = new HashMap<>();
        countryToContinentMap.put("USA", "North America");
        countryToContinentMap.put("Canada", "North America");
        countryToContinentMap.put("Brazil", "South America");
        countryToContinentMap.put("India", "Asia");
        countryToContinentMap.put("China", "Asia");
        countryToContinentMap.put("Russia", "Europe/Asia");
        // Add more mappings as needed
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the country you come from: ");
        String country = scanner.nextLine();

        String continent = getContinent(country);
        if (continent != null) {
            System.out.println("Hello " + name + "! " + country + " is in " + continent + ".");
        } else {
            System.out.println("Wow, I have no idea where that is.");
        }
    }

    public static String getContinent(String country) {
        return countryToContinentMap.get(country);
    }
}
