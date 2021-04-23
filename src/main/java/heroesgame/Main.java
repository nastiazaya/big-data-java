package heroesgame;

public class Main {
    public static void main(String[] args) {

        GameManager gameManager = new GameManager();
        Hero hero1 = HeroFactory.createHero();
        Hero hero2 = HeroFactory.createHero();

        gameManager.fight(hero1, hero2);
    }
}
