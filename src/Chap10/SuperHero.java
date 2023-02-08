package Chap10;

public class SuperHero extends Hero{

    /*
    * You do not forget to write "name" in super("name")
    * If you want change Hero 100hp -> SuperHero 200hp
    * you need to write this.hp= 200 like this
    * */
    public SuperHero(String name) {
        super(name);
        this.hp=200;

    }

}
