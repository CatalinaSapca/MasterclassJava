package section7;

import java.util.Random;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return  "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over planet earth.";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Maze Runner plot.";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Imperial Forces try to take over the universe.";
    }
}

class ForgettableMovie extends Movie{
    public ForgettableMovie(){
        super("Forgettable Movie");
    }

    //no plot method
}

public class PolymorphismMain {
    public static void main(String[] args){
//        for(int i=1;i<11;i++){
//            Movie movie = randomMovie();
//            System.out.println("The movie is " + movie.getName() + "\n Plot: " + movie.plot() + "\n\n");
//        }

        Car1 car1 = new Car1(8, "Base Car");
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());

        System.out.println("\n");

        Mitsubishi mitsubishi = new Mitsubishi(6, "4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println("\n");

        Ford ford = new Ford(6, "aaa");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated is " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
            default:
                return null;
        }
    }


}

class Car1{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car1(boolean engine, int cylinders, String name, int wheels) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = wheels;
    }
    public Car1(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}



class Mitsubishi extends Car1{
    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake(){
        return "Mitsubishi -> brake()";
    }
}



class Ford extends Car1{
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + "-> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Ford -> accelerate()";
    }

    @Override
    public String brake(){
        return "Ford -> brake()";
    }
}