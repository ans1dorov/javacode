package lessone3;

public class ContinueBreak {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {

            if (i%2!=0){
                continue;
            }
            if (i == 8) {
                break;
            }
            System.out.println(i);

        }
    }
}
