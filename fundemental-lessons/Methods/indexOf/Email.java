public class Email {

    private String adress;

    public Email(String adress){
        this.adress = adress;
    }

    public String toString(){
        return "";
    }

    public int getAtIndex(){
        return adress.indexOf("@");
    }

    public String getUser(){
        return adress.substring(0, getAtIndex());
    }
    
    public String getDomain(){
        return adress.substring(getAtIndex()+1);
    }

    public boolean isSchool(){
        return false;
    }
}