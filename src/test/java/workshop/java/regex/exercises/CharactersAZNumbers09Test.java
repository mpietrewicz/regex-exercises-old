package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;
import static workshop.java.regex.exercises.CharactersAZNumbers09.*;

@DisplayName("Characters A to Z and digits 0-9")
public class CharactersAZNumbers09Test {


    @Nested
    @DisplayName("The number on the dice is: ")
    class Dice {

        @Test
        @DisplayName("should return true for The number on the dice is: 1.")
        void dice_1() {
            fail();
            assertTrue(DICE_PATTERN.matcher("The number on the dice is: 1.").matches());
        }

        @Test
        @DisplayName("should return true for The number on the dice is: 2.")
        void dice_2() {
            fail();
            assertTrue(DICE_PATTERN.matcher("The number on the dice is: 2.").matches());
        }

        @Test
        @DisplayName("should return true for The number on the dice is: 4.")
        void dice_4() {
            fail();
            assertTrue(DICE_PATTERN.matcher("The number on the dice is: 4.").matches());
        }

        @Test
        @DisplayName("should return true for The number on the dice is: 6.")
        void dice_6() {
            fail();
            assertTrue(DICE_PATTERN.matcher("The number on the dice is: 6.").matches());
        }

        @Test
        @DisplayName("should return false for The number on the dice is: 7.")
        void dice_7() {
            fail();
            assertFalse(DICE_PATTERN.matcher("The number on the dice is: 7.").matches());
        }

        @Test
        @DisplayName("should return false for The number on the dice is: 12.")
        void dice_12() {
            fail();
            assertFalse(DICE_PATTERN.matcher("The number on the dice is: 12.").matches());
        }

        @Test
        @DisplayName("should return false for The number on the dice is 2.")
        void dice_2_false() {
            fail();
            assertFalse(DICE_PATTERN.matcher("The number on the dice is 2.").matches());
        }

        @Test
        @DisplayName("should return false for The number on the dice is: A.")
        void dice_A() {
            fail();
            assertFalse(DICE_PATTERN.matcher("The number on the dice is: A.").matches());
        }
    }

    @Nested
    @DisplayName("Name beginning with capital letter")
    class CapName {

        @Test
        @DisplayName("should return true for Mark")
        void cap_name_Mark() {
            fail();
            assertTrue(CAP_NAME_PATTERN.matcher("Mark").matches());
        }

        @Test
        @DisplayName("should return true for Andy")
        void cap_name_Andy() {
            fail();
            assertTrue(CAP_NAME_PATTERN.matcher("Andy").matches());
        }

        @Test
        @DisplayName("should return true for Nick")
        void cap_name_Nick() {
            fail();
            assertTrue(CAP_NAME_PATTERN.matcher("Nick").matches());
        }

        @Test
        @DisplayName("should return false for mark")
        void cap_name_mark() {
            fail();
            assertFalse(CAP_NAME_PATTERN.matcher("mark").matches());
        }

        @Test
        @DisplayName("should return false for johN")
        void cap_name_johN() {
            fail();
            assertFalse(CAP_NAME_PATTERN.matcher("johN").matches());
        }

        @Test
        @DisplayName("should return false for 4ndy")
        void cap_name_4ndy() {
            fail();
            assertFalse(CAP_NAME_PATTERN.matcher("4ndy").matches());
        }
    }


    @Nested
    @DisplayName("Weekdays")
    class Weekday {

        private String textToTest = "The days of the week are: Mon, TUE, WEd, thu, fRi, saT, SUn.";

        @Test
        @DisplayName("should find 7 matches for \"The days of the week are: Mon, TUE, WEd, thu, fRi, saT, SUn.\"")
        void weekday_count_7() {
            fail();
            Matcher m = WEEKDAY_PATTERN.matcher(textToTest);
            int count = 0;
            while (m.find()) count++;
            assertEquals(7, count);
        }

        @Test
        @DisplayName("should return false for 123,")
        void weekday_123() {
            fail();
            assertFalse(WEEKDAY_PATTERN.matcher("123,").matches());
        }

        @Test
        @DisplayName("should return false for Mo5.")
        void cap_name_Mo5() {
            fail();
            assertFalse(WEEKDAY_PATTERN.matcher("Mo5.").matches());
        }

        @Test
        @DisplayName("should return false for Fr.,")
        void cap_name_Fr() {
            fail();
            assertFalse(WEEKDAY_PATTERN.matcher("Fr.,").matches());
        }
    }

    @Nested
    @DisplayName("Math equations")
    class Math {

        private String textToTest = String.format("Solved Math homework: %n" +
                "1+0=1 %n" +
                "2*2=4 %n" +
                "6-3=3 %n" +
                "5/5=1 %n" +
                "A+4=C %n" +
                "3^2=9 %n" +
                "12-1=B");

        @Test
        @DisplayName("should find 4 matches for text with 4 correct equations")
        void math_count_4() {
            fail();
            Matcher m = MATH_PATTERN.matcher(textToTest);
            int count = 0;
            while (m.find()) count++;
            assertEquals(4, count);
        }
    }


    @Nested
    @DisplayName("Letter and 3-digit number")
    class LetterNumber {

        @Test
        @DisplayName("should return true for A100")
        void letterNumber_A100() {
            fail();
            assertTrue(LETTER_NUMBER_PATTERN.matcher("A100").matches());
        }

        @Test
        @DisplayName("should return true for f999")
        void letterNumber_f999() {
            fail();
            assertTrue(LETTER_NUMBER_PATTERN.matcher("f999").matches());
        }

        @Test
        @DisplayName("should return true for .555")
        void letterNumber_555() {
            fail();
            assertTrue(LETTER_NUMBER_PATTERN.matcher(".555").matches());
        }

        @Test
        @DisplayName("should return false for 1100")
        void letterNumber_1100() {
            fail();
            assertFalse(LETTER_NUMBER_PATTERN.matcher("1100").matches());
        }

        @Test
        @DisplayName("should return false for f99")
        void letterNumber_f99() {
            fail();
            assertFalse(LETTER_NUMBER_PATTERN.matcher("f99").matches());
        }

        @Test
        @DisplayName("should return false for A099")
        void letterNumber_A099() {
            fail();
            assertFalse(LETTER_NUMBER_PATTERN.matcher("A099").matches());
        }
    }

}
