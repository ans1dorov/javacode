package lessone6.homeWork;

//Создать класс PaymentCard с полем double balance - баланс на карте
//Создать конструктор, котррый принимает начальный баланс и сохраняет его в поле balance
//Переопределить метод String  toString(), который возвращать строку "The card has a balance of X"
//где X - баланс карты
//Создать методы:
//void eatAffordably() - вычитает из баланса 2.6;
//void eatHertily() - вычитает из баланса 4.6;
//При этом, методы не должны вычитать если сумма будет ниже 0
//void addMoney() - добавить сумму к балансу
//При этом, если в метод передадут отрицательное число - баланс не должен измениться в этом случае.
//В main методе протестировать методы PaymentsCard.

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " RUB";
    }

    void eatAffordably() {
        if (balance - 2.6 > 0) {
            balance -= 2.6;
        }
    }

    void eatHertily() {
        if (balance - 4.6 > 0) {
            balance -= 4.6;
        }
    }

    void addMoney(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public static void main(String[] args) {
        PaymentCard balance = new PaymentCard(2.6);
        balance.eatAffordably();
        System.out.println(balance.toString());
        balance.addMoney(300);
        System.out.println(balance.toString());
        balance.eatHertily();
        System.out.println(balance.toString());


    }
}
