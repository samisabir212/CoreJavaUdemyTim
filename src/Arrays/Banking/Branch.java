package Arrays.Banking;

import java.util.ArrayList;

/**
 * Created by sami on 5/24/17.
 */
public class Branch {

    private String name; //branch name
    private ArrayList<Customer> customers; // customers


    //method to name the branch
    //initiallizing array list of customers
    // you can add to the this.customers
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    //your getter
    public String getName() {
        return name;
    }


    //true or false method for verification
    public boolean newCustomer(String customerName, double initialAmount) {


        //if it equals null its telling us that the customer isnt on file
        //because this is a new customer method... if the customer isnt on file it means we can add it
        if(findCustomer(customerName) == null) {
            //adding a new record
            //using the customer class and constructor
            //calling the constructor code from the customer class
            this.customers.add(new Customer(customerName, initialAmount));
            return true; //means we successfully added it
        }

        // if the code gets to here it means findCustoemr actually returns a customer
        //which means we cant add a new customer

        return false;
    }


    //true or false method to see if customer added a transaction
    public boolean addCustomerTransaction(String customerName, double amount) {

        //using autoboxing doing this so we can use the add transaction method within this method
        Customer existingCustomer = findCustomer(customerName);

        // if it doesnt equal null then the customer exists
        if(existingCustomer != null) {
            //the given existing customer adds the transaction with an amount
            existingCustomer.addTransaction(amount);
            return true;
        }


        return false;
    }


    //method that returns the size of the transaction the customer made.
    //pretty much checking off if t
    private Customer findCustomer(String customerName) {
        for(int i=0; i<this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }

        return null;
    }
}
