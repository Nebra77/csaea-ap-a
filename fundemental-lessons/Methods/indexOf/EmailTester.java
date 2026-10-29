public class EmailTester {
    public static void main(String[] args) {
        String word = "hello!";
        System.out.println(word.indexOf("h"));
        System.out.println(word.indexOf("l"));
        System.out.println(word.indexOf("ell"));
        System.out.println(word.indexOf("w"));
        System.out.println(word.indexOf("O"));
        Email my = new Email("hello.arben@cool.com");
        Email other = new Email("sdfhkskdh@kidshfksdujf");
        System.out.println(my.getAtIndex());
        System.out.println(other.getAtIndex());
        System.out.println(my.getUser());
        System.out.println(my.getDomain());
        System.out.println(my.getFirstName());
        System.out.println(my.changeDomain("apple.com"));
        System.out.println(my.getLabel());
    }
}
