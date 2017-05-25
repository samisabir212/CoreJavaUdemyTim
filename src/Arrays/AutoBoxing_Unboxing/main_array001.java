package Arrays.AutoBoxing_Unboxing;

import java.util.ArrayList;

/**
 * Created by sami on 5/24/17.
 */

//this class inorder to work must be outside the public class called main_array001
class Intclass {

    private int myValue;

    public Intclass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class main_array001 {

    //first give the datatype of the variable as an array with the brackets
    //then initialize it  with a certain amount of positions of arrays in the array list




    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        //this is an arrayList
        ArrayList<String> strArraylist = new ArrayList<String>();
        //after creating the arraylist object called strArraylist, you can then start using methods to add, remove, etc
        strArraylist.add("tim");
        String position_zero = strArraylist.get(0);
        System.out.println(position_zero);


        //integers are primative types, primative type is not a class cannot use int arraylists

        //ArrayList<int> intArrayList = new ArrayList<int>();

        /*
        what you can do is create a class and make that class into an array list
         */
        ArrayList<Intclass> intClassArrayList = new ArrayList<Intclass>();
        intClassArrayList.add(new Intclass(54));

        Integer integer = new Integer(54);
        //when creating the double value object as a Double datatype
        // you cannot name it the same name as the data type.. "cannot use Double double = new..."
        Double doubleValue =new Double(11.3);

        //java is happy with this because we are using a valid class vs line 50 trying to assign a primative type
        ArrayList<Integer> integerArrayList2 = new ArrayList<Integer>();

        /*
        lets create a for loop and add some entries
         */

        for (int i = 0; i <= 10; i++) {
            //this is going to add an integer in the value of i which is zero to 10.. b/c i <= 10
                                            //value of is taking the value of i as the primative type
                                            //and converting it into the integer class so we can use it as a class
                                //this part below is called autoboxing.. creating or converting an integer(base primative int to an integer)<-- called autoboxing
            integerArrayList2.add(Integer.valueOf(i));
        }

        //when we want to excute it
        for (int i = 0; i <= 10; i++) {
                                                                //.intValue() is converting it from integer class to back to a primative type
                                                                //thats how we convert it
            System.out.println( i + "--> " + integerArrayList2.get(i).intValue());

        }

        System.out.println("***************************");

        /*
        unboxing is where taking it from the class or from the object
        wrapper and converting it back into a primative type
         */



        // long way of doing this is the above solution of autoboxing and unboxing
        //the easy way is here below :::::


            //odly here we dont have to add the 'new keyword'
            //java is doing the hard work for you
        //Integer is a class creating an integer object called integer1 which stores 56
        Integer integer1 = 56; //during compile time it gets converted to this --> Integer.valueOf(56)

        int myInt = integer1.intValue(); // java is doing --> myInt.intValue();

        ArrayList<Double> doubleMyValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10; dbl += 0.5) { // incrementing by 0.5
            doubleMyValues.add(dbl);

        }

        for(int i = 0; i <= doubleMyValues.size(); i++) {

            //converting from the object back into the primative type Double
            Double value = doubleMyValues.get(i);
            System.out.println(i + "-->" + value);

        }



    }



}


