package streams;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;

public class Challenge {

    public static void main(String[] args) {
        System.out.println(getString(List.of(3,44)));
    }
    public static String getString(List<Integer> list) {
        return list
                .stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(joining(","));
    }
}
