package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.OnlyABCNotABC;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Only a b or c, not a b or c test")
public class OnlyABCNotABCTest {


    @Nested
    @DisplayName("answer ABC")
    class Answer {

        @Test
        @DisplayName("should return true for Answer: A")
        void answer_A() {
            fail();
            assertTrue(OnlyABCNotABC.ANSWER_PATTERN.matcher("Answer: A").matches());
        }

        @Test
        @DisplayName("should return true for Answer: B")
        void answer_B() {
            fail();
            assertTrue(OnlyABCNotABC.ANSWER_PATTERN.matcher("Answer: B").matches());
        }

        @Test
        @DisplayName("should return true for Answer: C")
        void answer_C() {
            fail();
            assertTrue(OnlyABCNotABC.ANSWER_PATTERN.matcher("Answer: C").matches());
        }

        @Test
        @DisplayName("should return false for Answer: D")
        void answer_D() {
            fail();
            assertFalse(OnlyABCNotABC.ANSWER_PATTERN.matcher("Answer: D").matches());
        }

        @Test
        @DisplayName("should return false for Ans: C")
        void ans_C() {
            fail();
            assertFalse(OnlyABCNotABC.ANSWER_PATTERN.matcher("Ans: C").matches());
        }

        @Test
        @DisplayName("should return false for Answer: a")
        void answer_a() {
            fail();
            assertFalse(OnlyABCNotABC.ANSWER_PATTERN.matcher("Answer: a").matches());
        }
    }


    @Nested
    @DisplayName("most cost lost")
    class Ost {

        private String textToTest = String.format("Words that rhyme with most are host, post, coast, toast.%n" +
                "Words that rhyme with cost are lost, dost.");

        @Test
        @DisplayName("should find 3 matches for \"Words that rhyme with most are host, post, coast, toast. " +
                "Words that rhyme with cost are lost, dost.\"")
        void digit_dot() {
            fail();
            Matcher m = OnlyABCNotABC.OST_PATTERN.matcher(textToTest);
            int count = 0;
            while (m.find()) count++;
            assertEquals(3, count);
        }
    }


    @Nested
    @DisplayName("My favorite odd number is: ")
    class OddNumber {

        @Test
        @DisplayName("should return true for My favorite odd number is: 3.")
        void oddNumber_3() {
            fail();
            assertTrue(OnlyABCNotABC.ODD_NUMBER_PATTERN.matcher("My favorite odd number is: 3.").matches());
        }

        @Test
        @DisplayName("should return true for My favorite odd number is: 5.")
        void oddNumber_5() {
            fail();
            assertTrue(OnlyABCNotABC.ODD_NUMBER_PATTERN.matcher("My favorite odd number is: 5.").matches());
        }

        @Test
        @DisplayName("should return true for My favorite odd number is: 7.")
        void oddNumber_7() {
            fail();
            assertTrue(OnlyABCNotABC.ODD_NUMBER_PATTERN.matcher("My favorite odd number is: 7.").matches());
        }

        @Test
        @DisplayName("should return false for My favorite number is: 3.")
        void oddNumber_3_false() {
            fail();
            assertFalse(OnlyABCNotABC.ODD_NUMBER_PATTERN.matcher("My favorite number is: 3.").matches());
        }

        @Test
        @DisplayName("should return false for My favorite odd number is: 2.")
        void oddNumber_2() {
            fail();
            assertFalse(OnlyABCNotABC.ODD_NUMBER_PATTERN.matcher("My favorite odd number is: 2.").matches());
        }

        @Test
        @DisplayName("should return false for My favorite odd number is: 4.")
        void oddNumber_4() {
            fail();
            assertFalse(OnlyABCNotABC.ODD_NUMBER_PATTERN.matcher("My favorite odd number is: 4.").matches());
        }

        @Test
        @DisplayName("should return false for My favorite odd number is: 6.")
        void oddNumber_6() {
            fail();
            assertFalse(OnlyABCNotABC.ODD_NUMBER_PATTERN.matcher("My favorite odd number is: 6.").matches());
        }

        @Test
        @DisplayName("should return false for My favorite odd number is 8.")
        void oddNumber_8() {
            fail();
            assertFalse(OnlyABCNotABC.ODD_NUMBER_PATTERN.matcher("My favorite odd number is 8.").matches());
        }
    }


    @Nested
    @DisplayName("not zig and jig")
    class NotJigZig {

        private String textToTest = "A big pig in a wig will zig, zag and jig until it digs out a tasty fig.";

        @Test
        @DisplayName("should find 5 matches for \"A big pig in a wig will zig, zag and jig until it digs out a tasty fig.\"")
        void digit_dot() {
            fail();
            Matcher m = OnlyABCNotABC.IG_PATTERN.matcher(textToTest);
            int count = 0;
            while (m.find()) count++;
            assertEquals(5, count);
        }
    }

    @Nested
    @DisplayName("password")
    class Password {

        @Test
        @DisplayName("should return true for pass1A")
        void password_pass1A() {
            fail();
            assertTrue(OnlyABCNotABC.PASSWORD_PATTERN.matcher("pass1A").matches());
        }

        @Test
        @DisplayName("should return true for Word4e")
        void password_Word4e() {
            fail();
            assertTrue(OnlyABCNotABC.PASSWORD_PATTERN.matcher("Word4e").matches());
        }

        @Test
        @DisplayName("should return true for pass12")
        void password_pass12() {
            fail();
            assertTrue(OnlyABCNotABC.PASSWORD_PATTERN.matcher("pass12").matches());
        }

        @Test
        @DisplayName("should return false for 11111R")
        void password_11111R() {
            fail();
            assertFalse(OnlyABCNotABC.PASSWORD_PATTERN.matcher("11111R").matches());
        }

        @Test
        @DisplayName("should return false for pass1.")
        void password_pass1() {
            fail();
            assertFalse(OnlyABCNotABC.PASSWORD_PATTERN.matcher("pass1.").matches());
        }

        @Test
        @DisplayName("should return false for passs!")
        void password_passs() {
            fail();
            assertFalse(OnlyABCNotABC.PASSWORD_PATTERN.matcher("passs!").matches());
        }
    }



}
