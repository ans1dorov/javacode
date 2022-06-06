package lessone4_5;

public class Second {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
                for(int i:array){
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");

                    }
                    System.out.println();
                }
    }
}
