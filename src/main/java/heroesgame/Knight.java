package heroesgame;

public class Knight extends Hero{

    private KickStrategy kickStrategy = new HumanStrategy();

    public Knight(){
        hp = RandomUtil.getNumberBetween(2,12);
        power = RandomUtil.getNumberBetween(2,12);
    }

    public void kick(Hero enemy) {
        if(enemy.isAlive() && this.isAlive()){
            kickStrategy.strategyToKick(this,enemy);
        }
    }

    @Override
    public void dia() {
        hp = 0;
    }

    public String heroType() {
        return "Knight";
    }

    @Override
    public void die() {
        hp = 0;
    }
}
