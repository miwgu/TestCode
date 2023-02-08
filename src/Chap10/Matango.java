package Chap10;

public class Matango {
    int hp = 50;
    char suffix;

    public Matango(char suffix) {
        this.suffix = suffix;
    }

    /**
     * Attack to the Hero. Matango gives -10P damage him
     */

    public void attack(Hero h){
        System.out.println("Kinoko "+ this.suffix+ " attacks!");
        System.out.println(h.getName() + " gets Damage: 10P");
        h.hp-=10;
        System.out.println(h.getName()+ ": "+h.hp+ "hp");
    }

    public void attackToSuperH(SuperHero sh){
        System.out.println("Kinoko "+ this.suffix+ " attacks!");
        System.out.println(sh.getName() + " gets Damage: 15P");
        sh.hp-=15;
        System.out.println(sh.getName()+ ": "+sh.hp+ "hp");
    }
}
