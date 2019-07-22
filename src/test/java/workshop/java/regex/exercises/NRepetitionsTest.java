package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.NRepetitions;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("N repetitions test")
public class NRepetitionsTest {

    private NRepetitions nreps = new NRepetitions();

    @Nested
    @DisplayName("14 digits")
    class Digits14 {

        @Test
        @DisplayName("should return true for 11223344556677")
        void digits14_11223344556677() {
            fail();
            assertTrue(NRepetitions.DIGITS_14_PATTERN.matcher("11223344556677").matches());
        }

        @Test
        @DisplayName("should return true for 12345678901234")
        void digits14_12345678901234() {
            fail();
            assertTrue(NRepetitions.DIGITS_14_PATTERN.matcher("12345678901234").matches());
        }

        @Test
        @DisplayName("should return true for 00000033111111")
        void digits14_00000033111111() {
            fail();
            assertTrue(NRepetitions.DIGITS_14_PATTERN.matcher("00000033111111").matches());
        }

        @Test
        @DisplayName("should return false for 1122334455667")
        void digits14_1122334455667() {
            fail();
            assertFalse(NRepetitions.DIGITS_14_PATTERN.matcher("1122334455667").matches());
        }

        @Test
        @DisplayName("should return false for A1111111111111")
        void digits14_A1111111111111() {
            fail();
            assertFalse(NRepetitions.DIGITS_14_PATTERN.matcher("A1111111111111").matches());
        }

        @Test
        @DisplayName("should return false for 111222333444555")
        void digits14_111222333444555() {
            fail();
            assertFalse(NRepetitions.DIGITS_14_PATTERN.matcher("111222333444555").matches());
        }
    }

    @Nested
    @DisplayName("L times 4 to 7")
    class LTimes4to7 {

        @Test
        @DisplayName("should return true for heLLLLLLo")
        void lTimes4to7_heLLLLLLo() {
            fail();
            assertTrue(NRepetitions.L_TIMES_4_TO_7_PATTERN.matcher("heLLLLLLo").matches());
        }

        @Test
        @DisplayName("should return true for JEllllY")
        void lTimes4to7_JEllllY() {
            fail();
            assertTrue(NRepetitions.L_TIMES_4_TO_7_PATTERN.matcher("JEllllY").matches());
        }

        @Test
        @DisplayName("should return true for hiLLLLLLLs")
        void lTimes4to7_hiLLLLLLLs() {
            fail();
            assertTrue(NRepetitions.L_TIMES_4_TO_7_PATTERN.matcher("hiLLLLLLLs").matches());
        }

        @Test
        @DisplayName("should return false for heLLLLLLo")
        void lTimes4to7_heLLLo() {
            fail();
            assertFalse(NRepetitions.L_TIMES_4_TO_7_PATTERN.matcher("heLLLo").matches());
        }

        @Test
        @DisplayName("should return false for 4ellls")
        void lTimes4to7_4ellls() {
            fail();
            assertFalse(NRepetitions.L_TIMES_4_TO_7_PATTERN.matcher("4ellls").matches());
        }

        @Test
        @DisplayName("should return false for SIllllllllY")
        void lTimes4to7_SIllllllllY() {
            fail();
            assertFalse(NRepetitions.L_TIMES_4_TO_7_PATTERN.matcher("SIllllllllY").matches());
        }
    }


    @Nested
    @DisplayName("Count words longer than 4")
    class CountWordsLongerThan4 {

        private String text1 = "Elon Musk is a technology entrepreneur, investor, and engineer.";
        private String text2 = "In May 2002, Musk founded SpaceX.";
        private String text3 = "He helped fund Tesla, an electric vehicle and solar panel manufacturer.";

        @Test
        @DisplayName("should return 6 for \"Elon Musk is a technology entrepreneur, investor, and engineer.\"")
        void countWordsLongerThan4_6() {
            fail();
            assertEquals(6, nreps.countWordsLongerThan4(text1));
        }

        @Test
        @DisplayName("should return 3 for \"In May 2002, Musk founded SpaceX.\"")
        void countWordsLongerThan4_3() {
            fail();
            assertEquals(3, nreps.countWordsLongerThan4(text2));
        }

        @Test
        @DisplayName("should return 8 for \"He helped fund Tesla, an electric vehicle and solar panel manufacturer.\"")
        void countWordsLongerThan4_8() {
            fail();
            assertEquals(8, nreps.countWordsLongerThan4(text3));
        }
    }

    @Nested
    @DisplayName("Country code and phone number")
    class CountryCodeAndPhoneNumber {

        private String text1 = String.format("Depending on your location, please contact us using any of the numbers: %n" +
                "+48 888666333, +1 1231231231, +355 77223344. %n" +
                "The numbers listed below will no longer be active after 01-01-2020: %n" +
                "+ 1234123412, +1111 99900011, +3499988877");

        @Test
        @DisplayName("should find 3 matches for text with 3 correct phone numbers")
        void countryCodeAndPhoneNumber_count_3() {
            fail();
            Matcher m = NRepetitions.COUNTRY_CODE_NUMBER_PATTERN.matcher(text1);
            int count = 0;
            while (m.find()) count++;
            assertEquals(3, count);
        }

        @Test
        @DisplayName("should return true for +48 888666333")
        void countryCodeAndPhoneNumber_48888666333() {
            fail();
            assertTrue(NRepetitions.COUNTRY_CODE_NUMBER_PATTERN.matcher("+48 888666333").matches());
        }

        @Test
        @DisplayName("should return false for +1111 99900011")
        void countryCodeAndPhoneNumber_111199900011() {
            fail();
            assertFalse(NRepetitions.COUNTRY_CODE_NUMBER_PATTERN.matcher("+1111 99900011").matches());
        }
    }

    @Nested
    @DisplayName("Email address")
    class EmailAddress {

        private String text1 = String.format("These are the lucky winners of today's social media challenge: %n" +
                "princess@yahoo.com, elf@o2.pl, yolo123@hotmail.com");

        private String text2 = String.format("Please enter a valid email. Addresses you have tried: %n" +
                "#self!e@gmail.com, ogre@icloud,com");

        @Test
        @DisplayName("should find 3 matches for text with 3 correct email addresses")
        void emailAddress_count_3() {
            fail();
            Matcher m = NRepetitions.EMAIL_ADDRESS_PATTERN.matcher(text1);
            int count = 0;
            while (m.find()) count++;
            assertEquals(3, count);
        }

        @Test
        @DisplayName("should find 0 matches for text with 0 correct email addresses")
        void emailAddress_count_0() {
            fail();
            Matcher m = NRepetitions.EMAIL_ADDRESS_PATTERN.matcher(text2);
            int count = 0;
            while (m.find()) count++;
            assertEquals(0, count);
        }

        @Test
        @DisplayName("should return true for yoda77@hotmail.com")
        void emailAddress_yoda() {
            fail();
            assertTrue(NRepetitions.EMAIL_ADDRESS_PATTERN.matcher("yoda77@hotmail.com").matches());
        }

        @Test
        @DisplayName("should return true for cat@o2.pl")
        void emailAddress_cat() {
            fail();
            assertTrue(NRepetitions.EMAIL_ADDRESS_PATTERN.matcher("cat@o2.pl").matches());
        }

        @Test
        @DisplayName("should return true for hobbit@icloud,com")
        void emailAddress_hobbit() {
            fail();
            assertFalse(NRepetitions.EMAIL_ADDRESS_PATTERN.matcher("hobbit@icloud,com").matches());
        }
    }

}
