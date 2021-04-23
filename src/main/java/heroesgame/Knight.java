package heroesgame;

import java.util.Random;

public class Knight extends HumanKicker {

    public Knight() {
        super(2, 12, 2, 12);
    }

    @Override
    public String heroType() {
        return "Knight";
    }
}
