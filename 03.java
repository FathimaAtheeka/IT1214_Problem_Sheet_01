class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public int getBalance(){
        return balance;
    }
    public setBalance(int balance){
        this.balance = balance;
    }

    public void withdraw (double amount){
        if(amount > balance){
            throw new IllegalArgumentException("insufficient balance");
        }
        balance -= amount;
    }

    public void displayAccountdetails(){
        return "Account Number: " + accountNumber + "Account Holder: " + accountHolder + "Balance: " + balance ;
    }

}
class Bank{
    private BankAccount[] accounts;
    private int accountCount;

    public Bank(){
        accounts = new BankAccount[5];
        accountCount = 0;
    }

    public void addAccount(BankAccount account){
        if(accountCount < accounts.lenght){
            accounts[accountCount++] = account;
        }else{
            System.out.println("Cannot add more accounts. Maximum limit reached.")
        }
    }
    public void withdrawFromAccount(int accountNumber, double amount){
        for(int i = 0; i < accountCount; i++){
            if(accounts[i].getAccountNumber() == accountNumber) {
                try{
                    accounts[i].withdraw(amount);
                    System.out.println("Withdrawal successful from account " + accountNumber);
                }
                catch(IllegalArgumentException){
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }
    public void displayAllAccounts(){
        for(int i = 0; i < accountCount; i++){
            System.out.println(accounts[i].displayDetails());
        }
    }
}

public class BankAccountManager{
    public static void main (String[] args){
        Bank bank = new Bank();

        bank.addAccount(new BankAccount(1001, "Alice", 5000.0));
        bank.addAccount(new BankAccount(1002, "Bob", 3000.0));

        bank.withdrawFromAccount(1001, 6000.0);
        bank.withdrawFromAccount(1002, 1000.0);
        
        bank.displayAllAccounts();
    }
}