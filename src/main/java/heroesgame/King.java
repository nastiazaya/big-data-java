package heroesgame;

import java.util.Random;

public class King extends HumanKicker{

    public King() {
        super(5, 15, 5, 15);
    }

    @Override
    public String heroType() {
        return "king";
    }
}
