package workshop.java.regex.exercises;

import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class OnlyABCNotABC {

    //ONLY A B OR C, NOT A B OR C

    /*
        Write a Pattern that matches:
        Answer: A
        Answer: B
        Answer: C
        And does not match:
        Answer: D
        Ans: C
        Answer: a
     */
    public static Pattern ANSWER_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a Pattern that matches:
        most
        cost
        lost
        And does not match:
        host
        post
        dost
     */
    public static Pattern OST_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a Pattern that matches:
        My favorite odd number is: 3.
        My favorite odd number is: 5.
        My favorite odd number is: 7.
        And does not match:
        My favorite number is: 3
        My favorite odd number is: 2.
        My favorite odd number is: 4.
        My favorite odd number is: 6.
        My favorite odd number is 8.
     */
    public static Pattern ODD_NUMBER_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a Pattern that matches:
        big
        fig
        dig
        pig
        wig
        And does not match:
        zig
        jig
        ([^abc] can be used to exclude abc)
     */
    public static Pattern IG_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a Pattern that matches:
        pass1A
        pass12
        Word4e
        And does not match:
        11111R
        passs!
        pass1.
     */
    public static Pattern PASSWORD_PATTERN = Pattern.compile(REPLACE_ME);


}
