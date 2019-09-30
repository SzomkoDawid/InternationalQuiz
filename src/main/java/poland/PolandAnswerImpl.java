package poland;

import views.service.Answers;

import java.util.TreeMap;

public class PolandAnswerImpl implements Answers {

    public TreeMap<Character, String> capital() {
        TreeMap<Character, String> cities = new TreeMap<>();
        cities.put('a', "Kraków");
        cities.put('b', "Warszawa");
        cities.put('c', "Białystok");
        cities.put('d', "Poznań");
        return cities;
    }
    public TreeMap<Character, Long> population() {
        TreeMap<Character, Long> population = new TreeMap<>();
        population.put('a', 50000000L);
        population.put('b', 40000000L);
        population.put('c', 70000000L);
        population.put('d', 60000000L);
        return population;
    }
    public TreeMap<Character, String> nationalDish() {
        TreeMap<Character, String> dishes = new TreeMap<>();
        dishes.put('a', "Pierogi");
        dishes.put('b', "Sushi");
        dishes.put('c', "Ramen");
        dishes.put('d', "Wurst");
        return dishes;
    }
    public TreeMap<Character, String> colorsOfFlag() {
        TreeMap<Character, String> colors = new TreeMap<>();
        colors.put('a', "Red&Black");
        colors.put('b', "White&Yellow");
        colors.put('c', "White&Red");
        colors.put('d', "Black&Blue");
        return colors;
    }
    public TreeMap<Character, String> primeMinister() {
        TreeMap<Character, String> primeMinister = new TreeMap<>();
        primeMinister.put('a', "Beata Szydło");
        primeMinister.put('b', "Jarosław Kaczyński");
        primeMinister.put('c', "Andrzej Duda");
        primeMinister.put('d', "Mateusz Morawiecki");
        return primeMinister;
    }
    public TreeMap<Character, String> currency() {
        TreeMap<Character, String> currency = new TreeMap<>();
        currency.put('a', "Funt");
        currency.put('b', "Zloty");
        currency.put('c', "Dollar");
        currency.put('d', "Euro");
        return currency;
    }
    public TreeMap<Character, String> neighborhood() {
        TreeMap<Character, String> neighbours = new TreeMap<>();
        neighbours.put('a', "Slovenia");
        neighbours.put('b', "Ukraine");
        neighbours.put('c', "Latvia");
        neighbours.put('d', "Estonia");
        return neighbours;
    }
    public TreeMap<Character, String> alcohol() {
        TreeMap<Character, String> alcohol = new TreeMap<>();
        alcohol.put('a', "Vodka");
        alcohol.put('b', "Jagermaister");
        alcohol.put('c', "Whiskey");
        alcohol.put('d', "Rum");
        return alcohol;
    }
    public TreeMap<Character, String> politicalSystem() {
        TreeMap<Character, String> politicalSystem = new TreeMap<>();
        politicalSystem.put('a', "Communism");
        politicalSystem.put('b', "Monarchy");
        politicalSystem.put('c', "Republic");
        politicalSystem.put('d', "Democracy");
        return politicalSystem;
    }
    public TreeMap<Character, String> monuments() {
        TreeMap<Character, String> monuments = new TreeMap<>();
        monuments.put('a', "Palace of Culture");
        monuments.put('b', "Facade of Saint Francis");
        monuments.put('c', "Mea Solena");
        monuments.put('d', "Big Ben");
        return monuments;
    }
}
