package heroesgame;

public class GameLog {


    public void howKick(Hero hitHero, Hero attackedHero){
        System.out.println(hitHero.heroType() + " is hit the " + attackedHero.heroType());
    }

    public void heroKick(Hero hitHero,Hero attackedHero, int hpBefore){
        if(attackedHero.getHp() <= 0){
            System.out.println(hitHero.heroType() + " was kill the " + attackedHero.heroType());
        }else if(hitHero.heroType().equals("Elf")){
            System.out.println(attackedHero.heroType() + " lost 1 from his power");
        }else{
            int lostHP = hpBefore - attackedHero.getHp();
            System.out.println(attackedHero.heroType() + " lost " + lostHP + " from his hp");
        }
    }

    public void bothHeroIsHobbit() {
        System.out.println("Hobbits are crying\nGame Over");
    }

    public void bothHeroIsElf() {
        System.out.println("Elfs can not fight each other\nGame Over");
    }


     public void gameOver(Hero hero1, Hero hero2){

        if(hero1.isAlive() && !(hero2.isAlive())){
            System.out.println(hero1.heroType() + " is win!");
            System.out.println(hero2.heroType() + " is lose!");
        } else {
            System.out.println(hero2.heroType() + " is win!");
            System.out.println(hero1.heroType() + " is lose!");
        }
         System.out.println("Game Over");
     }

}
