package Chap9;

public class Main
{
    public Main(){
     Task9_1 t9= new Task9_1("Mimi");
     System.out.println(t9.name+":"+ t9.hp+":"+t9.mp);

    }

    public static void heal(int hp){
        hp +=10;
    }
    public static void heal(Task9_1 task9_1){
        task9_1.hp +=10;
    }

    public static void main(String[] args) {
        Main main = new Main();

        int baseHp= 25;
        int bHp= 11;
        baseHp=bHp;
        Task9_1 t =new Task9_1("Asaka",baseHp);
        System.out.println("baseHP "+baseHp + "/ hp " + t.hp+ "/ mp ; "+t.mp);
        heal(baseHp);  //-> Call by value
        heal(t);
        System.out.println("baseHP "+baseHp+ "/ hp "+ t.hp+ "/ mp ; "+t.mp);
    }
}
