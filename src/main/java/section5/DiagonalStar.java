package section5;

public class DiagonalStar {

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }

        for(int i = 1; i<=number; i++){
            for(int j = 1; j<=number; j++){
                //daca ne aflam pe una din laturi || daca ne aflam pe diagonala principala || daca ne aflam pe diagonala secundara
                if(i == 1 || j == 1 || i == number || j == number || (i+j == number + 1) || i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        printSquareStar(25);
    }
}

