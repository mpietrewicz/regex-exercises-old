package workshop.java.regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class AnyWhitespaceAnyNonWhitespace {

    //ANY WHITESPACE, ANY NON-WHITESPACE

    /*
        Write a pattern that matches:
        Britney Spears
        enrique iglesias
        TAYLOR    SWIFT
        And does not match
        EMINEM
        Maroon 5
        beyonce
     */
    public static Pattern SINGER_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        week end (space)
        week    end (tab)
        "week
         end" (new line)
        And does not match:
        weekend
        week ends
        weeks end

        Use \\s for any whitespace.

        Then, given a text, write a method that removes the whitespace characters between "week" and "end"
     */
    public static Pattern WEEKEND_PATTERN = Pattern.compile(REPLACE_ME);

    public String replaceWeekend(String input) {
        return "";
    }


    /*
        Given a text, write a method that replaces all tabs with a space.
     */
    public String replaceSpaces(String input) {
        return "";
    }

    /*
        Write a Pattern that matches:
        #smile
        #1999
        #picOfTheDay
        And does not match:
        #hi everyone
        sunshine
        lol#funny
        #
        Use \\S for any non-whitespace.

        Then, given a text, write a method that extracts all hashtag words from it.
        Example:
        Check out my pic! #sunny #Saturday #swimmingPool ->  sunny Saturday swimmingPool
        Wow, biggest tree ever! #giant#tree #climb ->  giant tree climb
     */
    public static Pattern HASHTAG_PATTERN = Pattern.compile(REPLACE_ME);

    public String retrieveHashtags(String text) {
        Matcher matcher = HASHTAG_PATTERN.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) result.append(matcher.group().replace('#', ' '));
        return result.toString();
    }


    /*
        Write a Pattern that matches:
        Quote
        QuoTing
        quotAtion
        Only if they appear in the beginning of a new line.

        Then, given a text, write a method that finds the matching words
        and replaces them with a new line and the word Citing.
        Example:
        Here is some money wisdom from rappers:
        Quoting Eminem: "A normal life is boring"
        50cent quotation: "Get rich or die tryin."
        Quote of Notorious B.I.G: "Mo Money Mo Problems." Nice quote?
        Drake said and I quote: "A goal is just a dream with a deadline."
        ->
        Here is some money wisdom from rappers:
        Citing Eminem: "A normal life is boring"
        50cent quotation: "Get rich or die tryin."
        Citing of Notorious B.I.G: "Mo Money Mo Problems." Nice quote?
        Drake said and I quote: "A goal is just a dream with a deadline."
     */
    public static Pattern QUOTE_PATTERN = Pattern.compile(REPLACE_ME);

    public String quoteRappers(String input) {
        return "";
    }

}
