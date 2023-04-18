package sg.edu.nus.iss;

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

    // Constructors
    public BankAccount(String holderName) {
        this.holderName = holderName;
        this.accountBalance = 0f;
    }

    public BankAccount(String holderName, float accountBalance) {
        this.holderName = holderName;
        this.accountBalance = accountBalance;
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

}
