package section7;

public class Motherboard {
    public String model;
    public String manufacturer;
    public int ramSlots;
    public int cardSlots;
    public String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }
}
