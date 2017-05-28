package javaCollectionsFramework.maps.adventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sami on 5/28/17.
 */
public class Main {


    private static Map<Integer, Location> locations = new HashMap<Integer, Location>(); //location of current position


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));



        //adding exits for each location (ROOM)
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        //locations.get(1).addExit("Q", 0);

        //adding exits from room 2
        locations.get(2).addExit("N", 5);
       // locations.get(2).addExit("Q", 0);

        //adding exits from room 3
        locations.get(3).addExit("W", 1);
        //locations.get(3).addExit("Q", 0);

        //adding exits from  room 4
        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        //locations.get(4).addExit("Q", 0);

        //adding exits from room 5
        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("S", 1);
      //  locations.get(1).addExit("Q", 0);






        int locationNumber = 1;
        while (true) {
            System.out.println(locations.get(locationNumber).getDescription());
            if (locationNumber == 0) {
                break;

            }

            //indicate the directions using map of exits key is string value is integer
            Map<String, Integer> exits = locations.get(locationNumber).getExits();
            System.out.print("availble exits are ");
            for (String exit : exits.keySet()) {
                System.out.println(exit + ", ");
            }
            System.out.println("~~~~~~~~~~~~~~~");


            String direction = scanner.nextLine().toUpperCase();


            if (exits.containsKey(direction)) {
                locationNumber = exits.get(direction);



            }else{
                System.out.println("you cannot go that direction");

            }

//
//            if (!locations.containsKey(locationNumber)) {
//                System.out.println("you cannot go in that direction");
            }
        }




    }




