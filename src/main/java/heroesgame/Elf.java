package heroesgame;

public class Elf extends Hero{

    private static final int POWER = 10;
    private static final int HP = 50;

    public Elf() {
        super(POWER, HP);
    }

    @Override
    public void kick(Hero enemy) {
        if(this.isAlive() && enemy.isAlive()){
            if(enemy.getPower() < this.getPower()){
                enemy.setHp(0);
            }else{
                enemy.setPower(enemy.getPower() - 1);
            }
        }
    }

}
