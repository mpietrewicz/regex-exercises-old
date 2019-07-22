package workshop.java.regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class NRepetitions {


    //N REPETITIONS

    /*
        Write a Pattern that matches:
        11223344556677
        12345678901234
        00000033111111
        And does not match:
        1122334455667
        111222333444555
        A1111111111111
     */
    public static Pattern DIGITS_14_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        heLLLLLLo
        JEllllY
        hiLLLLLLLs
        And does not match:
        heLLLo
        SIllllllllY
        4ellls
     */
    public static Pattern L_TIMES_4_TO_7_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Given a text, write a method that counts the number of words at least 4 letters long.
        (\\bABC\\b can be used to define word boundaries)
        Example:
        Elon Musk is a technology entrepreneur, investor, and engineer. -> 6
        In May 2002, Musk founded SpaceX. -> 3
        He helped fund Tesla, an electric vehicle and solar panel manufacturer. -> 8
     */
    public static Pattern WORD_PATTERN = Pattern.compile(REPLACE_ME);

    public int countWordsLongerThan4(String text) {
        Matcher m = WORD_PATTERN.matcher(text);
        int count = 0;
        while (m.find()) count++;
        return count;
    }


    /*
        Write a Pattern that matches phone numbers with country codes:
        +48 888666333  -> match
        +1 1231231231  -> match
        +355 77223344  -> match
        + 1234123412   -> not a match
        +1111 99900011 -> not a match
        +3499988877    -> not a match
     */
    public static Pattern COUNTRY_CODE_NUMBER_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches email addresses.
        princess@yahoo.com  -> match
        elf@o2.pl           -> match
        yolo123@hotmail.com -> match
        #self!e@gmail.com   -> not a match
        ogre@icloud,com     -> not a match
     */
    public static Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(REPLACE_ME);

}
