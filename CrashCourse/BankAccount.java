public class BankAccount {
    private String accountName;
    private int balance;
    private int amountOfCards;
    private boolean active;
    private String password;
    private String bankName;
    private int accountNumber;

    public BankAccount(String accountName, String password, int balance){
        this.accountName = accountName;
        this.password = password;
        this.balance = balance;
        this.amountOfCards = 1;
        this.accountNumber = (int) (Math.random()*1000);
        this.bankName = "Chase Bank";
        this.active = true;
    }

    public void deposit(int amount){
        balance += amount; 
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public void changeActivationStatus(){
        active = !active;
    }


    public void changePassword(String newPass){
        if(newPass.length()<8 || newPass == password){
            System.out.println("Bad password, try again");
        }
        else{        
            password = newPass;
        }
    }

    public void addCard(){
        amountOfCards++;
    }
    public void nameChange(String newName){
        accountName = newName;
    }
    public void view(String passCheck, String accCheck){
        if(passCheck != password || accCheck != accountName){
            System.out.println("Incorrect password, please try again");
        }
        else{
            System.out.println("Account Name: %s".formatted(accountName));
            System.out.println("Account Number: %d".formatted(accountNumber));
            System.out.println("Current Balance: %d".formatted(balance));
            System.out.println("Bank Location: %s".formatted(bankName));
            System.out.println("Account Status: %b".formatted(active));
            System.out.println("Amount of Cards: %d".formatted(amountOfCards));
        }
    }
}
