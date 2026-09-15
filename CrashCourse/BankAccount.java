public class BankAccount {
    String accountName;
    int balance;
    int amountOfCards;
    boolean active;
    String password;
    String bankName;
    int accountNumber;

    public BankAccount(String accountName, String password, int balance){
        this.accountName = accountName;
        this.password = password;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount; 
    }

    public void changeActivationStatus(){
        active = !active;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public void changePassword(String newPass){
        password = newPass;
    }
    
    public void addCard(){
        amountOfCards++;
    }
}
