public class BankAccountTester{
    public static void main(String[] args){
    BankAccount acc1 = new BankAccount("acc1", "123456789",12345);
    BankAccount acc2 = new BankAccount("acc2", "987654321",9);
    BankAccount acc3 = new BankAccount("acc3", "135792468", 982398);
    BankAccount acc4 = new BankAccount("acc4", "abcdefghijklmnop", 9389283);
    BankAccount acc5 = new BankAccount("acc5", "helloWorld", 3);
    acc1.deposit(32);
    acc4.withdraw(-34343);
    acc5.changeActivationStatus();
    acc3.changePassword("imsocoolman");
    acc2.addCard();
    acc1.nameChange("Hello");
    acc4.view("abcdefghijklmnop", "acc4");
    }
}