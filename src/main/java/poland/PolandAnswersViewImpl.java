package poland;

import views.Countries;
import views.service.AnswersView;

import java.util.Map;
import java.util.Scanner;

public class PolandAnswersViewImpl implements AnswersView {

    private static final Countries COUNTRIES = new Countries();
    private Scanner scanner = new Scanner(System.in);
    private int points;

    public String capitalCorrectAnswer() {
        String capital = "";
        for (Map.Entry<Character, String> map : COUNTRIES.polandAnswer.capital().entrySet()) {
            if (map.getValue().equals("Warszawa")) {
                char answer = scanner.next().charAt(0);
                if (answer == map.getKey()) {
                    points++;
                    capital = "Correct answer!";
                } else {
                    capital = "Incorrect answer :(";
                }
            }
        }
        return capital;
    }
    public String populationCorrectAnswer() {
        String population = "";
        for (Map.Entry<Character, Long> map : COUNTRIES.polandAnswer.population().entrySet()) {
            if (map.getValue().equals(40000000L)) {
                char answer = scanner.next().charAt(0);
                if (answer == map.getKey()) {
                    points++;
                    population = "Correct answer!";
                } else {
                    population = "Correct answer!";
                }
            }
        }
        return population;
    }
    public String nationalDishCorrectAnswer() {
        String nationalDish = "";
        for (Map.Entry<Character, String> map : COUNTRIES.polandAnswer.nationalDish().entrySet()) {
            if (map.getValue().equals("Pierogi")) {
                char answer = scanner.next().charAt(0);
                if (answer == map.getKey()) {
                    points++;
                    nationalDish = "Correct answer!";
                } else {
                    nationalDish = "Incorrect answer :(";
                }
            }
        }
        return nationalDish;
    }
    public String colorsOfFlagAnswer() {
        String colors = "";
        for (Map.Entry<Character, String> map : COUNTRIES.polandAnswer.colorsOfFlag().entrySet()) {
            if (map.getValue().equals("White&Red")) {
                char answer = scanner.next().charAt(0);
                if (answer == map.getKey()) {
                    points++;
                    colors = "Correct answer!";
                } else {
                    colors = "Incorrect answer :(";
                }
            }
        }
        return colors;
    }
    public String primeMinisterAnswer() {
        String primeMinister = "";
        for (Map.Entry<Character, String> map : COUNTRIES.polandAnswer.primeMinister().entrySet()) {
            if (map.getValue().equals("Mateusz Morawiecki")) {
                char answer = scanner.next().charAt(0);
                if (answer == map.getKey()) {
                    points++;
                    primeMinister = "Correct answer!";
                } else {
                    primeMinister = "Incorrect answer :(";
                }
            }
        }
        return primeMinister;
    }

    public String currencyAnswer() {
        String currency = "";
        for (Map.Entry<Character, String> map : COUNTRIES.polandAnswer.currency().entrySet()) {
            if (map.getValue().equals("Zloty")) {
                char answer = scanner.next().charAt(0);
                if (answer == map.getKey()) {
                    points++;
                    currency = "Correct answer!";
                } else {
                    currency = "Incorrect answer :(";
                }
            }
        }
        return currency;
    }
    public String neighbourhoodAnswer() {
        String neighbours = "";
        for (Map.Entry<Character, String> map : COUNTRIES.polandAnswer.neighborhood().entrySet()) {
            if (map.getValue().equals("Ukraine")) {
                char answer = scanner.next().charAt(0);
                if (answer == map.getKey()) {
                    points++;
                    neighbours = "Correct answer!";
                } else {
                    neighbours = "Incorrect answer!";
                }
            }
        }
        return neighbours;
    }
    public String alcoholAnswer() {
        String alcohol = "";
        for (Map.Entry<Character, String> map : COUNTRIES.polandAnswer.alcohol().entrySet()) {
            if (map.getValue().equals("Vodka")) {
                char answer = scanner.next().charAt(0);
                if (answer == map.getKey()) {
                    points++;
                    alcohol = "Correct answer!";
                } else {
                    alcohol = "Incorrect answer :(";
                }
            }
        }
        return alcohol;
    }

    public String politicalSystemAnswer() {
        String politicalSystem = "";
        for (Map.Entry<Character, String> map : COUNTRIES.polandAnswer.politicalSystem().entrySet()) {
            if (map.getValue().equals("Democracy")) {
                char answer = scanner.next().charAt(0);
                if (answer == map.getKey()) {
                    points++;
                    politicalSystem = "Correct answer!";
                } else {
                    politicalSystem = "Incorrect answer :(";
                }
            }
        }
        return politicalSystem;
    }


    public String monumentsAnswer() {
        String monuments = "";
        for (Map.Entry<Character, String> map : COUNTRIES.polandAnswer.monuments().entrySet()) {
            if (map.getValue().equals("Palace of Culture")) {
                char answer = scanner.next().charAt(0);
                if (answer == map.getKey()) {
                    points++;
                    monuments = "Correct answer!";
                } else {
                    monuments = "Incorrect answer :(";
                }
            }
        }
        return monuments;
    }

    public String result() {
        String result = "";
        if (points == 1){
            result = "Your result is " + points + " point";
        } else {
            result = "Your result is " + points + " points";
        }
        return result;
    }
    public void rating(){
        if (points <= 3){
            System.out.println("Maybe you should watch the news often?");
        }
        if (points > 3 && points <= 6){
            System.out.println("Not bad");
        }
        if (points == 7 || points == 8){
            System.out.println("Great result! But you made a mistake somewhere");
        }
        if (points == 9){
            System.out.println("Almost perfect");
        }
        if (points == 10){
            System.out.println("You are real globetrotter!");
        }
    }
}
