package workshop.java.regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class MatchesAbcOrDef {


    //MATCHES ABC OR DEF

    /*
        Write a pattern that matches the words:
        the
        this
        that
        And does not match:
        hat
        thus
        those
        there

        Then, given a text, write a method that counts the number of words which DO NOT match the pattern.
        Example:
        I believe that this nation should commit itself to achieving the goal, before this decade is out,
        of landing a man on the Moon and returning him safely to the Earth. -> 25
     */
    public static Pattern THE_PATTERN = Pattern.compile(REPLACE_ME);

    public int countNonThe(String input) {
        Matcher matcher = THE_PATTERN.matcher(input);
        String inputWithoutThe = matcher.replaceAll("");
        String[] words = inputWithoutThe.split(" +");
        return words.length;
    }

    /*
        Write a Pattern that matches:
        .pdf
        .docx
        .jpg
        And does not match:
        pdf
        docs
        .txt
     */
    public static Pattern EXTENSION_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a Pattern that matches a 9 digit phone number or an email address:
        888666777
        tiger@web.com
        roar1@interia.pl
     */
    public static Pattern PHONE_OR_EMAIL_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a pattern that matches the words film or movie with the title:
        film "Lion King" -> match film "Lion King"
        The movie "Spiderman" just came out -> match movie "Spiderman"
        Have you seen the film "Avengers"? -> match film "Avengers"

        And does not match:
        book "Tarzan"
        I'm going to see the "Batman" movie
     */
    public static Pattern MOVIE_FILM_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches the words saturday and sunday.
        Then, given a text, write a method that replaces those words with "weekend".
     */
    public static Pattern SATURDAY_SUNDAY_PATTERN = Pattern.compile(REPLACE_ME);

    public String replaceSaturdayAndSunday(String input) {
        return "";
    }

}


