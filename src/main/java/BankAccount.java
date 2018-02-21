//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * defines the types of BankAccounts that you are allowed to create.
     */
    public enum BankAccountType {
        /**
         * All these are types of things that BankAccountType can be.
         */
        CHECKINGS,
        /**
         * Type savings.
         */
        SAVINGS,
        /**
         * Type Student.
         */
        STUDENT,
        /**
         * Type workplace.
         */
        WORKPLACE
    }

    /**
     * account number.
     */
    private int accountNumber;
    /**
     * bank Account type.
     */
    private BankAccountType accountType;
    /**
     * money in the account.
     */
    private double accountBalance;
    /**
     * name of the person who owns the account.
     */
    private String ownerName;
    /**
     * interest rate.
     */
    private double interestRate;
    /**
     * interest earned by the account.
     */
    private double interestEarned;

    /**
     * Bank Account constructer with paraeters for name and catagory.
     *
     * @param name            value for ownername.
     * @param accountCategory value for accountType.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
        
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * getter for account number.
     * @return accountNumber
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * setter for accountNumber.
     * @param nAccountNumber new account number to set.
     */
    public void setAccountNumber(final int nAccountNumber) {
        this.accountNumber = nAccountNumber;
    }

    /**
     * getter for accountBalance.
     * @return account balance
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * setter for account balance.
     * @param nAccountBalance new account balance to set.
     */
    public void setAccountBalance(final double nAccountBalance) {
        this.accountBalance = nAccountBalance;
    }

    /**
     * getter for account type.
     * @return accountType
     */
    public BankAccountType getAccountType() {
        return this.accountType;
    }

    /**
     * setter for account type.
     * @param nAccountType new type of accout
     */
    public void setAccountType(final BankAccountType nAccountType) {
        this.accountType = nAccountType;
    }

    /**
     * getter for ownerName.
     * @return ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * setter for ownerName.
     * @param nOwnerName new ownerName being set.
     */
    public void setOwnerName(final String nOwnerName) {
        this.ownerName = nOwnerName;
    }

    /**
     * getter for interest rate.
     * @return interestRate
     */
    public double getInterestRate() {
        return this.interestRate;
    }

    /**
     * setter for interest rate.
     * @param nInterestRate new interest rate to be set.
     */
    public void setInterestRate(final double nInterestRate) {
        this.interestRate = nInterestRate;
    }

    /**
     * getter for interest earned.
     * @return interestEarned
     */
    public double getInterestEarned() {
        return this.interestEarned;
    }

    /**
     * setter for interestEarned.
     * @param nInterestEarned new value to be set of interestEarned.
     */
    public void setInterestEarned(final double nInterestEarned) {
        this.interestEarned = nInterestEarned;
    }
}
