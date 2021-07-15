package section7;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "bacon and ham", 14.88, "Black");
        super.addHamburgerAddition1("Chips", 9.00);
        super.addHamburgerAddition2("Drink", 9.00);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe burgers");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe burgers");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe burgers");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe burgers");
    }
}
