package lessone4_5;

public class Third {
    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 3, 4, 2};
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ=array[i]+summ;

        }

        System.out.println(summ);
    }

}

