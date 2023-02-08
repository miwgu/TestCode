package Chap10;



public class Main {
    public static void main(String[] args) {
        //SuperHero sh = new SuperHero("Mimmi");
        Weapon w = new Weapon();
        System.out.println(w.name);

        PoisonMatango pm = new PoisonMatango('B');
        Hero h1= new Hero("Mimmi");
        pm.attack(h1);
        h1.attack(pm);

        pm.attackToSuperH(new SuperHero("Super P")); //

        Matango m = new Matango('A');
        m.attackToSuperH( new SuperHero("Super Miii"));
    }
}
