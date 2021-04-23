package heroesgame;


public class GameManager {

    public void fight(Hero c1, Hero c2){
        if(c1.heroType().equals("Hobbit") && c2.heroType().equals("Hobbit")){
            GameLog.bothHeroIsHobbit();
            return;
        }
        if(c1.heroType().equals("Elf") && c2.heroType().equals("Elf")){
            GameLog.bothHeroIsElf();
            return;
        }
        for (int i = 1; (c1.isAlive() && c2.isAlive()); i++) {
            if( i % 2 == 1){
                GameLog.howKick(c1,c2);
                int c2Hp = c2.getHp();
                c1.kick(c2);
                GameLog.heroKick(c1,c2,c2Hp);
            }
            else{
                GameLog.howKick(c2,c1);
                int c1Hp = c1.getHp();
                c2.kick(c1);
                GameLog.heroKick(c2,c1,c1Hp);
            }
        }
        GameLog.gameOver(c1,c2);
    }


}
