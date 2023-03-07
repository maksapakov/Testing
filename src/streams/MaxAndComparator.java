package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class MaxAndComparator {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        System.out.println(getOldestPerson(collection).toString());
    }
    public static Person getOldestPerson(List<Person> people) {
        /*Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;*/
        return people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }

}
