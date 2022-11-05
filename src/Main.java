import javax.swing.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 85);
        examScores.put("Physics", 98);
        examScores.put("English", 100);
        examScores.put("Biology", 89);


        System.out.println(examScores.toString()); // displays the scores in random order


        System.out.println(examScores.getOrDefault("Geog", 0)); // return 0 if Geo does not exist

        examScores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score);
        });
    }
}