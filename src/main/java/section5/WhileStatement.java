package section5;

public class WhileStatement {

    public static void main(String[] args){
        int count = 1;
        while(count <= 7){
            System.out.println("The counter is " + count + ".");
            count++;
        }
        System.out.println("After while the counter is " + count);

        int count2 = 1;
        do{
            System.out.println("The counter is " + count2 + ".");
            count2++;
        }while (count2 <= 7);
        System.out.println("after do while the counter is " + count2);
    }
}
