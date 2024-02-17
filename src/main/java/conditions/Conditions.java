package main.java.conditions;

public class Conditions {

    /**
     *  Conditions are used in code to execute the code if a certain codition is met.
     *  if , else, else if
     *
     *  if a condition becomes true, then the statements under the condition is executed.
     *  else if , always comes after if.
     *  if nothing is true, then we can put a else block that is executed only if the above "if" and "else if" are not true.
     */
    public static void main(String[] args) {

        int x = 20;

        if ( x > 10 ) {
            System.out.println( x + " is greater than 10");
        } else if ( x == 10 ) {
            System.out.println( x + " is equal to 10 ");
        }
        else {
            System.out.println( x + " is not greater than 10");
        }




    }
}
