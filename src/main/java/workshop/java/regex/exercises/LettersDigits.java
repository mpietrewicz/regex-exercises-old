package workshop.java.regex.exercises;

import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class LettersDigits {

    //LETTERS

    /*
        Write a Pattern that matches text "Lorem ipsum"
     */
    public static Pattern LOREM_IPSUM_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a Pattern that matches text:
         H
         E
         L
         L
         O
     */
    public static Pattern HELLO_PATTERN = Pattern.compile(String.format(REPLACE_ME));


    /*
        Write a Pattern that matches:
        CAT
        RAT
        BAT
        And does not match:
        CAST
        RANT
        BAIT
     */
    public static Pattern AT_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a pattern that matches SUN, sun, SUn, sUN, suN, sUn (case insensitive).
     */
    public static Pattern SUN_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a pattern that matches "Who's there?".
     */
    public static Pattern WHOS_THERE_PATTERN = Pattern.compile(REPLACE_ME);


    //DIGITS

    /*
        Write a Pattern that matches digits in:
        abc123
        a123bc
        ab123c
     */
    public static Pattern THREE_DIGIT_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a Pattern that matches:
        2*4=8
        4+4=8
        12-4=8
        And does not match:
        3*3=9
        7-4=3
        10-2=8
     */
    public static Pattern EIGHT_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches 3 or three. | can be used as OR.
     */
    public static Pattern THREE_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        121
        131
        And does not match:
        141
        151
     */
    public static Pattern ONE_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches "1999" only if it is in the beginning of a line. (^ is used as beginning of a line)
     */
    public static Pattern YEAR_PATTERN = Pattern.compile(REPLACE_ME);


}
