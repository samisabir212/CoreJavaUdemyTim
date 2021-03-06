package Arrays.Banking;

import java.util.ArrayList;

/**
 * Created by sami on 5/24/17.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    private double balance;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
