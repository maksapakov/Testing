package codewars;

public class DestinctValueFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 8, 8, 8, 8, 9, 10, 15, 15, 17, 17, 17, 17};

        System.out.println(arr[0]);
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    private static class StringEndsWithSolution {
        //Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
        //Отсортированный массив. В нём дубли. Избавиться от дублей и вывести массив на экран. Нельзя исп. коллекции стримы и упрощения кода


    }

}
