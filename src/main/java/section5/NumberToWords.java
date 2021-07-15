package section5;

public class NumberToWords {

    public static void numberToWords(int number){
        if(number < 0)
            System.out.println("Invalid Value");

        int digitCount = getDigitCount(number);
        int reversedNumber = reverse(number);


        for(int i = 0; i<digitCount; i++){
            if(reversedNumber>0){
                int digit = reversedNumber % 10;
                reversedNumber /= 10;
                switch (digit){
                    case 0:
                        System.out.print("zero ");
                        break;
                    case 1:
                        System.out.print("one ");
                        break;
                    case 2:
                        System.out.print("two ");
                        break;
                    case 3:
                        System.out.print("three ");
                        break;
                    case 4:
                        System.out.print("four ");
                        break;
                    case 5:
                        System.out.print("five ");
                        break;
                    case 6:
                        System.out.print("six ");
                        break;
                    case 7:
                        System.out.print("seven ");
                        break;
                    case 8:
                        System.out.print("eight ");
                        break;
                    case 9:
                        System.out.print("nine ");
                        break;

                }
            }
            else{
                System.out.print("zero ");
            }
        }

    }

    public static int reverse(int number){
        int newNumber = 0;
        boolean isNegative = number < 0;
        if(isNegative)
            number = number * -1;

        while(number > 0){
            newNumber = newNumber * 10 + number % 10;
            number = number / 10;
        }
        return isNegative ? newNumber*-1 : newNumber ;
    }

    public static int getDigitCount(int number){
        if(number < 0)
            return -1;

        int count = 1;
        while(number > 9){
            count ++;
            number /= 10;
        }
        return count;
    }
}

