package section5;

public class ParsingValues {

    public static void main(String[] args){
        String myString = "2019";
        System.out.println(myString);

        int number  = Integer.parseInt(myString);
        System.out.println(number);

        String myString2 = "2019aa";
        System.out.println(myString2);

        try{
            int number2 = Integer.parseInt(myString2);
            System.out.println(number2);
        }
        catch (Exception ex){
            System.out.println("Could not parse integer out of String " + myString2);
        }


        String myString3 = "2019.12";
        System.out.println(myString3);

        double number3  = Double.parseDouble(myString3);
        System.out.println(number3);

    }
}
