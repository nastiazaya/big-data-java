package heroesgame;

import java.util.Random;

public class Elf extends Hero{

    private static final int POWER = 10;
    private static final int HP = 10;
    private static final Random random = new Random();

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

    @Override
    public String heroType() {
        return "Elf";
    }

}
