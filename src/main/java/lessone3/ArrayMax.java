package lessone3;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array = new int[]{7, 2, 3, 4, 5};
        int currentMax = Integer.MIN_VALUE;
        int currentMaxIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > currentMax) {
                currentMax = array[i];
                currentMaxIndex = i;

            }
        }
        System.out.println(currentMax);
        System.out.println(currentMaxIndex);
    }
}
