package lessone9;

public abstract class Vehicle {

    private final String name;
public Vehicle(String name){
    this.name = name;

}

    @Override
    public String toString() {
        return name;
    }
}
