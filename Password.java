public class Password {
    public static void main(String[] args) {
        String password = "Caput Draconis1";
        String truepassword = "Caput Draconis";

        if (password.equals(truepassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Access denied");
        }
    }
}