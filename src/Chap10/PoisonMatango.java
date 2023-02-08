package Chap10;

public class PoisonMatango extends Matango {
    int poisonCount = 5; // The initial value of the poison-attack

    public PoisonMatango(char suffix) {
        super(suffix);
    }


    @Override
    public void attack(Hero h) {
        // 1.PoisonMatango can attack with normal attack of the Matango
        super.attack(h);

        //2. If the value of the poison-attack(the poisonCount) is not zero(0)
        //   add more attacks!
        if (this.poisonCount > 0) {

            // 3. Show the message
            System.out.println("He spread more poisonous spores.");

            // 4.The damage by the attack is hp of Hero
            int dmg = h.hp / 5; // Define the damage : gives 1/5 damage
            h.hp -= dmg;     // And minus damage from hp

            System.out.println(h.getName() + " gets more Damage: " + dmg + "P");
            System.out.println(h.getName() + ": " + h.hp + "hp");

            // 5. the counter should be minus 1 from the poison-attack
            this.poisonCount -= 1; // The counter of the attack minus 1
            System.out.println("Attack counter: " + this.poisonCount);

        }


    }

    /*
    * This attack is almost same as attack to Hero but use forroop!
    * */
    @Override
    public void attackToSuperH(SuperHero sh) {
        super.attackToSuperH(sh);

        //for roop use the all poisonCount
        for (int i = 0; i < this.poisonCount; i++) {
            // 3. Show the message
            System.out.println("He spread more poisonous spores."+ (i+1)+"ATTACK");

            // 4.The damage by the attack is hp of Hero
            int dmg = sh.hp / 5; // Define the damage : gives 1/5 damage
            sh.hp -= dmg;     // And minus damage from hp

            System.out.println(sh.getName() + " gets more Damage: " + dmg + "P");
            System.out.println(sh.getName() + ": " + sh.hp + "hp");

            // 5. the counter should be minus 1 from the poison-attack
            // -> You DO NOT need to minus 1 from the counter!!
           // this.poisonCount -= 1; // The counter of the attack minus 1
            System.out.println("Attack counter: " + this.poisonCount);
        }
    }
}
