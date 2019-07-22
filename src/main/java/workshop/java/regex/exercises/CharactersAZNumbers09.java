package workshop.java.regex.exercises;

import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class CharactersAZNumbers09 {



    //CHARACTERS A TO Z, DIGITS 0-9

    /*
        Write a Pattern that matches:
        The number on the dice is: 1.
        The number on the dice is: 2.
        The number on the dice is: 3.
        The number on the dice is: 4.
        The number on the dice is: 5.
        The number on the dice is: 6.
        And does not match:
        The number on the dice is: 7.
        The number on the dice is: 12.
        The number on the dice is 2.
        The number on the dice is: A.
     */
    public static Pattern DICE_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a Pattern that matches:
        Mark
        Andy
        Nick
        And does not match:
        mark
        4ndy
        johN
     */
    public static Pattern CAP_NAME_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        Mon,
        Tue,
        wed.
        THU,
        And does not match:
        123,
        Mo5.
        Fr.,
     */
    public static Pattern WEEKDAY_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        1+0=1
        2*2=4
        6-3=3
        5/5=1
        And does not match:
        A+4=C
        3^2=9
        12-1=B
     */
    public static Pattern MATH_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a Pattern that matches:
        A100
        f999
        .555
        And does not match:
        1100
        A099
        f99.
     */
    public static Pattern LETTER_NUMBER_PATTERN = Pattern.compile(REPLACE_ME);


}
