package sg.edu.nus.iss;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private final String holderName;
    private String accountNumber;
    private float accountBalance;
    private List<String> transactions;
    private boolean isClosed;
    private Date openDate;
    private Date closeDate;

    // To format date time into legible string
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    // Constructors
    public BankAccount(String holderName) {
        this.holderName = holderName;
        this.accountBalance = 0f;
        this.openDate = new Date();
        transactions = new ArrayList<>();
    }

    public BankAccount(String holderName, float accountBalance) {
        this.holderName = holderName;
        this.accountBalance = accountBalance;
        this.openDate = new Date();
        transactions = new ArrayList<>();
    }

    // Getters and setters
    public String getHolderName() {
        return holderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    // Deposit method
    public void deposit(float depositAmount) {
        /**
         * If deposit is successful add the following line to transactions:
         * "deposit $<depositAmount> at <date time>"
         * 
         * Cases where deposit would not be accepted:
         * 1. account closed
         * 2. depositAmount is negative or less than accountBalance
         */

        if (isClosed) {
            throw new IllegalArgumentException("Account has been closed, you are not allowed to make a deposit.");
        }
        else if (depositAmount < 0) {
            throw new IllegalArgumentException("The deposited amount is negative, this is literally impossible");
        }
        else {
            LocalDateTime depositDateTime = LocalDateTime.now();
            String formattedDateTime = depositDateTime.format(myFormatObj);
            transactions.add("deposit - $" + depositAmount + " at " + formattedDateTime);
        }
    }
}
