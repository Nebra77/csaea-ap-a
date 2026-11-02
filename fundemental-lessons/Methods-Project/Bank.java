public class Bank {
    private String name;
    private String ownerName;
    private int accounts;
    private double liquidity;
    private boolean isOpen;
    public Bank(String name, String ownerName, int accounts, double liquidity){
        this.name = name;
        this.ownerName = ownerName;
        this.accounts = accounts;
        this.liquidity = liquidity;
        this.isOpen = true;
    }

    public int getIndexOf(){
        return name.indexOf("Bank");
    }

    public String plainName(){
        if (getIndexOf() < 0){
            return name;
        }
        else{
            return name.substring(0, getIndexOf()-1);
        }
    }

    public String toString(){
        return "Bank: " + plainName() + "  Accounts connected: " + accounts + "  availible: " + isOpen;
    }   

    public void changeUsers(int change){
        if(accounts+change<0){
        }
        else{
        accounts+=change;
        }
    }
    public void changeAvailible(){
        isOpen = !isOpen;
    }
    public void loan(double amount){
        if(amount<liquidity && isOpen == true){
            liquidity -=amount;
        }
    }
    public boolean isOwnerFamous(){
        return plainName().equals(ownerName) == true;
    }
}
