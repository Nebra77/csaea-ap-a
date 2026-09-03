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
        System.out.println(arryGrid1.length); //prints memory adress
        System.out.println(arryGrid1[0].length); //prints memory adress

    }
}