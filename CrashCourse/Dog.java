public class Dog {
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public Dog(String name, String ownderName, String breed){
        this.name = name;
        this.ownerName = ownderName;
        this.breed = breed;
    }
    public void bark(){
        System.out.println("BARK BARK");
    }
    public void scratch(){
        System.out.println("scratch scratch");
    }
    public void bite(){
        System.err.println("ow");
    }
    public void eat(){
        isHungry = false;
        weight+=5;
    }
    public void runAway(){
        isHome = false;
        energyLevel -=5;
    }
    public void comeHome(){
        isHome=true;
    }
    public void sleep(){
        energyLevel=10;
    }
    public void birthday(){
        age+=1;
    }
}
