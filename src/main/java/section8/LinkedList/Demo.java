package section8.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    //psvm
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "AA");
        addInOrder(placesToVisit, "BB");
        addInOrder(placesToVisit, "CC");
        addInOrder(placesToVisit, "DD");
        addInOrder(placesToVisit, "AA");

        printList(placesToVisit);

        visit(placesToVisit);

//        //adding at index 1--note that linked list index starts at 0...
//        placesToVisit.add(1,"AddedLater");
//        printList(placesToVisit);
//
//        //remove element at index 4 which   is the 5th element in the linked list
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext())
            System.out.println("Now visiting " + i.next());
        System.out.println("====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> i = linkedList.listIterator();
        while(i.hasNext()) {
            int comparison = i.next().compareTo(newCity);
            if(comparison == 0){
                //equal, do not add
                System.out.println(newCity + " already in list");
                return false;
            }
            else if(comparison > 0){
                //newCity should appear before this one
                i.previous();
                i.add(newCity);
                //i.next();
                return true;
            }
            //else move to next city
        }

        //this means the newCity should appear last in the LinkedList
        i.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in the list.");
            return;
        }
        else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext())
                            listIterator.next();
                        goingForward = true;
                    }

                    if(listIterator.hasNext())
                        System.out.println("Now visiting " + listIterator.next());
                    else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious())
                            listIterator.previous();
                        goingForward = false;
                    }

                    if(listIterator.hasPrevious())
                        System.out.println("Now visiting " + listIterator.previous());
                    else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions: \n");
        System.out.println("0 - to quit\n " +
                "1 - to go to the next city\n " +
                "2 - to go to the previous city\n " +
                "3 - to print the menu options again...");
    }


}
