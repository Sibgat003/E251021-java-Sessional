class BankAccount {
    
    private String accountHolder;
    private String accountNumber;
    private double balance;

   
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
       
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance! Cannot set negative value.");
        }
    }

    
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main2 {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        
        account1.setAccountHolder("Sibgatul Islam");
        account1.setAccountNumber("E251021");
        account1.setBalance(542000);

        account1.showAccountInfo();

        System.out.println();

        account2.setAccountHolder("Adnan Ajmain");
        account2.setAccountNumber("E251003");
        account2.setBalance(100000);

        account2.showAccountInfo();
      
    }
}
