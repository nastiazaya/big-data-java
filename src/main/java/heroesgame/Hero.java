package heroesgame;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Hero {

    protected int power;
    protected int hp;

    protected Hero() {
    }

    public abstract void kick(Hero enemy);

    public boolean isAlive(){
        return hp > 0;
    }

    public abstract void dia();

    public abstract String heroType();

    public void decresHp(int delta){
        hp -= delta;
    }

    public void decresPower(int delta){
        power -= delta;
    }

    public abstract void die();
}
