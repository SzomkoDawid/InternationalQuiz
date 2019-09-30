package england;
import views.service.Answers;
import java.util.TreeMap;

public class EnglandAnswerImpl implements Answers {

    public TreeMap<Character, String> capital() {
        TreeMap<Character, String> cities = new TreeMap<>();
        cities.put('a', "London");
        cities.put('b', "Birmingham");
        cities.put('c', "Manchester");
        cities.put('d', "Liverpool");
        return cities;
    }
    public TreeMap<Character, Long> population() {
        TreeMap<Character, Long> population = new TreeMap<>();
        population.put('a', 56000000L);
        population.put('b', 40000000L);
        population.put('c', 75000000L);
        population.put('d', 61000000L);
        return population;
    }
    public TreeMap<Character, String> nationalDish() {
        TreeMap<Character, String> dishes = new TreeMap<>();
        dishes.put('a', "Pizza");
        dishes.put('b', "Pasta");
        dishes.put('c', "Eggs & Bacon");
        dishes.put('d', "Pierogi");
        return dishes;
    }
    public TreeMap<Character, String> colorsOfFlag() {
        TreeMap<Character, String> colors = new TreeMap<>();
        colors.put('a', "White&Blue");
        colors.put('b', "White&Yellow");
        colors.put('c', "White&Red");
        colors.put('d', "White&Black");
        return colors;
    }
    public TreeMap<Character, String> primeMinister() {
        TreeMap<Character, String> primeMinister = new TreeMap<>();
        primeMinister.put('a', "Tony Blair");
        primeMinister.put('b', "James Harwood");
        primeMinister.put('c', "Harry Garrington");
        primeMinister.put('d', "Theresa May");
        return primeMinister;
    }
    public TreeMap<Character, String> currency() {
        TreeMap<Character, String> currency = new TreeMap<>();
        currency.put('a', "Funt");
        currency.put('b', "Jen");
        currency.put('c', "Dollar");
        currency.put('d', "Frank");
        return currency;
    }
    public TreeMap<Character, String> neighborhood() {
        TreeMap<Character, String> neighbours = new TreeMap<>();
        neighbours.put('a', "Austria");
        neighbours.put('b', "Belgium");
        neighbours.put('c', "Italy");
        neighbours.put('d', "Scotland");
        return neighbours;
    }
    public TreeMap<Character, String> alcohol() {
        TreeMap<Character, String> alcohol = new TreeMap<>();
        alcohol.put('a', "Gin");
        alcohol.put('b', "Whiskey");
        alcohol.put('c', "Vodka");
        alcohol.put('d', "Beer");
        return alcohol;
    }
    public TreeMap<Character, String> politicalSystem() {
        TreeMap<Character, String> politicalSystem = new TreeMap<>();
        politicalSystem.put('a', "Democracy");
        politicalSystem.put('b', "Comumnism");
        politicalSystem.put('c', "Monarchy");
        politicalSystem.put('d', "Republic");
        return politicalSystem;
    }
    public TreeMap<Character, String> monuments() {
        TreeMap<Character, String> monuments = new TreeMap<>();
        monuments.put('a', "Eiffel Tower");
        monuments.put('b', "Big Ben");
        monuments.put('c', "Statue of Liberty");
        monuments.put('d', "Colosseum");
        return monuments;
    }
}
