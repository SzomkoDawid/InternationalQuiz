package germany;

import views.service.Answers;

import java.util.TreeMap;

public class GermanyAnswerImpl implements Answers {

    public TreeMap<Character, String> capital() {
        TreeMap<Character, String> cities = new TreeMap<>();
        cities.put('a', "Frankfurt");
        cities.put('b', "Monachium");
        cities.put('c', "Berlin");
        cities.put('d', "Dortmund");
        return cities;
    }
    public TreeMap<Character, Long> population() {
        TreeMap<Character, Long> population = new TreeMap<>();
        population.put('a', 65000000L);
        population.put('b', 48000000L);
        population.put('c', 70000000L);
        population.put('d', 83000000L);
        return population;
    }
    public TreeMap<Character, String> nationalDish() {
        TreeMap<Character, String> dishes = new TreeMap<>();
        dishes.put('a', "Hamburger");
        dishes.put('b', "Wurst");
        dishes.put('c', "Eggs & Bacon");
        dishes.put('d', "Ramen");
        return dishes;
    }
    public TreeMap<Character, String> colorsOfFlag() {
        TreeMap<Character, String> colors = new TreeMap<>();
        colors.put('a', "Green&White&Red");
        colors.put('b', "Red&White&Blue");
        colors.put('c', "Black&Red&Yellow");
        colors.put('d', "Blue&White&Yellow");
        return colors;
    }
    public TreeMap<Character, String> primeMinister() {
        TreeMap<Character, String> primeMinister = new TreeMap<>();
        primeMinister.put('a', "Angela Merkel");
        primeMinister.put('b', "Sepp Platter");
        primeMinister.put('c', "Yupp Heyhnkens");
        primeMinister.put('d', "Dietmar Hamman");
        return primeMinister;
    }
    public TreeMap<Character, String> currency() {
        TreeMap<Character, String> currency = new TreeMap<>();
        currency.put('a', "Zloty");
        currency.put('b', "Euro");
        currency.put('c', "Dollar");
        currency.put('d', "Frank");
        return currency;
    }
    public TreeMap<Character, String> neighborhood() {
        TreeMap<Character, String> neighbours = new TreeMap<>();
        neighbours.put('a', "Portugal");
        neighbours.put('b', "Spain");
        neighbours.put('c', "Slovakia");
        neighbours.put('d', "Belgium");
        return neighbours;
    }
    public TreeMap<Character, String> alcohol() {
        TreeMap<Character, String> alcohol = new TreeMap<>();
        alcohol.put('a', "Whiskey");
        alcohol.put('b', "Vodka");
        alcohol.put('c', "Tequila");
        alcohol.put('d', "Beer");
        return alcohol;
    }
    public TreeMap<Character, String> politicalSystem() {
        TreeMap<Character, String> politicalSystem = new TreeMap<>();
        politicalSystem.put('a', "Republic");
        politicalSystem.put('b', "Dictatorship");
        politicalSystem.put('c', "Monarchy");
        politicalSystem.put('d', "Democracy");
        return politicalSystem;
    }
    public TreeMap<Character, String> monuments() {
        TreeMap<Character, String> monuments = new TreeMap<>();
        monuments.put('a', "Palace of Culture");
        monuments.put('b', "Brandenburg Gate");
        monuments.put('c', "Casa Mila");
        monuments.put('d', "Tower Bridge");
        return monuments;
    }
}
