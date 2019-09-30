package questions;

import java.util.TreeMap;

public class QuestionImpl implements Question {
    public TreeMap<Integer, String> questions() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "What is capital city of this country?");
        map.put(2, "What is the population of the country?");
        map.put(3, "What is the national dish of this country?");
        map.put(4, "What are the colors on this country's flag?");
        map.put(5, "Who is the prime minister of this country?");
        map.put(6, "What is the main currency of this country?");
        map.put(7, "Which of these countries is in neighboring?");
        map.put(8, "Which alcohol is most popular in this country?");
        map.put(9, "What political system prevails in this country?");
        map.put(10, "Which of these monuments is in this country?");
        return map;
    }
}
