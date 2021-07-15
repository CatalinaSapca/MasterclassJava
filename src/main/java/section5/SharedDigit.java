package section5;

public class SharedDigit {

    public static boolean hasSharedDigit(int x, int y){
        if(x < 10 || x > 99 || y < 10 || y > 99)
            return false;

        int[] characteristic = new int[10];
        for(int i = 0; i <= 9; i++)
            characteristic[i] = 0;

        characteristic[x%10]++;
        characteristic[x/10]++;
        characteristic[y%10]++;
        characteristic[y/10]++;

        for(int i=0; i<=9; i++){
            if(characteristic[i] >= 2)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println("Do 34 and 56 share digits    " + hasSharedDigit(34, 56));
        System.out.println("Do 34 and 44 share digits    " + hasSharedDigit(34, 44));
        System.out.println("Do 89 and 12 share digits    " + hasSharedDigit(89, 12));
    }

}
