package Arrays.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by sami on 5/25/17.
 */
public class Demo0 {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        //calling the method called printList... tim always calls the method before even creating it.
        printList(placesToVisit);


        placesToVisit.add(2, "alice springs");

        printList(placesToVisit);

        placesToVisit.remove(1);
        printList(placesToVisit);


    }


    /*
    this method is counting the placesToVisit linkedList
    you can call this method after a change such as adding and removing or replacing
    when you do replaces or add or remove you have to call the method to get your result
     */
    private static void printList(LinkedList<String> linkedList) {
        //iterator of string
        //this is like a for loop but in a different kind of way
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }



    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                // new City should appear before this one
                // Brisbane  -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }



}