package section3and4;

public class Overloading {

    public static void main(String[] args){
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore("Ana", 1000);
        calculateScore(90);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player" + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No data about player or score.");
        return 0;
    }

    //Overloading a method is a procedure where you create a method that has the same name as another method
    //but it has a new signature ( different parameters types or more parameters)
}
