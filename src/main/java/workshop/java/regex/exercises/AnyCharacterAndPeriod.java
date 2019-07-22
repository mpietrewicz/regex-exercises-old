package workshop.java.regex.exercises;

import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class AnyCharacterAndPeriod {

    //ANY CHARACTER AND PERIOD

    /*
        Write a pattern that matches:
        D4V!D
        Paula
        pro11
        And does not match:
        player
        John
        P12
        (. can be used as any character)
     */
    public static Pattern PLAYER_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a pattern that matches:
        cat.
        Yes.
        9yo.
        And does not match:
        dog
        .you
        cat5
     */
    public static Pattern THREE_CHARS_AND_DOT_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        LOT123
        LH3456
        AA890T
        And does not match:
        A12345
        1C345C
        AAAAAA
     */
    public static Pattern FLIGHT_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        I don't know...
        10...
        Maybe...
        And does not match:
        No.
        ...
        0...
     */
    public static Pattern TWO_CHARS_THREE_DOTS_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        1.A.3
        1.2.3
        2...5
        And does not match:
        11111
        1.2.A
        A.2.3
     */
    public static Pattern DIGIT_DOT_CHAR_DOT_DIGIT_PATTERN = Pattern.compile(REPLACE_ME);


}
