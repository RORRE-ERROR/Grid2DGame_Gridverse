public class Tron extends Character {

    public Tron(String name, String color, double speed, double handling, int lives, int discs, int xp) {
        super(name, color, speed, handling, lives, discs, xp);
    }

    public void levelUp() {
        this.level++;

        // TRON SPECIALTY: Speed increases faster than handling
        this.speed += 2.5;     // Large speed boost
        this.handling += 0.5;  // Small handling boost

        System.out.println("LEVEL UP! Tron reached Level " + this.level);
        System.out.println("Upgrade: Speed is now " + this.speed);

    }
}
