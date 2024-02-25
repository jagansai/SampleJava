package main.java.strings;

public class Strings {

    /**
     *  Strings are text.
     *
     */

    /**
     *  Takes a text and also a token using which we can split the text by the token.
     *  text = "This,is,a,text"
     *  token = ","
     *
     *  This
     *  is
     *  a
     *  text
     */
    private static void splitBy( String text, String token ) {
        // Loop through the text
        // check if the character is equal to the token
        // if it is equal, then from the location where started looking for the token to this place where we found the token.
        // |-------|
        // 👆🏻     👆🏻
        // print it.
        //            👆🏻--------👆🏻
        //          print it.

        if ( text == null || token == null )
            return;

        int start = 0;
        for ( int i = 0; i < text.length(); ++i ) {
            if ( text.charAt( i ) == token.charAt( 0 ) ) {
                System.out.println( text.substring(start, i ) );
                start = i + 1;
            }
        }
        if ( start < text.length() ) {
            System.out.println( text.substring(start) );
        }
    }

    private static void stringOperations() {

                     // 👇🏻  👇🏻 👇🏻
        String text = "this is java";

        String[] strings = text.split(" ");

        // walkthrough array.
        for ( int i = 0; i < strings.length; ++i ) {
            System.out.println(strings[i]);
        }

        // Loop through 1..100
        for ( int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
        // Loop back from 100 .. 1
        for ( int i = 100; i > 0; --i ) {
            System.out.println( i );
        }
    }


    public static void main(String[] args) {

//        splitBy( "This,is,a,text", "," );
//        splitBy( "This,is,a,text,", "," );
//        splitBy( "This|is|a|string", "," );
//        splitBy("", "," );
//        splitBy(null, ",");
//        splitBy("abc", null );
//        splitBy( null, null );
        stringOperations();
    }
}
