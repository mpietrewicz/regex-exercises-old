package workshop.java.regex.exercises;

import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class AnyDigitAnyNondigit {

    //ANY DIGIT

    /*
        Write a Pattern to match all characters in:
        user1
        user2
        user3
        (\\d can be used to match any digit)
     */
    public static Pattern USER_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a pattern that matches:
        1VS3
        4VS4
        9VS7
        And does not match:
        1AB3
        4PB4
        9MN7
     */
    public static Pattern VS_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a pattern that matches:
        Boeing 737
        BOEING 747
        boeing 777
        And does not match:
        boeing 147
        Boeing 773
        BOEING 7U7
     */
    public static Pattern BOEING_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        55 years old
        24 years old
        36 years old
        And does not match:
        9 years old
        2.5 years old
        32 years
     */
    public static Pattern AGE_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        11-07-2019
        22/07/2019
        03-07-2019
        And does not match:
        2019-07-11
        14/07/2018
        22/11/2019
     */
    public static Pattern DATE_PATTERN = Pattern.compile(REPLACE_ME);


    //ANY NON-DIGIT CHARACTER

    /*
        Write a pattern that matches:
        Bob
        Amy
        Don
        And does not match:
        567
        Bo2
        4my
        (\\D can be used as any non-digit character).
     */
    public static Pattern NAME_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        DLU12345
        ELW33377
        HPB66118
        And does not match:
        WA1234PL
        11223344
        AABBCCDD
     */
    public static Pattern REG_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        wind 120 NW
        wind 040 NE
        wind 220 SW
        And does not match:
        temp 021 C
        wind 020 15 kt
        info not available
     */
    public static Pattern WIND_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        Jan14
        Dec07
        Aug31
        And does not match:
        13Jul
        Feb2
        May2012
     */
    public static Pattern MONTH_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        logged in as user JANE
        logged in as user Lola
        logged in as user PETE
        And does not match:
        JANE
        logged in as user BOB1
        LOGGED IN AS USER 1234
     */
    public static Pattern LOGIN_PATTERN = Pattern.compile(REPLACE_ME);


}
