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
        
    }
}
