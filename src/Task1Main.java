public class Task1Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotCoocker robotCoocker = new RobotCoocker();
        RobotDancer robotDancer = new RobotDancer();

        robot.work();
        coffeRobot.work();
        robotCoocker.work();
        robotDancer.work();
        System.out.println();

    }
}
