package inheritance.belajar;

public class HeroInteligence extends Hero {
    String type = "Inteligence";

    // super contructor
    HeroInteligence(String nameInput, double attackInput, double healtInput) {
        super(nameInput, attackInput, healtInput);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type: " + this.type);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " receive double damage " + damage + " -> " + 2*damage );
        this.healt = this.healt - 2*damage;
    }
}
