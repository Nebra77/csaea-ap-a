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
        return adress.indexOf("hcvsd.org") !=-1;
    }
    public String getFirstName(){
        return getUser().substring(0,adress.indexOf("."));
    }

    public String changeDomain(String newdomain){
        return getUser() + "@" + newdomain;
    }
    public String getLabel(){
        if(isSchool() == true){
            return "School: hcvsd.org";
        }
        else{
            return "Personal: " + getDomain();
        }
    }
    public boolean isStaffFormat(){
        return isSchool() && getFirstName().indexOf(".") != -1;
    }
}