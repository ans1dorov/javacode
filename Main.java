public class Main {
    public static void main(String[] args) {

        int giftValue = 25001;


        if (giftValue > 5000 && giftValue <= 25000) {
            double tax = (100 + (giftValue - 5000) * 0.08);

            System.out.println("You tax = " + tax);
        } else if (giftValue == 5000) {
            System.out.println("You tax = " + 100);
        } else if (giftValue == 25001) {
            System.out.println("You tax = " + 1700);
        } else if (giftValue > 25001) {
            double tax2 = (1700 + (giftValue - 25000) * 0.1);
            System.out.println("You tax = " + tax2);
        } else {
            System.out.println("No tax");
        }

    }
}