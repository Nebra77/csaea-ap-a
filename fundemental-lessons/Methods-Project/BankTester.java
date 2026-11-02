public class BankTester {
    public static void main(String[] args){
        Bank chase = new Bank("Chase Bank", "Chase", 3232, 38983293.23);
        Bank td = new Bank("TD Bank", "John", 2, 32);
        Bank jp = new Bank("JP Morgan", "Horen", 389238938, 31111111);
        System.out.println(chase.getIndexOf());
        System.out.println("6");
        System.out.println(jp.getIndexOf());
        System.out.println("-1");
        System.out.println(td.plainName());
        System.out.println("TD");
        System.out.println(jp.plainName());
        System.out.println("JP Morgan");
        chase.changeUsers(-32);
        chase.loan(8983293);
        System.out.println(chase);
        System.out.println("Bank: Chase  Accounts connected: 3200  availible: true"  );
        System.out.println(chase.isOwnerFamous());
        System.out.println("true");
        td.changeAvailible();
        System.out.println(td);
        System.out.println("Bank: TD  Accounts connected: 2  availible: false");
    }
}
