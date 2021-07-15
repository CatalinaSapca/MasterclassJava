package section6;

public class Classes {

    public static void main(String[] args){
        //creating an object of type Car
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("porsche");
        System.out.println("The model is " + porsche.getModel());
        holden.setModel("AA");
        System.out.println("The model is " + holden.getModel());

    }
}

//inheritance
