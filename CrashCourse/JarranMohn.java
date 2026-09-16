public class JarranMohn {
    String characterName;
    int health;
    int defence;
    int strength;
    int speed;
    int luck;
    int intelligence;
    int charisma;
    int terrariaSkill;
    int attractiveness;
    public JarranMohn(String characterName, int terrariaSkill, int strength){
        this.characterName = characterName;
        this.terrariaSkill = terrariaSkill;
        this.strength = strength;
    }
    public void attack(){
        System.out.println("attacking");
    }
    public void move(){
        System.out.println("moving");
    }
    public void playTerraria(int hours){
        terrariaSkill += hours;
    }
    public void fence(int hours){
        strength += hours;
    }
    public void talkToArben(int hours){
        charisma += hours;
    }
    public void learnGerman(int hours){
        intelligence += hours;
    }
    public void dontPlayTerraira(){
        health-=9999;
        defence-=9999;
        strength-=9999;
        speed-=9999;
        luck-=9999;
        intelligence-=9999;
        terrariaSkill-=9999;
        attractiveness-=9999;
        charisma-=9999;
    }
}