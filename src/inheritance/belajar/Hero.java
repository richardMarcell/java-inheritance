package inheritance.belajar;

public class Hero {
    // attribute
    String name;
    double attackPower, healt;

    // constructor
    Hero(String nameInput, double attackInput, double healtInput) {
        this.name = nameInput;
        this.attackPower = attackInput;
        this.healt = healtInput;
    }

    // method attack
    void attack(Hero enemy) {
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage) {
        System.out.println(this.name +  " receive damage " + damage);
        this.healt = this.healt - damage;
    }

    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Healt: " + this.healt);
        System.out.println("Power " + this.attackPower);
    }
}
