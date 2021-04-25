package heroesgame;

import java.util.Random;

public class Elf extends Hero{


    public Elf() {
        power = 10;
        hp = 10;

    }

    @Override
    public void kick(Hero enemy) {
        if(this.isAlive() && enemy.isAlive()){
            if(enemy.getPower() < this.getPower()){
                enemy.die();

            }else{
                enemy.decresPower(1);
            }
        }
    }

    @Override
    public void dia() {
        hp = 0;
    }

    @Override
    public String heroType() {
        return "Elf";
    }

    @Override
    public void die() {
        hp = 0;
    }

}
