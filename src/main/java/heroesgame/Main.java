package heroesgame;

public class Main {
    public static void main(String[] args) throws Exception {

       GameManager gameManager = new GameManager();
       /* Hero hero1 = HeroFactory.createHero();
        Hero hero2 = HeroFactory.createHero();
        gameManager.fight(hero1, hero2);*/

        // with Supplier
        HeroFactorySupplier heroFactorySupplier = new HeroFactorySupplier();
        Hero heroOne = heroFactorySupplier.createHero();
        Hero heroTwo = heroFactorySupplier.createHero();
        gameManager.fight(heroOne,heroTwo);
    }
}
