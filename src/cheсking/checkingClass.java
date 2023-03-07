package cheсking;

import java.util.concurrent.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class checkingClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        
    }

    public static class ExFlatMap {
        public static void main(String[] args) {
            List<List<Integer>> listOfLists =
                    Arrays.asList(Arrays.asList(1, 2),
                            Arrays.asList(3, 4),
                            Arrays.asList(5, 6));

            List<Integer> flatList = listOfLists.stream()
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());

            System.out.println(flatList);

        }
    }
}
