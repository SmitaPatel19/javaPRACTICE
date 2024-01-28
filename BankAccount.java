import java.util.*;

public class BankAccount {

    public static class BankAccountCL{
        int accountNumber;
        String accountHolderName;
        float balance;

        BankAccountCL(int accountNumber,String name,float balance){
            this.accountNumber = accountNumber;
            this.accountHolderName = name;
            this.balance = balance;
        }

        float deposit(float ammount){
            balance =  (balance + ammount);
            return balance;
        }

        float withdraw(float ammount){
            balance = (balance - ammount);
            return balance;
        }

        void accounDetails(){
            System.out.println("Name : "+accountHolderName);
            System.out.println("Account Number : "+accountNumber);
            System.out.println("Balance Ammount : "+balance);
        }
    }
    public static void main(String[] args) {
        
        BankAccountCL p1 = new BankAccountCL(202251129, "Smita", 10000);

        p1.deposit(3000);
        p1.withdraw(2);
        p1.accounDetails();

        System.out.println();

        BankAccountCL p2 = new BankAccountCL(202251123, "Shailly Yadav", 12000);

        p2.deposit(1000);
        p2.withdraw(200);
        p2.accounDetails();
    }    
}
