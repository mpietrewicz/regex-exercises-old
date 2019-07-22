package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.AnyAlphaAnyNonalpha;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Any alphanumeric character and any non-alphanumeric character test")
public class AnyAlphaAnyNonalphaTest {


    @Nested
    @DisplayName("name@email.com")
    class Email {

        @Test
        @DisplayName("should return true for anna@email.com")
        void email_anna() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.EMAIL_PATTERN.matcher("anna@email.com").matches());
        }

        @Test
        @DisplayName("should return true for 1234@email.com")
        void email_1234() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.EMAIL_PATTERN.matcher("1234@email.com").matches());
        }

        @Test
        @DisplayName("should return true for mac3@email.com")
        void email_mac3() {
            assertTrue(AnyAlphaAnyNonalpha.EMAIL_PATTERN.matcher("mac3@email.com").matches());
        }

        @Test
        @DisplayName("should return false for .ha!@email.com")
        void email_ha() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.EMAIL_PATTERN.matcher(".ha!@email.com").matches());
        }

        @Test
        @DisplayName("should return false for love@email.pl")
        void email_pl() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.EMAIL_PATTERN.matcher("love@email.pl").matches());
        }

        @Test
        @DisplayName("should return false for 3,5l@email.com")
        void email_35l() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.EMAIL_PATTERN.matcher("3,5l@email.com").matches());
        }
    }


    @Nested
    @DisplayName("Password with non-alphanumeric characters")
    class Pass {

        @Test
        @DisplayName("should return true for Password: MRSeve!^")
        void pass_MRSeve() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.PASS_PATTERN.matcher("Password: MRSeve!^").matches());
        }

        @Test
        @DisplayName("should return true for Password: 111win.*")
        void pass_111win() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.PASS_PATTERN.matcher("Password: 111win.*").matches());
        }

        @Test
        @DisplayName("should return true for Password: P4SS01&@")
        void pass_P4SS01() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.PASS_PATTERN.matcher("Password: P4SS01&@").matches());
        }

        @Test
        @DisplayName("should return false for Password: MISsion@")
        void pass_MISsion() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.PASS_PATTERN.matcher("Password: MISsion@").matches());
        }

        @Test
        @DisplayName("should return false for Password: 123abc/")
        void pass_123abc() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.PASS_PATTERN.matcher("Password: 123abc/").matches());
        }

        @Test
        @DisplayName("should return false for Password: I<3you!")
        void pass_I3you() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.PASS_PATTERN.matcher("Password: I<3you!").matches());
        }
    }

    @Nested
    @DisplayName("Name year and two alpha-numeric chars")
    class NameYear {

        @Test
        @DisplayName("should return true for Scott1975ii")
        void nameYear_scott() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.NAME_YEAR_PATTERN.matcher("Scott1975ii").matches());
        }

        @Test
        @DisplayName("should return true for Steve1988p3")
        void nameYear_steve() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.NAME_YEAR_PATTERN.matcher("Steve1988p3").matches());
        }

        @Test
        @DisplayName("should return true for Simon200044")
        void nameYear_simon() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.NAME_YEAR_PATTERN.matcher("Simon200044").matches());
        }

        @Test
        @DisplayName("should return false for Danny1980tt")
        void nameYear_danny() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.NAME_YEAR_PATTERN.matcher("Danny1980tt").matches());
        }

        @Test
        @DisplayName("should return false for St3ven1995m")
        void nameYear_st3ven() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.NAME_YEAR_PATTERN.matcher("St3ven1995m").matches());
        }

        @Test
        @DisplayName("should return false for Simon2000..")
        void nameYear_simon2000() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.NAME_YEAR_PATTERN.matcher("Simon2000..").matches());
        }
    }

    @Nested
    @DisplayName("Three chars and dot")
    class ThreeCharsDot {

        private String textToTest = "In all the land, no one was better with a bow and arrow than Robin Hood. " +
                "He lived with his band of Merry Men in Sherwood Forest. " +
                "That was the woods where the King kept his royal deer.";

        @Test
        @DisplayName("should find 4 matches for text with 4 correct equations")
        void three_chars_count_3() {
            fail();
            Matcher m = AnyAlphaAnyNonalpha.THREE_CHARS_DOT_PATTERN.matcher(textToTest);
            int count = 0;
            while (m.find()) count++;
            assertEquals(3, count);
        }

        @Test
        @DisplayName("should return false for mix")
        void three_chars_mix() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.THREE_CHARS_DOT_PATTERN.matcher("mix").matches());
        }

        @Test
        @DisplayName("should return false for 195")
        void three_chars_195() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.THREE_CHARS_DOT_PATTERN.matcher("195").matches());
        }

        @Test
        @DisplayName("should return false for 4a.")
        void three_chars_4a() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.THREE_CHARS_DOT_PATTERN.matcher("4a.").matches());
        }
    }

    @Nested
    @DisplayName("2 letters 2 digits 2 alpha 2 non-alpha")
    class LettersDigitsAlpha {

        @Test
        @DisplayName("should return true for WW33aa++")
        void lettersDigits_WW33aa() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.LETTERS_DIGITS_ALPHA_NONALPHA.matcher("WW33aa++").matches());
        }

        @Test
        @DisplayName("should return true for sa5611@.")
        void lettersDigits_sa5611() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.LETTERS_DIGITS_ALPHA_NONALPHA.matcher("sa5611@.").matches());
        }

        @Test
        @DisplayName("should return true for Nm003r!\\")
        void lettersDigits_Nm003r() {
            fail();
            assertTrue(AnyAlphaAnyNonalpha.LETTERS_DIGITS_ALPHA_NONALPHA.matcher("Nm003r!\\").matches());
        }

        @Test
        @DisplayName("should return false for 2233aa++")
        void lettersDigits_2233aa() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.LETTERS_DIGITS_ALPHA_NONALPHA.matcher("2233aa++").matches());
        }

        @Test
        @DisplayName("should return false for NN99pp88")
        void lettersDigits_NN99pp88() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.LETTERS_DIGITS_ALPHA_NONALPHA.matcher("NN99pp88").matches());
        }

        @Test
        @DisplayName("should return false for sasa11;;")
        void lettersDigits_sasa11() {
            fail();
            assertFalse(AnyAlphaAnyNonalpha.LETTERS_DIGITS_ALPHA_NONALPHA.matcher("sasa11;;").matches());
        }
    }

}
