package section3and4;

public class PrimitiveTypeChallenge {
    public static void main_P3_28(){
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
    }

    public static void main_P3_29(){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("The minimum float value = " + myMinFloatValue);
        System.out.println("The maximum float value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("The minimum double value = " + myMinDoubleValue);
        System.out.println("The maximum double value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        float myFloatValue2 =  5.25F;
        double myDoubleValue = 5.25D;

        System.out.println("my int = " + myIntValue);
        System.out.println("my float = " + myFloatValue);
        System.out.println("my float 2 = " + myFloatValue2);
        System.out.println("my double = " + myDoubleValue);

    }

    public static void main_P3_30(){
        double pounds = 7D;
        double kilograms = pounds * 0.45359237D;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        double pi = 3.123452346745678987678894;
        double pi2 = 3.13456789876789098778982344D;
        System.out.println(pi);
        System.out.println(pi2);

    }

    public static void main_P3_31(){
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

    }

    public static void main_P3_32(){
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "I am a string";
        System.out.println(myString);
        myString = myString + "and you are not.";
        System.out.println(myString);
        myString = myString + '\u00A9';

        String firstString = "10.67";
        int firstNumber = 50;
        firstString = firstString + firstNumber;
        System.out.println(firstString);

        String secondString = "10.787";
        double secondNumber = 50.67D;
        secondString = secondString + secondNumber;
        System.out.println(secondNumber);

    }

    public static void main_P3_35(){
        boolean isAlien = true;
        if(isAlien)
            System.out.println("It is Alien.");
        else
            System.out.println("It's not an Alien.");

    }

    public static void main_P3_38(){
        int value = 50;
        if(value == 50){
            System.out.println("I am 50.");
        }

        boolean isCar = false;
        if(isCar = true)
            System.out.println("This is not supposed to happen.");
        if(isCar == true)
            System.out.println("This is not gonna be printed.");
    }

    public static void main_P3_40(){
        double var1 = 20.00d;
        double var2 = 80.00d;
        double op = 100 * (var1 + var2);
        double remainder = op % 40;
        System.out.println("The remainder is " + remainder);
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println("The boolean variable is " + isZero);
        if(!isZero)
            System.out.println("Got some remainder.");
    }


    public static void main_P4_45(){
        //Statements, Whitespace and Indentation( Code Organization)
        System.out.println("This is a line"+
                "and this is the" +
                "same line.");
        int                  a = 0;double b = 8.09d;System.out.println("This is not Code Organization!");

    // Ctrl + Alt + L to reformat code
    }

    public static void main_P4_46(){
        int variable = 90;
        if(variable >= 89)
            System.out.println("This should be printed.");

        if(variable >= 89) {
            System.out.println("This should be printed.");
        }

        if(variable >= 89)
            System.out.println("This should be printed.");
            System.out.println("And this not.");

        if(variable >= 89) {
            System.out.println("This should be printed.");
            System.out.println("And this not.");
        }
        else{
            System.out.println("text");
        }

        int score = 100;
        if(score > 80 && score <200)
            System.out.println("You have more than 80 points.");
        else if(score < 80)
            System.out.println("You have less than 80 points.");
        else
            System.out.println("You have 80 points.");

        //execise
        boolean newGameOver = true;
        double newScore = 10000;
        int newLevelCompleted = 8;
        double newbonus = 200;

    }

    public static int sumMethod(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static void methodCall(){
        System.out.println(sumMethod(3,9));


        int firstNumber = 9;
        int secondNumber = 19;
        System.out.println(sumMethod(firstNumber, secondNumber));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return  finalScore + 2000;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(double score){
        if(score >= 1000)
            return 1;
        else if(score >= 500)
            return 2;
        else if(score >= 100)
            return 3;
        else
            return 4;
    }

    public static void secondMethodCall(){
        double score = 700;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition("Jhonny", position);

        //score = 1500
        displayHighScorePosition("First", calculateHighScorePosition(1500));
        //score = 900
        displayHighScorePosition("Second", calculateHighScorePosition(900));
        //score = 400
        displayHighScorePosition("Third", calculateHighScorePosition(400));
        //score = 50
        displayHighScorePosition("fourth", calculateHighScorePosition(50));
    }

    public static void main(String[] args){
        secondMethodCall();
    }
}
