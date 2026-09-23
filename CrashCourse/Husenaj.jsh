import module java.base;
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
BankAccount acc1 = new BankAccount("acc1", "123456789",12345);
BankAccount acc2 = new BankAccount("acc2", "987654321",9);
BankAccount acc3 = new BankAccount("acc3", "135792468", 982398);
BankAccount acc4 = new BankAccount("acc4", "abcdefghijklmnop", 9389283);
BankAccount acc5 = new BankAccount("acc5", "helloWorld", 3);
acc3.password
acc5.balance
acc1.dsdf
acc1.active
acc2.accountName
acc5.amountOfCards
acc4.bankName
acc2.accountNumber
acc1.deposit(32)
acc4.withdraw(-3343423423)
acc4.withdraw(-34343)
acc5.changeActivationStatus()
acc3.changePassword("imsocoolman")
acc2.addCard()
acc1.nameChange("Hello:)
acc1.nameChange("Hello")
acc4.view("abcdefghijklmnop", "acc4")