package JavaFRQPractice;

public class Movie {
    private String title;
	private int rating;
   // write the constructor here
 	public Movie(String title, int rating){
		this.title = title;
		this.rating = rating;
	}
   public void printInfo() {
      System.out.println(title + " — Rating: " + rating);
   }

}
