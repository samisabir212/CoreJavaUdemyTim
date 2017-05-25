package Arrays.Banking;

import java.util.ArrayList;

/**
 * Created by sami on 5/24/17.
 */
public class Customer {


    private String name;

    //an Array list of transactions
    private ArrayList<Double> transactions;

    //constructor with name and initial amount
    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>(); //initiallizing the arraylist

        //you can call a method inside a constructor
        addTransaction(initialAmount); //this is adding the initial amount to the list of transactions
    }

    //adding a transaction. passing an amount as a double type
    public void addTransaction(double amount) {
        //demonstrating autoboxing.. caling this.transaction from the customer constructor.
        this.transactions.add(amount);
    }

    //method to get the name
    public String getName() {
        return name;
    }

    // a list of double type to get the array of transactions which returns transactions (look to the top of the script initializing  the double array called transactions)
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
