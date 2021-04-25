package heroesgame;

import lombok.Setter;

public class King extends Hero {
    @Setter
    private KickStrategy kickStrategy = new HumanStrategy();

    public King(){
        hp = RandomUtil.getNumberBetween(5,15);
        power = RandomUtil.getNumberBetween(5,15);
    }

    @Override
    public void kick(Hero enemy) {
        if(enemy.isAlive() && this.isAlive()){
            kickStrategy.strategyToKick(this,enemy);
        }
    }

    @Override
    public void dia() {
        hp = 0;
    }

    @Override
    public String heroType() {
        return "king";
    }

    @Override
    public void die() {
        hp = 0;
    }

}
