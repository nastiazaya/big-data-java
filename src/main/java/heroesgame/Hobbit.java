package heroesgame;

public class Hobbit extends Hero{

    private static final int POWER = 0;
    private static final int HP = 3;


    public Hobbit() {
        super(POWER, HP);
    }

    @Override
    public void kick(Hero enemy) {
        toCry();
    }

    private void toCry() {
        System.out.println("Hobbit cry");
    }
}
