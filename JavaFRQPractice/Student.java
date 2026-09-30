package JavaFRQPractice;

public class Student {
   // declare instance variables here
 	private String name;
	private int grade;
   // write the constructor here
 	public Student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
   public void printInfo() {
      System.out.println(name + " — Grade " + grade);
   }
}
