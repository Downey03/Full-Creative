import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;

public class StringExample {

    public static void main(String[] args) {

        String emptyString = "";        //string with "" value
        String nullString = null;       //string with null value
        String literals = "     Hello, Welcome,Good,To  ,See ,  You   ";       //creating a string literal
        String literalsCopy = "     Hello, Welcome,Good,To  ,See ,  You   ";
        String literalCopyWithNewKeyword = new String("     Hello, Welcome,Good,To  ,See ,  You   ");

        char[] charArray = {'h','e','l','l','o',',',' '};

        String charArrayNew = new String(charArray);         //creating a string from char array using new keyword
        String stringCreatedWithNew = new String("Hi");     //creating a string using new keyword

        String sameStringFromHeap = "Hi";       //returns the literal from the SCP

        char[] stringToCharArray = literals.toCharArray();      //creates a character array from the string

        String[] stringToStringArray = literals.split(",");     //separates a string at the mentioned regex and stores
                                                                        //it in a string array
        String[] stringToStringArrayWithLimitedLength = literals.split(",",3);      //it does same function as
                                                                                        //split but it will limit the range

        String stringFromCharArray = Arrays.toString(stringToStringArray);         //creates a string from a char array

        int lengthOfTheString = literals.length();      //returns the length of the string(no of characters)

        literals.equals(literalsCopy);      //returns true if the given two string objects are same

        literals.equalsIgnoreCase(literalsCopy);     //same as equals but it will ignore case sensitivity

        literals.toLowerCase();     //convert all uppercase char to lower case(Alphabets)

        literals.toLowerCase(Locale.ROOT);      //converts all uppercase char to lowercase based on country(mostly not used)

        literals.toUpperCase();    //conver all lowercase to uppercase  ****(Locale.ROOT also applies to toUpperCase )

        literals.contains("Hello");         //returns true if the passed sequence is found in the string


        String str1 ="abce";     //it compares two string lexicographically
        String str2 ="abde";     //traverse till it reaches a index where the char are different
        str1.compareTo(str2);     //returns the difference between two strings
                                    //returns str1-str2
        str1.compareToIgnoreCase(str2); //same as compareTo but this will ignore case sensitivity

        literals.charAt(2);     //returns the character at the specified index

        IntStream stream = literals.chars();    //returns the stream of character, stored as code points (ascii)

        literals.codePointAt(5);    //returns the ascii value of the char at the specified index
        literals.codePointBefore(4);       //returns the ascii value of the char at the specified index-1
        literals.codePointCount(2,7);       //returns count of ascii values between the given range
                                            // start is inclusive and end is exclusive

        IntStream stream1 = literals.codePoints();      //returns the stream of characters as codepoints

        int cjt = literals.offsetByCodePoints(7,16);    //returns a index offset from the specified index
                                                                            //mostly useless method

        literals.concat(str1);   //concat the two strings and returns the value

        CharSequence sequence = "Hello, Welcome,Good,To  ,See ,  You";
        literals.contentEquals(sequence);   //returns true if the char-sequence is same as the string

        StringBuffer buffer = new StringBuffer("Hello, Welcome,Good,To  ,See ,  You");
        literals.contentEquals(buffer);     //returns true if the string-buffer is same as the string

        literals.endsWith("   ");    //returns true  if the string ends with the specified string

        char[] charArrayFromStringUsingGetChars = new char[30];
        literals.getChars(0,15,charArrayFromStringUsingGetChars,0);
                                            // parameter 1 is srcBegin
                                            // parameter 2 is srcEnd
                                            // param 3 is destCharArray
                                            // param 4 is startIndexInDestArray
                                            //It builds a chararray from the string

        literals.hashCode(); //returns the hashcode of the string,
                            //Initially h(hashcode) is 0
                            //the string is converted in byte array
                            //for each byte it calculates hash = 31 * h + (v & 0xff);  ***(v = byte value , 0xff is in hex
                                                                                    // binary value of 0xff is 11111111)

        literals.indent(2); //returns the string with n spaces at the beginning of each line and adds \n at the last
                            // if it is a negative value, it acts as  trim function only at the beginning (trim is explained below)

        literals.trim();    //removes empty spaces from the both end of a string

        literals.intern(); //


    }
}
