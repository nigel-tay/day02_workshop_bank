package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {
    private float interest = 3;
    private int monthlyDuration = 6;
    private boolean interestChanged = false;
    private boolean durationChanged = false;

    public FixedDepositAccount(String holderName, float accountBalance) {
        super(holderName, accountBalance);
    }

    public FixedDepositAccount(String holderName, float interest, int monthlyDuration) {
        super(holderName);
        this.interest = interest;
        this.monthlyDuration = monthlyDuration;
    }

    public FixedDepositAccount(String holderName, float accountBalance, float interest, int monthlyDuration) {
        super(holderName, accountBalance);
        this.interest = interest;
        this.monthlyDuration = monthlyDuration;
    }

    public FixedDepositAccount(String holderName, final float accountBalance, float interest) {
        super(holderName, accountBalance);
        this.interest = interest;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        if (!interestChanged) {
            this.interest = interest;
            this.interestChanged = true;
        } else {
            throw new IllegalArgumentException("You may only change interest once");
        }
    }

    public int getMonthlyDuration() {
        return monthlyDuration;
    }

    public void setMonthlyDuration(int monthlyDuration) {
        if (!durationChanged) {
            this.monthlyDuration = monthlyDuration;
            this.durationChanged = true;
        } else {
            throw new IllegalArgumentException("You may only change duration once");
        }
    }

    @Override()
    public void withdraw(float withdrawalAmount) {
    }

    @Override()
    public void deposit(float depositAmount) {
    }

    @Override()
    public float getAccountBalance() {
        return accountBalance + interest;
    }

}
