package lessone6;

abstract class AbstractWorker implements WorkerInterface {
    private final String name;

    AbstractWorker(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}
