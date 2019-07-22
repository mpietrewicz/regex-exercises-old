package workshop.java.regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class ZeroOrMoreOneOrMoreReps {


    //ZERO OR MORE REPS, ONE OR MORE REPS

    /*
        Write a Pattern that matches any String (even empty).
        U2      -> match
        aaaaa   -> match
                -> match
        !       -> match
    */
    public static Pattern ANY_STRING_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a pattern that matches any word made of only letters.

        Then, given a sentence, write a method that counts how many words are in it.
        Example:
        Aruba is located 29 kilometres north of the coast of Venezuela. -> 10
        I will take 2 muffins and 1 cup of coffee. -> 8
     */
    public static Pattern EVERY_WORD_PATTERN = Pattern.compile(REPLACE_ME);

    public int countAllWords(String text) {
        Matcher m = EVERY_WORD_PATTERN.matcher(text);
        int count = 0;
        while (m.find()) count++;
        return count;
    }

    /*
        Write a pattern that matches any word that starts with an O and contains the letters R or L.
        Only    -> match
        or   -> match
        OBSERVE -> match
        one     -> not a match
        world   -> not a match
     */
    public static Pattern WORD_WITH_ORL_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a pattern that matches:
        00-102 Warszawa
        20-027Lublin
        44-152   Gliwice
        And does not match:
        50135 Wroclaw
        59-300
        80-29 Gdynia
     */
    public static Pattern POSTCODE_TOWN_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches any number made of digits only.

        Then, given a text, write a method that returns a String of all numbers that occur in the text.
        Example:
        The story of the 3 Musketeers is situated between 1625 and 1628. -> 3 1625 1628
        The Great Barrier Reef is the world's largest coral reef system composed of over 2900 individual reefs
        and 900 islands stretching for over 2300 kilometres (1400 mi) over an area of approximately 344400
        square kilometres (133000 sq mi). -> 2900 900 2300 1400 344400 133000
     */
    public static Pattern NUMBER_PATTERN = Pattern.compile(REPLACE_ME);

    public String retrieveNumbers(String text) {
        Matcher matcher = NUMBER_PATTERN.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) result.append(matcher.group() + " ");
        return result.toString();
    }


}
