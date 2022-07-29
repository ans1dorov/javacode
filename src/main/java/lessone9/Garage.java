package lessone9;

public class Garage <T extends Vehicle>{
    private final T parked;

    public Garage(T parked) {
        this.parked = parked;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "parked=" + parked +
                '}';
    }
}
