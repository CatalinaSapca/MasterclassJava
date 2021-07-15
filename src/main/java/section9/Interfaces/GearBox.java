package section9.Interfaces;

public class GearBox {
    private boolean clutchIsIn;

    public void operateClutch(boolean inOrOut){
        this.clutchIsIn = inOrOut;
    }
}
