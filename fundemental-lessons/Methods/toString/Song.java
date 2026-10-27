/*
 * Song: blueprint for Song objects.
 * New method: toString()
 *
 * toString() returns a String that describes an object.
 * Header -- copy it exactly:   public String toString()
 * It RETURNS text. It does not print.
 */

public class Song {

    // ATTRIBUTES. intance variables . . . . hold DATA for each song instance

    private String title;
    private String artist;
    private int plays;

    // Constructor 

    public Song(String t, String a) {
        this.title = t;
        this.artist = a;
        plays = 0;
    }
    // Methods. Behaviors 

    public void play(){
        plays++;
    }
    public int getplays(){
        System.out.println(plays); 
        return plays;
    }
    public String toString(){
        if(plays == 1 ){
            return title + " by " + artist + " - "  + String.valueOf(plays) + " play";
        }
        else{
            return title + " by " + artist + "-"  + String.valueOf(plays) + "plays";
        }
    }
}
