package Chap9;

public class Task9_1 {
    String name;
    int hp;
    int mp;

    public Task9_1(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Task9_1(String name, int hp) {
        this(name,hp,5);
    }

    public Task9_1(String name) {
        this(name,40);
    }
}
