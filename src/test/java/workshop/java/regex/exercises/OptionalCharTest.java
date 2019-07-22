package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.OptionalChar;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Optional character test")
public class OptionalCharTest {

    OptionalChar p = new OptionalChar();

    @Nested
    @DisplayName("Item cost")
    class ItemCost {

        @Test
        @DisplayName("should return true for The item costs 1 dollar.")
        void itemCost_costs1() {
            fail();
            assertTrue(OptionalChar.ITEM_COST_PATTERN.matcher("The item costs 1 dollar.").matches());
        }

        @Test
        @DisplayName("should return true for The items cost 1 dollar.")
        void itemCost_cost1() {
            fail();
            assertTrue(OptionalChar.ITEM_COST_PATTERN.matcher("The items cost 1 dollar.").matches());
        }

        @Test
        @DisplayName("should return true for The items cost 75000 dollars.")
        void itemCost_cost75000() {
            fail();
            assertTrue(OptionalChar.ITEM_COST_PATTERN.matcher("The items cost 75000 dollars.").matches());
        }

        @Test
        @DisplayName("should return false for The itemm cost 3 dollars.")
        void itemCost_itemm() {
            fail();
            assertFalse(OptionalChar.ITEM_COST_PATTERN.matcher("The itemm cost 3 dollars.").matches());
        }

        @Test
        @DisplayName("should return false for The items cost 5 dollars?")
        void itemCost_cost5() {
            fail();
            assertFalse(OptionalChar.ITEM_COST_PATTERN.matcher("The items cost 5 dollars?").matches());
        }

        @Test
        @DisplayName("should return false for The item costs XX dollars.")
        void itemCost_XX() {
            fail();
            assertFalse(OptionalChar.ITEM_COST_PATTERN.matcher("The item costs XX dollars.").matches());
        }
    }

    @Nested
    @DisplayName("British and American spelling")
    class BritishAmericanSpelling {

        private String text1 = String.format("My favorite flavor of yogurt is blueberry. %n" +
                "It's easy to recognize because of its purple color. %n" +
                "My brother's favourite yoghurt flavour is raspberry. %n" +
                "You can recognise it by the presence of little seeds. %n" +
                "My sister likes all the flavours. She recognizes no difference." +
                "Do you have any favorite flavors?");

        @Test
        @DisplayName("should return 7 for text with 7 matches")
        void countUKandUSspelling_7() {
            fail();
            assertEquals(7, p.countUKandUSspelling(text1));
        }

        @Test
        @DisplayName("should return true for flavour")
        void britishAmerican_flavour() {
            fail();
            assertTrue(OptionalChar.UK_US_SPELLING_PATTERN.matcher("flavour").matches());
        }

        @Test
        @DisplayName("should return true for recognises")
        void britishAmerican_recognises() {
            fail();
            assertTrue(OptionalChar.UK_US_SPELLING_PATTERN.matcher("recognises").matches());
        }

        @DisplayName("should return false for recognising")
        void britishAmerican_recognising() {
            fail();
            assertFalse(OptionalChar.UK_US_SPELLING_PATTERN.matcher("recognising").matches());
        }
    }

    @Nested
    @DisplayName("Dog and hog to upper case")
    class DogHogUpperCase {

        private String input1 = "Look! Our dogs are chasing away a hog across the logs.";
        private String output1 = "Look! Our DOGS are chasing away a HOG across the logs.";
        private String input2 = String.format("Hog dog rodeo or hog dogging, is a spectator event %n" +
                "that simulates wild or feral hog hunting with dogs. Hog dogs do not eat hot dogs.");
        private String output2 = String.format("HOG DOG rodeo or HOG dogging, is a spectator event %n" +
                "that simulates wild or feral HOG hunting with DOGS. HOG DOGS do not eat hot DOGS.");


        @Test
        @DisplayName("should return true for matching text with upper case")
        void dogHogToUpperCase_compare_1() {
            fail();
            assertEquals(output1, p.dogHogToUpperCase(input1));
        }

        @Test
        @DisplayName("should return true for matching text with upper case")
        void dogHogToUpperCase_compare_2() {
            fail();
            assertEquals(output2, p.dogHogToUpperCase(input2));
        }
    }

    @Nested
    @DisplayName("Replace web address")
    class ReplaceWebAddress {

        private String input1 = "Read about my adventures on my blog: https://mytravel.com";
        private String output1 = "Read about my adventures on my blog: CLICK HERE";
        private String input2 = String.format("The most viewed news articles this week are: %n" +
                "http://news.com/article223 %n" +
                "https://fakenews.com/international/president %n" +
                "https://wiadomosci.pl/nagrodyrozdane");
        private String output2 = String.format("The most viewed news articles this week are: %n" +
                "CLICK HERE %n" +
                "CLICK HERE %n" +
                "https://wiadomosci.pl/nagrodyrozdane");

        @Test
        @DisplayName("should return true for matching text with replaced address")
        void replaceWebAddress_test1() {
            fail();
            assertEquals(output1, p.replaceWebAddress(input1));
        }

        @Test
        @DisplayName("should return true for matching text with replaced address")
        void replaceWebAddress_test2() {
            fail();
            assertEquals(output2, p.replaceWebAddress(input2));
        }

        @Test
        @DisplayName("should return true for http://www.mywebsite.com")
        void replaceWebAddress_mywebsite() {
            fail();
            assertTrue(OptionalChar.WEBSITE_PATTERN.matcher("http://www.mywebsite.com").matches());
        }

        @Test
        @DisplayName("should return true for https://index.com")
        void replaceWebAddress_index() {
            fail();
            assertTrue(OptionalChar.WEBSITE_PATTERN.matcher("https://index.com").matches());
        }

        @Test
        @DisplayName("should return true for https://www.pictures.com/page1")
        void replaceWebAddress_pictures() {
            fail();
            assertTrue(OptionalChar.WEBSITE_PATTERN.matcher("https://www.pictures.com/page1").matches());
        }

        @Test
        @DisplayName("should return true for http://news.com/article/details")
        void replaceWebAddress_article() {
            fail();
            assertTrue(OptionalChar.WEBSITE_PATTERN.matcher("http://news.com/article/details").matches());
        }

        @Test
        @DisplayName("should return false for www.web.com")
        void replaceWebAddress_web() {
            fail();
            assertFalse(OptionalChar.WEBSITE_PATTERN.matcher("www.web.com").matches());
        }

        @Test
        @DisplayName("should return false for https:/website.com")
        void replaceWebAddress_website() {
            fail();
            assertFalse(OptionalChar.WEBSITE_PATTERN.matcher("whttps:/website.com").matches());
        }

        @Test
        @DisplayName("should return false for http://pages.pl")
        void replaceWebAddress_pages() {
            fail();
            assertFalse(OptionalChar.WEBSITE_PATTERN.matcher("http://pages.pl").matches());
        }

        @Test
        @DisplayName("should return false for https://www.entertainment/radio.com")
        void replaceWebAddress_radio() {
            fail();
            assertFalse(OptionalChar.WEBSITE_PATTERN.matcher("https://www.entertainment/radio.com").matches());
        }

    }

    @Nested
    @DisplayName("Book look")
    class BookLook {

        @Test
        @DisplayName("should return true for bOOk")
        void bookLook_bOOk() {
            fail();
            assertTrue(OptionalChar.BOOK_LOOK_PATTERN.matcher("bOOk").matches());
        }

        @Test
        @DisplayName("should return true for BOOKING")
        void bookLook_BOOKING() {
            fail();
            assertTrue(OptionalChar.BOOK_LOOK_PATTERN.matcher("BOOKING").matches());
        }

        @Test
        @DisplayName("should return true for lOok")
        void bookLook_lOok() {
            fail();
            assertTrue(OptionalChar.BOOK_LOOK_PATTERN.matcher("lOok").matches());
        }

        @Test
        @DisplayName("should return true for looKing")
        void bookLook_looKing() {
            fail();
            assertTrue(OptionalChar.BOOK_LOOK_PATTERN.matcher("looKing").matches());
        }

        @Test
        @DisplayName("should return false for cooking")
        void bookLook_cooking() {
            fail();
            assertFalse(OptionalChar.BOOK_LOOK_PATTERN.matcher("cooking").matches());
        }

        @Test
        @DisplayName("should return false for kookin")
        void bookLook_kookin() {
            fail();
            assertFalse(OptionalChar.BOOK_LOOK_PATTERN.matcher("kookin").matches());
        }

        @Test
        @DisplayName("should return false for ROOK")
        void bookLook_ROOK() {
            fail();
            assertFalse(OptionalChar.BOOK_LOOK_PATTERN.matcher("ROOK").matches());
        }
    }

}
