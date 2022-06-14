package lessone6;

//Создать класс описывающий промежуток времени. Сам промежуток должен задаваться тремя свойствами: секунды, минуты, часы
//Нужно сделать методы для получения полного количества секунд в объекте и для сравнения двух объектов нужно создать два конструктора получающие
// общее количество секунд и получающие часы, минуты и секунды по отдельности. Сделать метод по выводу данных

public class Task24 {

    private final int seconds;
    private final int minutes;
    private final int hours;

    public Task24(int hourse, int minutes, int seconds) {
        this.hours = hourse;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public Task24(int totalSeconds) {
        this(totalSeconds / (60 * 60), totalSeconds % 3600 / 60, totalSeconds % 60);
//        this.hours = totalSeconds / (60*60);
//        this.minutes = totalSeconds % 3600/60;
//        this.seconds = totalSeconds % 60;
    }

    public int totalSecond() {
        int result = seconds;
        result += minutes * 60;
        result += hours * 3600;
        return result;
    }

    public boolean isBefore(Task24 time) {
        return totalSecond() < time.totalSecond();
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        Task24 time1 = new Task24(15, 2, 30);
        Task24 time2 = new Task24(3690);
        System.out.println(time1);
        System.out.println(time2);

        System.out.println(time1.totalSecond());
        System.out.println(time2.totalSecond());

        System.out.println(time1.isBefore(time2));
        System.out.println(time2.isBefore(time1));


    }
}
