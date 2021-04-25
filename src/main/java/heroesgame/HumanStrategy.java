package heroesgame;

public class HumanStrategy implements KickStrategy{



    @Override
    public void strategyToKick(Hero attacker, Hero defender) {
        int  damage = RandomUtil.getNumberBetween(0 , attacker.getPower());
        defender.decresHp(damage);
    }
}
