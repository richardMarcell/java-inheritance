package inheritance.belajar;


public class Main {
    public static void main(String[] args) {
        Hero hero1  = new Hero("Tanjiro", 10, 100);
        HeroStrength hero2 = new HeroStrength("Zenitsu", 20, 100);
        HeroInteligence hero3 = new HeroInteligence("Inousuke", 50, 100);

        hero1.display();
        hero2.display();
        hero3.display();

        hero1.attack(hero2);
        hero2.attack(hero1);
        hero2.attack(hero3);

        hero1.display();
        hero2.display();
        hero3.display();
    }
}