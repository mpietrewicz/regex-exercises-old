package workshop.java.regex.exercises;

import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class AnyAlphaAnyNonalpha {

    //ANY ALPHANUMERIC CHARACTER, ANY NON-ALPHANUMERIC CHARACTER

    /*
        Write a Pattern that matches:
        anna@email.com
        1234@email.com
        mac3@email.com
        And does not match:
        .ha!@email.com
        love@email.pl
        3,5l@email.com
     */
    public static Pattern EMAIL_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a Pattern that matches:
        Password: MRSeve!^
        Password: 111win.*
        Password: P4SS01&@
        And does not match:
        Password: MISsion@
        Password: 123abc/
        Password: I<3you!
     */
    public static Pattern PASS_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a Pattern that matches:
        Scott1975ii
        Steve1988p3
        Simon200044
        And does not match:
        Danny1980tt
        St3ven1995m
        Simon2000..
     */
    public static Pattern NAME_YEAR_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a Pattern that matches:
        mix.
        195.
        20C.
        And does not match:
        mix
        195
        4a.
     */
    public static Pattern THREE_CHARS_DOT_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a Pattern that matches:
        WW33aa++
        sa5611@.
        Nm003r!\
        And does not match:
        2233aa++
        sasa11;;
        NN99pp88
     */
    public static Pattern LETTERS_DIGITS_ALPHA_NONALPHA = Pattern.compile("\\D\\D\\d\\d\\w\\w\\W\\W");

}
