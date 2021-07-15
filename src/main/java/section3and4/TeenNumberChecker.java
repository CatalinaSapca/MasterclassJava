package section3and4;

public class TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3) {
        if(isTeen(num1) ||isTeen(num2) || isTeen(num3))
            return true;
        return false;
    }

    public static boolean isTeen(int x) {
        if(x>=13 && x<=19)
            return true;
        return false;
    }


}

