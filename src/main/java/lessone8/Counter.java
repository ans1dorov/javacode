package lessone8;

/**
 * Создать класс Counter, который будет содержать поле int value.
 * Создать конструкторы: Counter(int startValue) - устанавливает начальное значение value на startValue;
 * Counter() - устанавливает начальное значение 0.
 * Создать методы: int value() - текущее значение счетчика, void increase() - увеличивает значение на 1,
 * void decrease() - уменьшает значение на 1, void increase(int increaseBy) - увеличивает на указанное значение,
 * void decrease(int decreaseBy) - уменьшает на указанное значение.
 * Попробуйте переиспользовать методы для уменьшения дублирования кода.
 * В методе main протестировать функционал.
 *
 * @author Maxim Tereshchenko
 */

public class Counter {
    static int value;

    Counter(int startValue) {
        this.value = startValue;
    }

    Counter() {
        value = 0;
    }

    int value() {
        return 0;
    }

    void increase() {
        value++;
    }

    void decrease() {
        value--;
    }

    void increase(int increaseBy) {
        value += increaseBy;
    }

    void decrease(int decreaseBy) {
        value -= decreaseBy;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.decrease(1);
        System.out.println(value + " decreaseBy");
        counter.increase(2);
        System.out.println(value + " increaseBy");
        counter.increase();
        System.out.println(value + " increase");
        counter.decrease();
        System.out.println(value + " decrease");

    }
}
