package section7;

public class MasterChallengeMain {
    public static void main(String[] args){
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Tomato", 0.27);
        hamburger.addHamburgerAddition3("Tomato", 0.27);
        hamburger.addHamburgerAddition4("Tomato", 0.27);
        price = hamburger.itemizeHamburger();
        System.out.println("Price is " + price);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg", 7.87);
        healthyBurger.itemizeHamburger();
    }
}
