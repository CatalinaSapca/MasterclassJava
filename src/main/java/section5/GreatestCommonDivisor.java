package section5;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10)
            return -1;
        return gdc(first, second);
    }

    public static int gdc(int first, int second){
        if(second == 0)
            return first;
        return gdc(second, first%second);
    }

    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(25, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

}
