package section6;

//access modifiers
//-public
//-private
//-protected

import java.util.Locale;

//encapsulation - not allowing the internals to be accessed from outside
public class Car {
    //here are variables
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public Car() { }

    public Car(int doors, int wheels, String model, String engine, String colour) {
        this.doors = doors;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
        this.wheels = wheels;
    }
    //here are methods


    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        if(model.toLowerCase().equals("porsche") || model.toLowerCase().equals("commadore"))
            this.model = model;
        else
            this.model = "Unknown";
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
