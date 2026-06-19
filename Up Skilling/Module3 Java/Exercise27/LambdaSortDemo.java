import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Kusuma");
        names.add("Ramesh");
        names.add("Sita");
        names.add("Anil");
        names.add("Bhavana");

        System.out.println("Original List:");
        System.out.println(names);

        // Sorting using Lambda Expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("\nSorted List:");
        System.out.println(names);
    }
}