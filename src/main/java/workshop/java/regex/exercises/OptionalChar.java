package workshop.java.regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class OptionalChar {


    //OPTIONAL CHARACTER

    /*
        Write a Pattern that matches:
        The item costs 1 dollar.
        The items cost 1 dollar.
        The items cost 75000 dollars.
        And does not match:
        The itemm cost 3 dollars.
        The items cost 5 dollars?
        The item costs XX dollars.
     */
    public static Pattern ITEM_COST_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches the words below:
        flavor, flavour, flavors, flavours, recognize, recognise, recognizes, recognises

        Then, given a text, write a method that counts the number of occurrences of these words.
        Example:
        When you pinch your nose it is difficult to recognize flavors. -> 2

        My favorite flavor of yogurt is blueberry. It's easy to recognize because of its purple color.
        My brother's favourite yoghurt flavour is raspberry. You can recognise it by the presence of little seeds.
        My sister likes all the flavours. She recognizes no difference.

     */
    public static Pattern UK_US_SPELLING_PATTERN = Pattern.compile(REPLACE_ME);

    public int countUKandUSspelling (String text) {
        Matcher matcher = UK_US_SPELLING_PATTERN.matcher(text);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }

    /*
        Write a Pattern that matches only these words: Hog, Hogs, Dog, Dogs, hog, hog, dog, dogs.
        Then, given a text, write a method that returns the same text, but with these words changed to upper case.
        Example:
        Look! Our dogs are chasing away a hog across the logs. -> Look! Our DOGS are chasing away a HOG across the logs.
     */
    public static Pattern DOG_HOG_PATTERN = Pattern.compile(REPLACE_ME);

    public String dogHogToUpperCase(String input) {
        StringBuilder output = new StringBuilder(input);
        Matcher matcher = DOG_HOG_PATTERN.matcher(input);
        while (matcher.find()) output.replace(matcher.start(), matcher.end(), matcher.group().toUpperCase());
        return output.toString();
    }


    /*
        Write a pattern that matches:
        http://www.mywebsite.com
        https://index.com
        https://www.pictures.com/page1
        http://news.com/article/details

        And does not match:
        www.web.com
        https:/website.com
        http://pages.pl
        https://www.entertainment/radio.com

        Then, given a text, write a method that replaces the web addresses with CLICK HERE
        Example:
        Read about my adventures on my blog: https://mytravel.com -> Read about my adventures on my blog: CLICK HERE
     */
    public static Pattern WEBSITE_PATTERN = Pattern.compile(REPLACE_ME);

    public String replaceWebAddress(String input) {
        return "";
    }

    /*
        Write a Pattern that matches:
        bOOk
        BOOKING
        lOok
        looKing
        And does not match:
        cooking
        kookin
        ROOK
     */
    public static Pattern BOOK_LOOK_PATTERN = Pattern.compile(REPLACE_ME);


}
