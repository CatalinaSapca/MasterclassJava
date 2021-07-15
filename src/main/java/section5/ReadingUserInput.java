package section5;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + ".");
        scanner.close();
    }
}
