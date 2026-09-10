import java.util.ArrayList;

public class CrashCourse {     // class header

    public static void main(String[] args) {

        // comments 
        
        /*  Multiline 
         Comment
         Here
         */

         System.out.print("Hello");
         System.out.println("World"); // auto-prints on a new line
         System.out.println("Hello world");

         // varialbe declarations:
         // PRIMITIVE VARIABLES
         int a; // integer
         double b; // decimal, or float
         boolean c; // true or false;

         a = 4;
         b = 5.5;
         c = false; // lowercase

         // Arithmetic Operators 
         // + - / *  %
         // += -= /=  %=

        int d = 3;
        d += 7;

        System.out.println("d is equal to " + d);

        // increment and decrement by one:
        // --  ++
        d--;
        d++;
        d++;
        System.out.println("d is NOW equal to " + d);

        //COMPARISONS (always returns true or false)
        //  <  >   <=   >=   ==   !=
        System.out.println(4 < 5);
        System.out.println(7 == 4);
        System.out.println(1 != 2);

        //LOGICAL OPERATORS  
        // ! not
        // %% and
        // || or

        //Casting
        int g = (int)5.5; //rounds down
        System.out.println(g);
        double h = (double)5/6;
        System.out.println(h);
        
        //Strings
        String s1 = "hey ";
        String s2 = "wasup ";
        String s3 = "hello";
        String big = s1+s2+s3;
        System.out.println(big);
        big += " man";
        System.out.println(big);

        //Arrays
        int [] arry1 = new int[10];
        System.out.println(arry1); //prints memory adress
        arry1[0] = 11;
        arry1[1] = 2;
        System.out.println(arry1);
        int[] arry2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //2d arrays
        int [] [] arryGrid1 = new int[4][3]; //[rows][columns]
        System.out.println(arryGrid1.length);
        System.out.println(arryGrid1[0].length);

        int[][] arryGrid2= {{7,8,9},{4,5,6},{1,2,3}};
        System.out.println(arryGrid2[0][1]); //get 8

        /*ArrayLists
        Any size, many built in functions
        Avoid primative data types
        Special classes for Integer, Boolean, Double, and String. Called "wrapper classes" */
        ArrayList<String> arryLst = new ArrayList<>();
        arryLst.add("I");
        arryLst.add("love");
        arryLst.add("John");
        arryLst.remove(0);
        System.out.println(arryLst);
        arryLst.add(0, "Me");
        System.out.println(arryLst.size());
        System.out.println(arryLst.get(2));

        //Math Class
        Math.max(2,3); // returns 2
        Math.min(4,5); // returns 4
        Math.sqrt(49); //returns 7
        Math.abs(-3); //returns 3
        //if elseif else
        

        boolean tru = true; boolean fal = false;
        if(tru){
            System.out.println("Good stuff");
        }else if(!fal){
            System.out.println("eh");
        }else{
            System.out.println("Less good stuff");
        }

int x = 5;
                while (x < 10) {
            System.out.print(x + " ");
            x++;
         }

         System.out.println();

         // for loop
         // initialize variable at index; conditional; increment/decrement
         for(int i = 0; i < 5; i++) {
            System.out.println(i);
         }

         // enhanced for loop (only for reading values)
         ArrayList<String> animals = new ArrayList<>();
         animals.add("Sheep");
         animals.add("Deer");
         animals.add("Moose");
         System.out.println("ArrayList: " + animals);

         for (String s : animals) {
            System.out.println("We saw a " + s);
         }

         // printing values of an array with iteration

         double[] arry = {5.1, 2.2, 5.3, 3.4, 8.5};
         System.out.println("Memory address: " + arry);

         for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
         }

        int[][] arryMatrix = {  { 0, 32, 12 }  ,   { 7, 13, 22  } ,  { 6, 77, 100  }  };
        System.out.println(arryMatrix);

        for(int row = 0; row < arryMatrix.length; row++) {
            for(int col = 0; col < arryMatrix[row].length; col++) {
                System.out.print(arryMatrix[row][col] + " ");
            }
            System.out.println();   
        }
    }
}