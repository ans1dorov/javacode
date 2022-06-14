package lessone6;

class Classes {
    public static void main(String[] args) {
        Human human = new Human("Alex");
        Robot robot = new Robot(10);

        System.out.println(human.name());
        System.out.println(robot.name());

        human.work();
        robot.work();

        System.out.println(human.joke());
    }
}
