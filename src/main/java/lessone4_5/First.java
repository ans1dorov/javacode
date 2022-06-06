package lessone4_5;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 3, 4, 2, 3};
        int number = 0;
        while (number < array.length) {
            System.out.print(array[number]);
            if (number == array.length - 1) {
                break;
            }
            System.out.print(", ");
            number++;
        }
//        System.out.println(Arrays.toString(array));

    }
}
