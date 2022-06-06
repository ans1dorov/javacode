public class ForArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
        System.out.println("After");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
