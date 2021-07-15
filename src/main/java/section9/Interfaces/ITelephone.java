package section9.Interfaces;

public interface ITelephone {
    //you don't actually need the access modifier
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();


}
