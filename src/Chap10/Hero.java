package Chap10;

public class Hero {

    String name;
    public int hp;

    /*
    public Hero() {
        System.out.println("Hero constructor");
    }

     */

    public Hero() {
        this.name = name;
        this.hp = hp;
    }

    public Hero(String name) {
        this.name=name;
        this.hp=100;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Matango m) {
        System.out.println(this.name + " attacks "+ "Kinoko "+ m.suffix);
        m.hp-=5;
        System.out.println(this.name + " givs 5P damage!");
        System.out.println( "Kinoko "+m.suffix+ ": "+m.hp+ "hp");
    }
}
