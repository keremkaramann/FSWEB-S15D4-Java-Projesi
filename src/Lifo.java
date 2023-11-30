import java.util.*;

public class Lifo {
    public static void main(String[] args) {

        Deque<String> lifoExamples = new LinkedList<>();
        lifoExamples.push("I did, did I?");
        lifoExamples.push("Racecar");
        lifoExamples.push("hello");
        lifoExamples.push("Was it a car or a cat I saw ?");

        for (String lifo : lifoExamples) {
            String lifos = lifo.toLowerCase().replaceAll("[.,!?\"]", "");
            String reversedLifos = new StringBuilder(lifos).reverse().toString();
            if (lifos.equals(reversedLifos)) {
                System.out.println("These are polindrom: " + lifos);
            } else {
                System.out.println("Not polindrom: " + lifos);
            }
        }
    }
}
