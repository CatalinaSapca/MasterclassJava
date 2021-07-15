package section8.AutoboxingUnboxing;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue(){
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class AutoboxingAndUnboxing {
    public static void main(String[] args){
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Catalina");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(55));

        Integer integer = new Integer(54);
        Double doubleV = new Double(12.23);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i=0; i<=10; i++){
            integerArrayList.add(Integer.valueOf(i));
        }

        for(int i=0; i<=10; i++)
            System.out.println(integerArrayList.get(i).intValue());

        Integer myIntValue = 56; // Integer.valueOf(56); - boxing -autoboxing
        int myInt = myIntValue; // myIntValue.intValue(); - unboxing
    }
}
