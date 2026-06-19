import java.util.List;
import java.util.stream.Collectors;

// Record Definition
record Person(String name, int age) {}

public class RecordDemo {
    public static void main(String[] args) {

        // Creating Record Instances
        Person p1 = new Person("Kusuma", 20);
        Person p2 = new Person("Ramesh", 17);
        Person p3 = new Person("Sita", 22);

        // Printing Records
        System.out.println("Person Details:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Store Records in a List
        List<Person> persons = List.of(p1, p2, p3);

        // Filter persons with age >= 18
        List<Person> adults = persons.stream()
                                     .filter(person -> person.age() >= 18)
                                     .collect(Collectors.toList());

        System.out.println("\nPersons with Age >= 18:");
        adults.forEach(System.out::println);
    }
}