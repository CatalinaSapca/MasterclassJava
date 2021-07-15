package section6;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private  int tail;
    private int teeth;
    private String cost;

    public Dog(String name, int size, int weight) {
        //calls the constructor from the superclass
        super(name, 1, 1, size, weight);
    }

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String cost) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.cost = cost;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void chew() {
        System.out.println("Dog chews");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
        this.chew();
        //super.eat();
    }
}
