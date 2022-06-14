package lessone6;

class Robot extends AbstractWorker {
    private final int speed;

    Robot(int speed) {
        super("Robot");
        this.speed = speed;
    }

    @Override
    public void work() {
        System.out.println("Doing the work automatically " + speed + " speed");
    }
}
