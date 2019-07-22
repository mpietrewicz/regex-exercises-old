package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.ZeroOrMoreOneOrMoreReps;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Zero or more and one or more repetitions test")
public class ZeroOrMoreOneOrMoreRepsTest {

    ZeroOrMoreOneOrMoreReps p = new ZeroOrMoreOneOrMoreReps();

    @Nested
    @DisplayName("Match any String")
    class MatchAnyString {

        @Test
        @DisplayName("should return true for U2")
        void anyString_U2() {
            fail();
            assertTrue(ZeroOrMoreOneOrMoreReps.ANY_STRING_PATTERN.matcher("U2").matches());
        }

        @Test
        @DisplayName("should return true for aaaaa")
        void anyString_aaaaa() {
            fail();
            assertTrue(ZeroOrMoreOneOrMoreReps.ANY_STRING_PATTERN.matcher("aaaaa").matches());
        }

        @Test
        @DisplayName("should return true for !")
        void anyString_exclamation() {
            fail();
            assertTrue(ZeroOrMoreOneOrMoreReps.ANY_STRING_PATTERN.matcher("!").matches());
        }

        @Test
        @DisplayName("should return true for empty String")
        void anyString_empty() {
            fail();
            assertTrue(ZeroOrMoreOneOrMoreReps.ANY_STRING_PATTERN.matcher("").matches());
        }

        @Test
        @DisplayName("should return true for 777777777777777777")
        void anyString_77() {
            fail();
            assertTrue(ZeroOrMoreOneOrMoreReps.ANY_STRING_PATTERN.matcher("777777777777777777").matches());
        }
    }

    @Nested
    @DisplayName("Count all words")
    class CountAllWords {

        private String text1 = "Aruba is located 29 kilometres north of the coast of Venezuela.";
        private String text2 = "I will take 2 muffins and 1 cup of coffee.";
        private String text3 = "Thanks";

        @Test
        @DisplayName("should return 10 for \"Aruba is located 29 kilometres north of the coast of Venezuela.\"")
        void countAllWords_10() {
            fail();
            assertEquals(10, p.countAllWords(text1));
        }

        @Test
        @DisplayName("should return 8 for \"I will take 2 muffins and 1 cup of coffee.\"")
        void countAllWords_8() {
            fail();
            assertEquals(8, p.countAllWords(text2));
        }

        @Test
        @DisplayName("should return 8 for \"Thanks.\"")
        void countAllWords_1() {
            fail();
            assertEquals(1, p.countAllWords(text3));
        }

        @Test
        @DisplayName("should return false for 100")
        void countAllWords_100() {
            fail();
            assertFalse(ZeroOrMoreOneOrMoreReps.EVERY_WORD_PATTERN.matcher("100").matches());
        }
    }

    @Nested
    @DisplayName("Word starting with O and containing R or L")
    class WordWithORL {

        private String text1 = String.format("There's only two types of people in the world %n" +
                "The ones that ENTERTAIN, and the ones that OBSERVE");

        @Test
        @DisplayName("should find 2 matches for lyrics with \"only\" and \"observe\"")
        void wordWithORL_count_2() {
            Matcher m = ZeroOrMoreOneOrMoreReps.WORD_WITH_ORL_PATTERN.matcher(text1);
            int count = 0;
            while (m.find()) count++;
            assertEquals(2, count);
        }

        @Test
        @DisplayName("should return true for OR")
        void wordWithORL_OR() {
            fail();
            assertTrue(ZeroOrMoreOneOrMoreReps.WORD_WITH_ORL_PATTERN.matcher("OR").matches());
        }

        @Test
        @DisplayName("should return false for one")
        void wordWithORL_one() {
            fail();
            assertFalse(ZeroOrMoreOneOrMoreReps.WORD_WITH_ORL_PATTERN.matcher("one").matches());
        }

        @Test
        @DisplayName("should return false for world")
        void wordWithORL_world() {
            fail();
            assertFalse(ZeroOrMoreOneOrMoreReps.WORD_WITH_ORL_PATTERN.matcher("world").matches());
        }
    }

    @Nested
    @DisplayName("Postcode and town")
    class PostCodeAndTown {

        @Test
        @DisplayName("should return true for 00-102 Warszawa")
        void postCodeAndTown_Warszawa() {
            fail();
            assertTrue(ZeroOrMoreOneOrMoreReps.POSTCODE_TOWN_PATTERN.matcher("00-102 Warszawa").matches());
        }

        @Test
        @DisplayName("should return true for 20-027Lublin")
        void postCodeAndTown_Lublin() {
            fail();
            assertTrue(ZeroOrMoreOneOrMoreReps.POSTCODE_TOWN_PATTERN.matcher("20-027Lublin").matches());
        }

        @Test
        @DisplayName("should return true for 44-152   Gliwice")
        void postCodeAndTown_Gliwice() {
            fail();
            assertTrue(ZeroOrMoreOneOrMoreReps.POSTCODE_TOWN_PATTERN.matcher("44-152   Gliwice").matches());
        }

        @Test
        @DisplayName("should return false for 50135 Wroclaw")
        void postCodeAndTown_Wroclaw() {
            fail();
            assertFalse(ZeroOrMoreOneOrMoreReps.POSTCODE_TOWN_PATTERN.matcher("50135 Wroclaw").matches());
        }

        @Test
        @DisplayName("should return false for 80-29 Gdynia")
        void postCodeAndTown_Gdynia() {
            fail();
            assertFalse(ZeroOrMoreOneOrMoreReps.POSTCODE_TOWN_PATTERN.matcher("80-29 Gdynia").matches());
        }

        @Test
        @DisplayName("should return false for 59-300")
        void postCodeAndTown_59300() {
            fail();
            assertFalse(ZeroOrMoreOneOrMoreReps.POSTCODE_TOWN_PATTERN.matcher("59-300").matches());
        }
    }

    @Nested
    @DisplayName("Retrieve numbers from texts")
    class RetrieveNumbersFromText {

        private String text1 = "The story of the 3 Musketeers is situated between 1625 and 1628.";
        private String text2 = String.format("The Great Barrier Reef is the world's largest coral reef system %n" +
                "composed of over 2900 individual reefs and 900 islands stretching for over 2300 kilometres (1400 mi) %n" +
                "over an area of approximately 344400 square kilometres (133000 sq mi).");

        @Test
        @DisplayName("should return 3 1625 1628 for text about the Three Musketeers")
        void retrieveNumbers_3Musketeers() {
            fail();
            assertEquals("3 1625 1628 ", p.retrieveNumbers(text1));
        }

        @Test
        @DisplayName("should return 2900 900 2300 1400 344400 133000 for text about Aruba")
        void retrieveNumbers_Aruba() {
            fail();
            assertEquals("2900 900 2300 1400 344400 133000 ", p.retrieveNumbers(text2));
        }

        @Test
        @DisplayName("should return true for 0")
        void retrieveNumbers_0() {
            fail();
            assertTrue(ZeroOrMoreOneOrMoreReps.NUMBER_PATTERN.matcher("0").matches());
        }

        @Test
        @DisplayName("should return false for C")
        void retrieveNumbers_C() {
            fail();
            assertFalse(ZeroOrMoreOneOrMoreReps.NUMBER_PATTERN.matcher("C").matches());
        }

    }


}
