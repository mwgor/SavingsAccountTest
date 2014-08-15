
package savingsaccounttest;
import  java.util.Scanner;

/**
 *
 * @author Michael Gor
 * 
 * 8.6 (Savings Account Class) Create class SavingsAccount. Use a static variable annualInterestRate
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
* 
*   SavingsAccount
* -------------------
*  <<Constructor>>SavingsAccount (double balance)
*   
*   -static annualInterestRate: double
*   -       savingsBalance  : double
* -----------------------------
*   +static        modifyInterestRate (double newRate)
*   +static double getInterestRate (double newRate)
* 
*   +double calculateMonthlyInterest (): double
* 
 */
public class SavingsAccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*   Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
the new balances for both savers.
*/
        
        SavingsAccount saver1, saver2;
        double bal1, bal2;
        
        SavingsAccount.modifyInterestRate (4.0); // 4% interest
        System.out.printf("             saver1       saver2    at 4 percent interest\n\n");
        
        saver1 = new SavingsAccount(2000.0);
        saver2 = new SavingsAccount(3000.0);
        
        for (int i =1; i<=13; i++)
        {    
        if (i == 13)  
           {
            System.out.println();
            System.out.printf("             saver1       saver2    at 5 percent interest\n\n");      
            SavingsAccount.modifyInterestRate (5.0); // 5% interest
            }
           
        
        bal1 = saver1.calculateMonthlyInterest();
        bal2 = saver2.calculateMonthlyInterest();
        
        System.out.printf("%2dth month   %s     %s\n", i, 
                            saver1.toString(), saver2.toString() );
        
        } // end For
        
        
    } // end Main
    
}
