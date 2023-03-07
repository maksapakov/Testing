package streams;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Joining {

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);
        System.out.println(namesToString(collection));
    }

    public static String namesToString(List<Person> people) {
/*
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
*/
        return people
                .stream()
                .map(Person::getName)
                .collect(Collectors.joining(", ", "Names: ","."));
    }
}
