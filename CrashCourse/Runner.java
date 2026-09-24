public class Runner {
    private String name;
    private String team;
    private int age;
    private int wins;
    private int restNeeded;
    private int daysWaited;
    private double fiveKTime;
    private boolean healthy;
    public Runner(String name, String team, int age, double fiveKTime){
        this.name = name;
        this.team = team;
        this.age = age;
        this.fiveKTime = fiveKTime;
        this.healthy = true;
        this.wins = 0;
        this.restNeeded = 0;
        this.daysWaited = 0;
    }

    public void display(){
        System.out.println("Name: %s".formatted(name));
        System.out.println("Team: %s".formatted(team));
        System.out.println("Age: %d".formatted(age));
        System.out.println("5k Time: %f".formatted(fiveKTime));
        System.out.println("Healthy?: %b".formatted(healthy));
        System.out.println("Number of Wins: %d".formatted(wins));
        System.out.println("Amount of Rest needed(days): %d".formatted(restNeeded));
        System.out.println("Amount of days since excerise(days): %d".formatted(restNeeded));
    }

    public void train(double hours){
        if(healthy == true){
            if( ((int) (Math.random()*20))< Math.pow(hours,(restNeeded+1)) ){
                healthy = false;
                System.out.println("You have been injured. You cannot race or train untill you heal");
            } 
            else{
                fiveKTime -= hours/15;
                restNeeded = 3;
                daysWaited = 0;
            }
        }
        else{
            System.out.println("Unable to train due to injury, heal before you continue");
        }
        
    }

    public void transfer(String newTeam){
        team = newTeam;
        if(fiveKTime <= 16 || name == "Joel"){
            healthy = false;
            System.out.println("Your last team jumped you. You've been injured");
        }
    }

    public void race(){
        if (((int) (Math.random()*10)+12)<fiveKTime){
            wins +=1;
            System.out.println("You won!");
        }
    }

    public void rest(){
        daysWaited +=1;
        if(restNeeded>0){
            restNeeded-=1;
        }
        if(daysWaited>4){
        fiveKTime -= daysWaited/20;
        }
        if(healthy == false && ((int) (Math.random()*10))<daysWaited){
            healthy = true;
        }
    }
}