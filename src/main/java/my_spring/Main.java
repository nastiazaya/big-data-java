package my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        IRobot iRobot = (IRobot) ApplicationContext.getInstance().getObject(IRobotImpl.class);
        IRobot iRobot2 = (IRobot) ApplicationContext.getInstance().getObject(IRobotImpl.class);
        iRobot.cleanRoom();
    }
}
