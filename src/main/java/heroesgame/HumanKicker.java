package heroesgame;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Random;
@Getter
public abstract class HumanKicker extends Hero{
    private static final Random random = new Random();
    private final int powerLow;
    private final int powerHigh;
    private final int hpLow;
    private final int hpHigh;

    public HumanKicker(int powerLow, int powerHigh, int hpLow, int hpHigh) {

        super(random.nextInt((powerHigh - powerLow) + 1) + powerLow,
                random.nextInt((hpHigh - hpLow) + 1) + hpLow);
        this.powerLow = powerLow;
        this.powerHigh = powerHigh;
        this.hpLow = hpLow;
        this.hpHigh = hpHigh;
    }

    public void kick(Hero enemy){
        if(enemy.isAlive() && this.isAlive()){
            int  damage = random.nextInt((powerHigh - powerLow) + 1) + powerLow;
            enemy.setHp(enemy.getHp() - damage);
        }
    }
}
