public class Knight {
    String characterName;
    int health;
    int energyLevel;
    boolean isHoly;
    int strength;
    boolean hasWeapon;
    int speed;

    //Constructor:
    public Knight(String characterName, int health, boolean isHoly){
        this.characterName = characterName;
        this.health = health;
        this.isHoly = isHoly;
    }
    //Behaviors:
    public void eat() {
        energyLevel +=25;
        if (energyLevel > 100){
            energyLevel = 100;
        }
    }
    public void breakWeapon(){
        hasWeapon = false;
        strength /= 2;
    }
    public void workOut() {
        strength +=1;
    }
    public void takeDamage(int amount){
        health -= amount;
    }
}