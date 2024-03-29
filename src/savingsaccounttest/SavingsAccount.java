

package savingsaccounttest;

/**
 *
 * @author Michael
 * 
 * * 8.6 (Savings Account Class) Create class SavingsAccount. Use a static variable annualInterestRate
to store the annual interest rate for all account holders. 
* 
* Each object of the class contains a
private instance variable savingsBalance indicating the amount the saver currently has on deposit.

* Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12—this interest should be added to savings-
Balance. 
* 
* Provide a static method modifyInterestRate that sets the annualInterestRate to a new
value. 
* 
* Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
the new balances for both savers.
* 
*   SavingsAccount
* -------------------
*   
*   -static annualInterestRate: double
*   -       savingsBalance  : double
* -----------------------------
*   <<Constructor>>SavingsAccount (double balance)
* 
*   +static        modifyInterestRate (double newRate)
*   
*   +calculateMonthlyInterest (): double
 */
public class SavingsAccount {
    private static double annualInterestRate = 0.0;
    private        double savingsBalance ;
    
    public SavingsAccount (double bal)
    {
       setBalance (bal);
    } 
    
    public String toString()
    { 
    // return String.format("balance:  \n", this.getBalance() );
    // String.format("%2dth month   %.2f     %.2f\n", i,  bal1, bal2);
        
     Double temp;    
    
     temp = getBalance();  
     return String.format("%.2f ", temp); 
    }
    
    static void modifyInterestRate (double newRate)
    {
        if (newRate >0)
        {
            annualInterestRate = newRate/ 100.0 ;   
        }
    } // end modifyInterestRate
    
    public double calculateMonthlyInterest ()
    {
     double amt, interest;
     
 
     interest = getBalance() * (SavingsAccount.annualInterestRate)/12.0 ;
     amt = getBalance() + interest;
     setBalance (amt);
     
     // System.out.printf("interest= %f new balance = %f", interest, getBalance() );
     
     return amt;
    }
    
    
    public double getBalance()
    {
        return savingsBalance;  // instance
    }
    
        public void setBalance(double bal)
    {
        savingsBalance = bal;
    }
    
    
}
