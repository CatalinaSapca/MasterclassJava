package section8.LinkedList;

import java.util.ArrayList;

public class LinkedListMain {
    public static void main(String[] args){
        Customer customer = new Customer("Catalina", 65.98);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(5);

        for(int i=0;i<intList.size();i++)
            System.out.println(intList.get(i));

        System.out.println("\n");

        //the elements after index 1 is pushed/shifted with one step to right
        intList.add(1,2);
        for(int i=0;i<intList.size();i++)
            System.out.println(intList.get(i));
    }
}
