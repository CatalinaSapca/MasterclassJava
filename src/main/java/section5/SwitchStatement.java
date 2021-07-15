package section5;

public class SwitchStatement {

    public static void main(String[] args){
        int switchValue = 1;
        switch(switchValue){
            case 1:
                System.out.println("Value is 1.");
                break;
            case 2:
                System.out.println("Value is 2.");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is 3 or 4 or 5.");
                break; //what happens if you comment this?
            default:
                System.out.println("Was not between 1 and 5 inclusive.");
                break;
        }
    }

    public static void example(){
        char switchValue = 'A';
        switch(switchValue){
            case 'A':
                System.out.println("The character is A.");
                break;
            case 'B':
                System.out.println("The character is B.");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("The character is C, D or E.");
                break;
            default:
                System.out.println("The character was not found.");
                break;
        }
    }
}
