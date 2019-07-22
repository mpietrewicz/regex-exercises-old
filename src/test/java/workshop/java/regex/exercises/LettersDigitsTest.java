package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.LettersDigits;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Letters and digits test")
class LettersDigitsTest {

    @Nested
    @DisplayName("find with text")
    class LiteralTextSearch {

        private String textToTest1 = "Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit. Vestibulum dictum dui posuere, " +
                "dignissim ipsum sed, cursus nisl. " +
                "Aenean ultrices, ligula et mattis tristique, justo leo vulputate mi, v" +
                "itae egestas lectus dui et ex.";

        private String textToTest2 = "Lorem ipsu dolor sit amet, " +
                "consectetur adipiscing elit. Vestibulum dictum dui posuere, " +
                "dignissim ipsum sed, cursus nisl. " +
                "Aenean ultrices, ligula et mattis tristique, justo leo vulputate mi, v" +
                "itae egestas lectus dui et ex.";

        private String textToTest3 = "lorem ipsu dolor sit amet, " +
                "consectetur adipiscing elit. Vestibulum dictum dui posuere, " +
                "dignissim ipsum sed, cursus nisl. " +
                "Aenean ultrices, ligula et mattis tristique, justo leo vulputate mi, v" +
                "itae egestas lectus dui et ex.";

        @Test
        @DisplayName("should return true for Lorem ipsum")
        void literalTextSearch_true() {
            fail();
            assertTrue(LettersDigits.LOREM_IPSUM_PATTERN.matcher(textToTest1).find());
        }

        @Test
        @DisplayName("should return false for Lorem ipsu")
        void literalTextSearch_false_ipsu() {
            fail();
            assertFalse(LettersDigits.LOREM_IPSUM_PATTERN.matcher(textToTest2).find());
        }

        @Test
        @DisplayName("should return false for lorem ipsum")
        void literalTextSearch_false_lorem() {
            fail();
            assertFalse(LettersDigits.LOREM_IPSUM_PATTERN.matcher(textToTest3).find());
        }

    }

    @Nested
    @DisplayName("match H E L L O")
    class MatchHello {

        private String hello1 = String.format("H%nE%nL%nL%nO");
        private String hello2 = "HELLO";
        private String hello3 = String.format("H%nE%nL%nL%nO%n!");


        @Test
        @DisplayName("should return true for H E L L O")
        void findHello_true() {
            fail();
            assertTrue(LettersDigits.HELLO_PATTERN.matcher(hello1).matches());
        }

        @Test
        @DisplayName("should return false for HELLO")
        void findHello_false() {
            fail();
            assertFalse(LettersDigits.HELLO_PATTERN.matcher(hello2).matches());
        }

        @Test
        @DisplayName("should return false for H E L L O !")
        void findHello_false_exclamation() {
            fail();
            assertFalse(LettersDigits.HELLO_PATTERN.matcher(hello3).matches());
        }
    }

    @Nested
    @DisplayName("find AT")
    class FindAT {

        @Test
        @DisplayName("should return true for CAT")
        void findAT_cat() {
            fail();
            assertTrue(LettersDigits.AT_PATTERN.matcher("CAT").find());
        }

        @Test
        @DisplayName("should return true for RAT")
        void findAT_rat() {
            fail();
            assertTrue(LettersDigits.AT_PATTERN.matcher("RAT").find());
        }

        @Test
        @DisplayName("should return true for BAT")
        void findAT_bat() {
            fail();
            assertTrue(LettersDigits.AT_PATTERN.matcher("BAT").find());
        }

        @Test
        @DisplayName("should return false for CAST")
        void findAT_cast() {
            fail();
            assertFalse(LettersDigits.AT_PATTERN.matcher("CAST").find());
        }

        @Test
        @DisplayName("should return false for RANT")
        void findAT_rant() {
            fail();
            assertFalse(LettersDigits.AT_PATTERN.matcher("RANT").find());
        }

        @Test
        @DisplayName("should return false for BAIT")
        void findAT_bait() {
            fail();
            assertFalse(LettersDigits.AT_PATTERN.matcher("BAIT").find());
        }
    }

    @Nested
    @DisplayName("find Sun")
    class FindSun {

        private String sunText = "The Sun is our nearest star.";

        @Test
        @DisplayName("should return true for sun")
        void find_sun() {
            fail();
            assertTrue(LettersDigits.SUN_PATTERN.matcher("sun").matches());
        }

        @Test
        @DisplayName("should return true for SUN")
        void find_SUN() {
            fail();
            assertTrue(LettersDigits.SUN_PATTERN.matcher("SUN").matches());
        }

        @Test
        @DisplayName("should return true for suN")
        void find_suN() {
            assertTrue(LettersDigits.SUN_PATTERN.matcher("suN").matches());
        }

        @Test
        @DisplayName("should return true for Sun")
        void find_Sun() {
            fail();
            assertTrue(LettersDigits.SUN_PATTERN.matcher(sunText).find());
        }

    }

    @Nested
    @DisplayName("find Who's there?")
    class FindWhosThere {

        private String joke1 = String.format("Knock knock! %nWho's there?");
        private String joke2 = "Knock knock! Who's there?";
        private String joke3 = "Who's there?";
        private String joke4 = "Who's there";

        @Test
        @DisplayName("should return true for \"Knock knock! %nWho's there?\"")
        void find_WhosThere() {
            fail();
            assertTrue(LettersDigits.WHOS_THERE_PATTERN.matcher(joke1).find());
        }

        @Test
        @DisplayName("should return true for \"Knock knock! Who's there?\"")
        void find_WhosThere_no_line_break() {
            fail();
            assertTrue(LettersDigits.WHOS_THERE_PATTERN.matcher(joke2).find());
        }

        @Test
        @DisplayName("should return true for \"Who's there?\"")
        void find_WhosThere_true() {
            fail();
            assertTrue(LettersDigits.WHOS_THERE_PATTERN.matcher(joke3).matches());
        }

        @Test
        @DisplayName("should return false for \"Who's there\"")
        void find_WhosThere_no_question_mark() {
            fail();
            assertFalse(LettersDigits.WHOS_THERE_PATTERN.matcher(joke4).find());
        }
    }

    @Nested
    @DisplayName("match 123")
    class Match123 {

        @Test
        @DisplayName("should return true for 123")
        void match_123() {
            fail();
            assertTrue(LettersDigits.THREE_DIGIT_PATTERN.matcher("123").matches());
        }

        @Test
        @DisplayName("should return false for abc")
        void match_abc() {
            fail();
            assertFalse(LettersDigits.THREE_DIGIT_PATTERN.matcher("abc").matches());
        }

        @Test
        @DisplayName("should return false for 345")
        void match_345() {
            fail();
            assertFalse(LettersDigits.THREE_DIGIT_PATTERN.matcher("345").matches());
        }

    }


    @Nested
    @DisplayName("equals 8")
    class Equals8 {

        @Test
        @DisplayName("should return true for 2*4=8")
        void equals8_248() {
            fail();
            assertTrue(LettersDigits.EIGHT_PATTERN.matcher("2*4=8").find());
        }

        @Test
        @DisplayName("should return true for 4+4=8")
        void equals8_448() {
            fail();
            assertTrue(LettersDigits.EIGHT_PATTERN.matcher("4+4=8").find());
        }

        @Test
        @DisplayName("should return true for 12-4=8")
        void equals8_1248() {
            fail();
            assertTrue(LettersDigits.EIGHT_PATTERN.matcher("12-4=8").find());
        }

        @Test
        @DisplayName("should return false for 3*3=9")
        void match_339() {
            fail();
            assertFalse(LettersDigits.EIGHT_PATTERN.matcher("3*3=9").find());
        }

        @Test
        @DisplayName("should return false for 7-4=3")
        void match_743() {
            fail();
            assertFalse(LettersDigits.EIGHT_PATTERN.matcher("7-4=3").find());
        }

        @Test
        @DisplayName("should return false for 10-2=8")
        void match_1028() {
            fail();
            assertFalse(LettersDigits.EIGHT_PATTERN.matcher("10-2=8").find());
        }

    }


    @Nested
    @DisplayName("three or 3")
    class Three {

        @Test
        @DisplayName("should return true for 3")
        void three_3() {
            fail();
            assertTrue(LettersDigits.THREE_PATTERN.matcher("David has 3 brothers").find());
        }

        @Test
        @DisplayName("should return true for three")
        void three_three() {
            fail();
            assertTrue(LettersDigits.THREE_PATTERN.matcher("David has three brothers").find());
        }

        @Test
        @DisplayName("should return false for 4")
        void three_4() {
            fail();
            assertFalse(LettersDigits.THREE_PATTERN.matcher("David has 4 brothers").find());
        }
    }


    @Nested
    @DisplayName("121 or 131")
    class OneTwoOne {

        @Test
        @DisplayName("should return true for 121")
        void oneTwoOne_121() {
            fail();
            assertTrue(LettersDigits.ONE_PATTERN.matcher("121").matches());
        }

        @Test
        @DisplayName("should return true for 131")
        void oneTwoOne_131() {
            fail();
            assertTrue(LettersDigits.ONE_PATTERN.matcher("131").matches());
        }

        @Test
        @DisplayName("should return false for 141")
        void oneTwoOne_141() {
            fail();
            assertFalse(LettersDigits.ONE_PATTERN.matcher("141").matches());
        }

        @Test
        @DisplayName("should return false for 151")
        void oneTwoOne_151() {
            fail();
            assertFalse(LettersDigits.ONE_PATTERN.matcher("151").matches());
        }
    }

    @Nested
    @DisplayName("1999 in the beginning of a line")
    class Year1999 {

        private String textToTest1 = "1999 was a very good year";
        private String textToTest2 = "Everyone enjoyed 1999";
        private String textToTest3 = String.format("2000 was the last year of the 20th century. %n1999 wasn't");

        @Test
        @DisplayName("should return true for 1999 was a very good year")
        void year1999_beginning() {
            fail();
            assertTrue(LettersDigits.YEAR_PATTERN.matcher(textToTest1).find());
        }

        @Test
        @DisplayName("should return false for Everyone enjoyed 1999")
        void year1999_end() {
            fail();
            assertFalse(LettersDigits.YEAR_PATTERN.matcher(textToTest2).find());
        }

        @Test
        @DisplayName("should return true for 2000 was the last year of the 20th century %n1999 wasn't")
        void year1999_new_line() {
            fail();
            assertTrue(LettersDigits.YEAR_PATTERN.matcher(textToTest3).find());
        }
    }

}

