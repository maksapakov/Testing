package streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class GroupBy {

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, List<Person>> result = groupByNationality(collection);
        System.out.println(groupByNationality(collection));
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
/*
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
*/
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getNationality));
    }
}
