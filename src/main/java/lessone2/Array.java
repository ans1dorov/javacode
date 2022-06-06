import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array;
        array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        int[][] array2 = new int[3][4];
        array2[1][0] = 33;
        int number = array2[1][0];
        boolean[] array3 = new boolean[]{true, false, true, false, false, true};

        System.out.println(number);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(array[0]);
        System.out.println(array.length);
        System.out.println(array2[1][2]);


    }
}
