package section5;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        while(goal >= 5 && bigCount > 0){
            goal = goal - 5;
            bigCount--;
        }

        if(goal-smallCount <= 0)
            return true;
        return false;
    }
}
