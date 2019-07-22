package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.AnyCharacterAndPeriod;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Any character and period test")
public class AnyCharacterAndPeriodTest {


    @Nested
    @DisplayName("player name")
    class Player {

        @Test
        @DisplayName("should return true for D4V!D")
        void player_david() {
            fail();
            assertTrue(AnyCharacterAndPeriod.PLAYER_PATTERN.matcher("D4V!D").matches());
        }

        @Test
        @DisplayName("should return true for Paula")
        void player_paula() {
            fail();
            assertTrue(AnyCharacterAndPeriod.PLAYER_PATTERN.matcher("Paula").matches());
        }

        @Test
        @DisplayName("should return true for pro11")
        void player_pro11() {
            fail();
            assertTrue(AnyCharacterAndPeriod.PLAYER_PATTERN.matcher("pro11").matches());
        }

        @Test
        @DisplayName("should return false for player")
        void player_player() {
            fail();
            assertFalse(AnyCharacterAndPeriod.PLAYER_PATTERN.matcher("player").matches());
        }

        @Test
        @DisplayName("should return false for John")
        void player_john() {
            fail();
            assertFalse(AnyCharacterAndPeriod.PLAYER_PATTERN.matcher("John").matches());
        }

        @Test
        @DisplayName("should return false for P12")
        void player_p12() {
            fail();
            assertFalse(AnyCharacterAndPeriod.PLAYER_PATTERN.matcher("P12").matches());
        }
    }

    @Nested
    @DisplayName("find with wildcards")
    class WildcardsSearch {

        private String textToTest1 = String.format("Yes.%nI have a cat.%nHe is 9yo.");
        private String textToTest2 = "I don't like cat5, I have a dog!You too?";

        @Test
        @DisplayName("should find 3 matches for \"Yes.%nI have a cat.%nHe is 9yo.\"")
        void findWithWildcards_count_3() {
            fail();
            Matcher m = AnyCharacterAndPeriod.THREE_CHARS_AND_DOT_PATTERN.matcher(textToTest1);
            int count = 0;
            while (m.find()) count++;
            assertEquals(3, count);
        }

        @Test
        @DisplayName("should find 0 matches for \"I don't like cat5, I have a dog!You too?\"")
        void findWithWildcards_count_0() {
            fail();
            Matcher m = AnyCharacterAndPeriod.THREE_CHARS_AND_DOT_PATTERN.matcher(textToTest2);
            int count = 0;
            while (m.find()) count++;
            assertEquals(0, count);
        }

    }


    @Nested
    @DisplayName("flight numbers")
    class Flight {

        private String textToTest = String.format("The delayed flights are:%n" +
                "LOT123, LH3456, AA890T");

        @Test
        @DisplayName("should find 3 matches for \"The delayed flights are: LOT123, LH3456, AA890T\"")
        void flights_count_3() {
            fail();
            Matcher m = AnyCharacterAndPeriod.FLIGHT_PATTERN.matcher(textToTest);
            int count = 0;
            while (m.find()) count++;
            assertEquals(3, count);
        }

        @Test
        @DisplayName("should return false for A12345")
        void flight_A12345() {
            fail();
            assertFalse(AnyCharacterAndPeriod.FLIGHT_PATTERN.matcher("A12345").matches());
        }

        @Test
        @DisplayName("should return false for 1C345C")
        void flight_1C345C() {
            fail();
            assertFalse(AnyCharacterAndPeriod.FLIGHT_PATTERN.matcher("1C345C").matches());
        }

        @Test
        @DisplayName("should return false for AAAAAA")
        void flight_AAAAAA() {
            fail();
            assertFalse(AnyCharacterAndPeriod.FLIGHT_PATTERN.matcher("AAAAAA").matches());
        }

    }


    @Nested
    @DisplayName("two chars and three dots")
    class TwoCharsThreeDots {

        private String textToTest = "0... No. 10... Maybe... I don't know...";

        @Test
        @DisplayName("should find 3 matches for \"0... No. 10... Maybe... I don't know...\"")
        void three_dots_count_3() {
            fail();
            Matcher m = AnyCharacterAndPeriod.TWO_CHARS_THREE_DOTS_PATTERN.matcher(textToTest);
            int count = 0;
            while (m.find()) count++;
            assertEquals(3, count);
        }

        @Test
        @DisplayName("should return false for ...")
        void three_dots_only_dots() {
            fail();
            assertFalse(AnyCharacterAndPeriod.TWO_CHARS_THREE_DOTS_PATTERN.matcher("...").matches());
        }

    }


    @Nested
    @DisplayName("digit dot char dot digit")
    class DigitDotCharDotDigit {

        private String textToTest = String.format("One of these codes will unlock the treasure chest:%n" +
                "1.A.3, 1.2.3, 2...5, 11111, 1.2.A, A.2.3");

        @Test
        @DisplayName("should find 3 matches for \"One of these codes will unlock the treasure chest: " +
                "1.A.3, 1.2.3, 2...5, 11111, 1.2.A, A.2.3\"")
        void digit_dot() {
            fail();
            Matcher m = AnyCharacterAndPeriod.DIGIT_DOT_CHAR_DOT_DIGIT_PATTERN.matcher(textToTest);
            int count = 0;
            while (m.find()) count++;
            assertEquals(3, count);
        }

        @Test
        @DisplayName("should return true for 6.V.3")
        void digit_dot_6V3() {
            fail();
            assertTrue(AnyCharacterAndPeriod.DIGIT_DOT_CHAR_DOT_DIGIT_PATTERN.matcher("6.V.3").matches());
        }

        @Test
        @DisplayName("should return true for 1.8.3")
        void digit_dot_183() {
            fail();
            assertTrue(AnyCharacterAndPeriod.DIGIT_DOT_CHAR_DOT_DIGIT_PATTERN.matcher("1.8.3").matches());
        }

        @Test
        @DisplayName("should return true for 1...9")
        void digit_dot_19() {
            fail();
            assertTrue(AnyCharacterAndPeriod.DIGIT_DOT_CHAR_DOT_DIGIT_PATTERN.matcher("1...9").matches());
        }

        @Test
        @DisplayName("should return false for 55522")
        void digit_dot_55522() {
            fail();
            assertFalse(AnyCharacterAndPeriod.DIGIT_DOT_CHAR_DOT_DIGIT_PATTERN.matcher("55522").matches());
        }

        @Test
        @DisplayName("should return false for 2.3.D")
        void digit_dot_23D() {
            fail();
            assertFalse(AnyCharacterAndPeriod.DIGIT_DOT_CHAR_DOT_DIGIT_PATTERN.matcher("2.3.D").matches());
        }

        @Test
        @DisplayName("should return false for C.2.3")
        void digit_dot_C23() {
            fail();
            assertFalse(AnyCharacterAndPeriod.DIGIT_DOT_CHAR_DOT_DIGIT_PATTERN.matcher("C.2.3").matches());
        }
    }

}
