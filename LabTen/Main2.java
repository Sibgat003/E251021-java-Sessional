interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}


class DBBL implements ATMService {
    private double balance;

    
    DBBL(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main2 {
    public static void main(String[] args) {
        DBBL account = new DBBL(1000); 

        account.checkBalance();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500); 
        account.checkBalance();
    }
}
