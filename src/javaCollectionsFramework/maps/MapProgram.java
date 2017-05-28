package javaCollectionsFramework.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sami on 5/28/17.
 */
public class MapProgram {


    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();


        if(languages.containsKey("Java")) {

            System.out.println("Java already exists");

        } else {

            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }



        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));



        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }


        System.out.println("================================================");

        //languages.remove("Lisp");
        if (languages.remove("Algol", " Afamily of algol languages")) {
            System.out.println("algol removed");

        }else {
            System.out.println("algol not removed, key/value not found");

        }


        if (languages.replace("Lisp", "Therein lies madness", "a functional program language with imperative features")) {
            System.out.println("lisp replaced");

        }else {
            System.out.println("lisp was not replaced");
        }


        System.out.println(languages.replace("Scaler", "this will not be added it doesnt exists"));

        //looping through the keys   key in languages.keyset
        //this loop loops through all the values of they keys and prints the key and deffinition values
        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }


}
