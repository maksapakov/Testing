package streams;

import java.util.List;

public class SumAndReduce {

    public static int calculate(List<Integer> numbers) {
/*
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
*/
        return numbers
                .stream()
                .reduce(0, Integer::sum);
    }
}
