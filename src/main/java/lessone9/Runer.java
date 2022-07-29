package lessone9;

public class Runer {
    public static void main(String[] args) {
        Garage<Motorcycle> motorcycleGarage = new Garage<>(new Motorcycle("Yamaha"));
        Garage<Car> carGarage = new Garage<>(new Car("Lamborgini"));



        System.out.println(motorcycleGarage);
        System.out.println(carGarage);
    }
}
