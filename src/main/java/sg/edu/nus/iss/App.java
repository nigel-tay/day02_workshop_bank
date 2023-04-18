package sg.edu.nus.iss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Instantiate new BankAccount object
        BankAccount nigelAccount = new BankAccount("nigel");

        // Deposit test
        nigelAccount.deposit(100f);
        System.out.println(nigelAccount.getTransactions());

        // Withdraw test
        nigelAccount.withdraw(50f);
        System.out.println(nigelAccount.getTransactions());


        // Instantiate new FixedDepositAccount
        FixedDepositAccount nigelFixedAccount = new FixedDepositAccount("nigel", 100f);

        // Try change default values
        nigelFixedAccount.setInterest(10f);
        nigelFixedAccount.setMonthlyDuration(10);
        System.out.println(nigelFixedAccount.getInterest());
        System.out.println(nigelFixedAccount.getMonthlyDuration());
        // nigelFixedAccount.setInterest(11f);
        // nigelFixedAccount.setMonthlyDuration(11);

        // Try withdraw from fixed
        nigelFixedAccount.withdraw(100f);
        System.out.println(nigelFixedAccount.getTransactions());

        // Try deposit from fixed
        nigelFixedAccount.deposit(100f);;
        System.out.println(nigelFixedAccount.getTransactions());

        // Try getBalance
        System.out.println(nigelFixedAccount.getAccountBalance());
    }
}
