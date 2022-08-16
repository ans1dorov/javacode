package lessone10;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Создать List<Integer> с несколькими цифрами.
 * Реализовать методы:
 * private static double average(List<Integer> numbers) - возвращает среднее арифметическое
 * private static void printInRange(List<Integer> numbers, int lowerLimit, int upperLimit) - печатает
 * числа в промежутке [lowerLimit, upperLimit]
 *
 * @author Maxim Tereshchenko
 */

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("average(numbers) = " + average(numbers));
        printInRange(numbers, 1, 12);
    }

    private static double average(List<Integer> numbers) {
        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        return (double) total / numbers.size();
    }

    private static void printInRange(List<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}
