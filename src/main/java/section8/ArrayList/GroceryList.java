package section8.ArrayList;

import java.util.ArrayList;

public class GroceryList {
    //private int[] array = new int[50];
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0;i< groceryList.size();i++)
            System.out.println(i+1 + ": " + groceryList.get(i));
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
    }

    public void removeGroceryItem(int position){
       groceryList.remove(position);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0)
            removeGroceryItem(position);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public void modifyGroceryItem(String item, String newItem){
        int position = findItem(item);
        if(position >= 0)
            modifyGroceryItem(position, newItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0)
            return true;
        return false;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
