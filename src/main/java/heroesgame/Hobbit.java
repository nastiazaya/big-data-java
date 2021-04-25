package heroesgame;

public class Hobbit extends Hero{


    public Hobbit() {
        power = 0;
        hp = 3;
    }

    @Override
    public void kick(Hero enemy) {
        toCry();
    }

    @Override
    public void dia() {
        hp = 0;
    }

    @Override
    public String heroType() {
        return "Hobbit";
    }

    @Override
    public void die() {
        hp = 0;
    }

    private void toCry() {
        System.out.println("Hobbit cry");
    }
}
