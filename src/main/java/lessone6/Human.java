package lessone6;

class Human extends AbstractWorker {
    Human(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Doing the work by hands");
    }

    String joke() {
        return "I just got fired from my job at the keyboard factory";
    }
}
