package heroesgame;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Hero {

    private int power;
    private int hp;

    public abstract void kick(Hero enemy);

    public boolean isAlive(){
        return hp > 0;
    }

    public abstract String heroType();

}
