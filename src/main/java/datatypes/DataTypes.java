package main.java.datatypes;

public class DataTypes {

    /**
     *  - numbers : int, double, float, short, long
     *      - int : that does not have fraction
     *      - double: that has fractions
     *      - float: it has fractions, but smaller.
     *      - short: that does not have fraction, but smaller than int
     *      - long: that does not have fraction, but bigger than int and short
     *
     *   - char: single character and that is represented between  single quotes.
     *     - 'a', 'b', 'c'
     *   - string: String is a class. This is a text.
     *     - "This is a text". This can be single or multiple characters, but surrounded by double quotes.
     *   - boolean: true or false
     *   - byte: 8 bits is 1 byte. This is a binary representation of data.
     *
     */

    public static void main(String[] args) {

        // Java is a statically typed language.
        // Unlike, python for e.g., when you assign a type to a variable, the type of that variable remains
        // throughout the life cycle of the variable.
        boolean x = true;
        {
            int y = 10; // this is an integer.
            y = 20; // still integer.
            // x = true; this gives an error saying int is required and boolean is supplied.
            System.out.println(x);
        }

        x = false;

        // System.out.println(y); // this errors saying, "symbol not found"

        char c = 'a';
        c = 'b';

        // c = "this is a text". Error: char is expected and not string.

        String text = "This is a text";
        text = "this is another text";

        // text = 'a'; Error: cannot assign char to string.

        text = "a"; // a string can be single or multiple characters as long as they are wrapped between double quotes.


        int i  = 10;
        i = 500000000; //Error: number too large for an integer.

        long j = 10;
        j = 50000000000L;

        double k = 10.5;

        // i = 10.5; Error.


    }
}
