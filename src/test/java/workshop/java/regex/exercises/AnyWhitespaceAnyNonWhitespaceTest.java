package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.AnyWhitespaceAnyNonWhitespace;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Any whitespace and any non-whitespace test")
public class AnyWhitespaceAnyNonWhitespaceTest {

    private AnyWhitespaceAnyNonWhitespace p = new AnyWhitespaceAnyNonWhitespace();

    @Nested
    @DisplayName("Singer names")
    class Singer {

        @Test
        @DisplayName("should return true for Britney Spears")
        void singer_Britney_Spears() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.SINGER_PATTERN.matcher("Britney Spears").matches());
        }

        @Test
        @DisplayName("should return true for enrique iglesias")
        void singer_enrique_iglesias() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.SINGER_PATTERN.matcher("enrique iglesias").matches());
        }

        @Test
        @DisplayName("should return true for TAYLOR    SWIFT")
        void singer_TAYLOR_SWIFT() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.SINGER_PATTERN.matcher("TAYLOR    SWIFT").matches());
        }

        @Test
        @DisplayName("should return false for EMINEM")
        void singer_EMINEM() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.SINGER_PATTERN.matcher("EMINEM").matches());
        }

        @Test
        @DisplayName("should return false for Maroon 5")
        void singer_Maroon_5() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.SINGER_PATTERN.matcher("Maroon 5").matches());
        }

        @Test
        @DisplayName("should return false for beyonce")
        void singer_beyonce() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.SINGER_PATTERN.matcher("beyonce").matches());
        }
    }

    @Nested
    @DisplayName("Weekend")
    class Weekend {

        private String input = String.format("When the week ends I like to go finishing. %n" +
                "But I'm climbing this week end. What about your week%n" +
                "end? The weeks end so quickly. %n" +
                "I'm already planning the next week\tend.");
        private String output = String.format("When the week ends I like to go finishing. %n" +
                "But I'm climbing this weekend. What about your weekend? The weeks end so quickly. %n" +
                "I'm already planning the next weekend.");

        @Test
        @DisplayName("should return true for matching text with replaced weekends")
        void weekend_compare() {
            fail();
            assertEquals(output, p.replaceWeekend(input));
        }

        @Test
        @DisplayName("should return true for week end (space)")
        void weekend_week_end_space() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.WEEKEND_PATTERN.matcher("week end").matches());
        }

        @Test
        @DisplayName("should return true for week   end (tab)")
        void weekend_week_end_tab() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.WEEKEND_PATTERN.matcher("week\tend").matches());
        }

        @Test
        @DisplayName("should return true for week %n end (new line)")
        void weekend_week_end_newline() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.WEEKEND_PATTERN.matcher(String.format("week%nend")).matches());
        }

        @Test
        @DisplayName("should return false for weekend")
        void weekend_weekend() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.WEEKEND_PATTERN.matcher(String.format("weekend")).matches());
        }

        @Test
        @DisplayName("should return false for weeks end")
        void weekend_weeks_end() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.WEEKEND_PATTERN.matcher(String.format("weeks end")).matches());
        }

        @Test
        @DisplayName("should return false for week ends")
        void weekend_week_ends() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.WEEKEND_PATTERN.matcher(String.format("week ends")).matches());
        }
    }

    @Nested
    @DisplayName("Hashtag")
    class Hashtag {

        private String input1 = "Check out my pic! #sunny #Saturday #swimmingPool";
        private String output1 = " sunny Saturday swimmingPool";
        private String input2 = "Wow, biggest tree ever! #giant#tree #climb";
        private String output2 = " giant tree climb";

        @Test
        @DisplayName("should return true for matching text with retrieved hashtags 1")
        void retrieveHashtags_compare1() {
            fail();
            assertEquals(output1, p.retrieveHashtags(input1));
        }

        @Test
        @DisplayName("should return true for matching text with retrieved hashtags 2")
        void retrieveHashtags_compare2() {
            fail();
            assertEquals(output2, p.retrieveHashtags(input2));
        }

        @Test
        @DisplayName("should return true for #smile")
        void hashtag_smile() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.HASHTAG_PATTERN.matcher("#smile").matches());
        }

        @Test
        @DisplayName("should return true for #1999")
        void hashtag_1999() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.HASHTAG_PATTERN.matcher("#1999").matches());
        }

        @Test
        @DisplayName("should return true for #picOfTheDay")
        void hashtag_picOfTheDay() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.HASHTAG_PATTERN.matcher("#picOfTheDay").matches());
        }

        @Test
        @DisplayName("should return false for #hi everyone")
        void hashtag_hi_everyone() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.HASHTAG_PATTERN.matcher("#hi everyone").matches());
        }

        @Test
        @DisplayName("should return false for lol#funny")
        void hashtag_lol_funny() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.HASHTAG_PATTERN.matcher("lol#funny").matches());
        }

        @Test
        @DisplayName("should return false for sunshine")
        void hashtag_sunshine() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.HASHTAG_PATTERN.matcher("sunshine").matches());
        }

        @Test
        @DisplayName("should return false for #")
        void hashtag_only() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.HASHTAG_PATTERN.matcher("#").matches());
        }
    }

    @Nested
    @DisplayName("Quote")
    class Quote {

        private String input1 = String.format("Here is some money wisdom from rappers:%n" +
                "Quoting Eminem: \"A normal life is boring\"%n" +
                "50cent quotation: \"Get rich or die tryin.\"%n" +
                "Quote of Notorious B.I.G: \"Mo Money Mo Problems.\" Nice quote?%n" +
                "Drake said and I quote: \"A goal is just a dream with a deadline.\"");
        private String output1 = String.format("Here is some money wisdom from rappers:%n" +
                "Citing Eminem: \"A normal life is boring\"%n" +
                "50cent quotation: \"Get rich or die tryin.\"%n" +
                "Citing of Notorious B.I.G: \"Mo Money Mo Problems.\" Nice quote?%n" +
                "Drake said and I quote: \"A goal is just a dream with a deadline.\"");

        @Test
        @DisplayName("should return true for matching text with quote replaced by citing")
        void quoteRappers_compare() {
            fail();
            assertEquals(output1, p.quoteRappers(input1));
        }


        @Test
        @DisplayName("should return true for %nQuote")
        void quote_quote() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.QUOTE_PATTERN.matcher(String.format("%nQuote")).matches());
        }

        @Test
        @DisplayName("should return true for %nQuoTing")
        void quote_quoting() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.QUOTE_PATTERN.matcher(String.format("%nQuoTing")).matches());
        }

        @Test
        @DisplayName("should return true for %nquotAtion")
        void quote_quotation() {
            fail();
            assertTrue(AnyWhitespaceAnyNonWhitespace.QUOTE_PATTERN.matcher(String.format("%nquotAtion")).matches());
        }

        @Test
        @DisplayName("should return false for quotation")
        void quote_quotation_false() {
            fail();
            assertFalse(AnyWhitespaceAnyNonWhitespace.QUOTE_PATTERN.matcher(String.format("quotation")).matches());
        }
    }


}
