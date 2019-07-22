package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.MatchesAbcOrDef;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Matches abc or def test")
public class MatchesAbcOrDefTest {

    MatchesAbcOrDef p = new MatchesAbcOrDef();

    @Nested
    @DisplayName("The this that")
    class TheThisThat {

        private String input = "I believe that this nation should commit itself to achieving the goal, " +
                "before this decade is out, of landing a man on the Moon and returning him safely to the Earth.";

        @Test
        @DisplayName("should return 25 for text with 25 words")
        void theThisThat_25() {
            fail();
            assertEquals(25, p.countNonThe(input));
        }

        @Test
        @DisplayName("should return true for the")
        void theThisThat_the() {
            fail();
            assertTrue(MatchesAbcOrDef.THE_PATTERN.matcher("the").find());
        }

        @Test
        @DisplayName("should return true for this")
        void theThisThat_this() {
            fail();
            assertTrue(MatchesAbcOrDef.THE_PATTERN.matcher("this").find());
        }

        @Test
        @DisplayName("should return true for that")
        void theThisThat_that() {
            fail();
            assertTrue(MatchesAbcOrDef.THE_PATTERN.matcher("that").find());
        }

        @Test
        @DisplayName("should return false for hat")
        void theThisThat_hat() {
            fail();
            assertFalse(MatchesAbcOrDef.THE_PATTERN.matcher("hat").find());
        }

        @Test
        @DisplayName("should return false for there")
        void theThisThat_there() {
            fail();
            assertFalse(MatchesAbcOrDef.THE_PATTERN.matcher("there").find());
        }

        @Test
        @DisplayName("should return false for those")
        void theThisThat_those() {
            fail();
            assertFalse(MatchesAbcOrDef.THE_PATTERN.matcher("those").find());
        }

        @Test
        @DisplayName("should return false for thus")
        void theThisThat_thus() {
            fail();
            assertFalse(MatchesAbcOrDef.THE_PATTERN.matcher("thus").find());
        }
    }

    @Nested
    @DisplayName("File extension")
    class Extension {

        @Test
        @DisplayName("should return true for .pdf")
        void extension_pdf() {
            fail();
            assertTrue(MatchesAbcOrDef.EXTENSION_PATTERN.matcher(".pdf").find());
        }

        @Test
        @DisplayName("should return true for .docx")
        void extension_docx() {
            fail();
            assertTrue(MatchesAbcOrDef.EXTENSION_PATTERN.matcher(".docx").find());
        }

        @Test
        @DisplayName("should return true for .jpg")
        void extension_jpg() {
            fail();
            assertTrue(MatchesAbcOrDef.EXTENSION_PATTERN.matcher(".jpg").find());
        }

        @Test
        @DisplayName("should return false for .docs")
        void extension_docs() {
            fail();
            assertFalse(MatchesAbcOrDef.EXTENSION_PATTERN.matcher(".docs").find());
        }

        @Test
        @DisplayName("should return false for .text")
        void extension_txt() {
            fail();
            assertFalse(MatchesAbcOrDef.EXTENSION_PATTERN.matcher(".txt").find());
        }

    }

    @Nested
    @DisplayName("Phone or email")
    class PhoneOrEmail {

        @Test
        @DisplayName("should return true for 888666777")
        void phoneOrEmail_888666777() {
            fail();
            assertTrue(MatchesAbcOrDef.PHONE_OR_EMAIL_PATTERN.matcher("888666777").find());
        }

        @Test
        @DisplayName("should return true for tiger@web.com")
        void phoneOrEmail_tiger() {
            fail();
            assertTrue(MatchesAbcOrDef.PHONE_OR_EMAIL_PATTERN.matcher("tiger@web.com").find());
        }

        @Test
        @DisplayName("should return true for roar1@interia.pl")
        void phoneOrEmail_roar() {
            fail();
            assertTrue(MatchesAbcOrDef.PHONE_OR_EMAIL_PATTERN.matcher("roar1@interia.pl").find());
        }

        @Test
        @DisplayName("should return false for 11122233")
        void phoneOrEmail_11122233() {
            fail();
            assertFalse(MatchesAbcOrDef.PHONE_OR_EMAIL_PATTERN.matcher("11122233").find());
        }

        @Test
        @DisplayName("should return false for fake@emailcom")
        void phoneOrEmail_fakeemailcom() {
            fail();
            assertFalse(MatchesAbcOrDef.PHONE_OR_EMAIL_PATTERN.matcher("fake@emailcom").find());
        }
    }

    @Nested
    @DisplayName("Movie or film title")
    class MovieOrFilm {

        @Test
        @DisplayName("should return true for film \"Lion King\"")
        void movieOrFilm_lion_king() {
            fail();
            assertTrue(MatchesAbcOrDef.MOVIE_FILM_PATTERN.matcher("film \"Lion King\"").find());
        }

        @Test
        @DisplayName("should return true for The movie \"Spiderman\" just came out")
        void movieOrFilm_spiderman() {
            fail();
            assertTrue(MatchesAbcOrDef.MOVIE_FILM_PATTERN.matcher("The movie \"Spiderman\" just came out").find());
        }

        @Test
        @DisplayName("should return true for film Have you seen the film \"Avengers\"?")
        void movieOrFilm_avengers() {
            fail();
            assertTrue(MatchesAbcOrDef.MOVIE_FILM_PATTERN.matcher("Have you seen the film \"Avengers\"?").find());
        }

        @Test
        @DisplayName("should return false for book \"Tarzan\"")
        void movieOrFilm_tarzan() {
            fail();
            assertFalse(MatchesAbcOrDef.MOVIE_FILM_PATTERN.matcher("book \"Tarzan\"").find());
        }

        @Test
        @DisplayName("should return false for I'm going to see the \"Batman\" movie")
        void movieOrFilm_batman() {
            fail();
            assertFalse(MatchesAbcOrDef.MOVIE_FILM_PATTERN.matcher("I'm going to see the \"Batman\" movie").find());
        }

    }

    @Nested
    @DisplayName("Saturday or Sunday")
    class SaturdayOrSunday {

        private String input = "I'm going rock climbing this Saturday and kayaking next Sunday. " +
                "I have Friday available though.";
        private String output = "I'm going rock climbing this weekend and kayaking next weekend. " +
                "I have Friday available though.";

        @Test
        @DisplayName("should return weekend for Saturday and Sunday")
        void replaceSaturdayAndSunday_test() {
            fail();
            assertEquals(output, p.replaceSaturdayAndSunday(input));
        }

        @Test
        @DisplayName("should return true for Saturday")
        void saturdayOrSunday_saturday() {
            fail();
            assertTrue(MatchesAbcOrDef.SATURDAY_SUNDAY_PATTERN.matcher("Saturday").find());
        }

        @Test
        @DisplayName("should return true for SUNDAY")
        void saturdayOrSunday_sunday() {
            fail();
            assertTrue(MatchesAbcOrDef.SATURDAY_SUNDAY_PATTERN.matcher("SUNDAY").find());
        }
        @Test
        @DisplayName("should return false for friday")
        void saturdayOrSunday_friday() {
            fail();
            assertFalse(MatchesAbcOrDef.SATURDAY_SUNDAY_PATTERN.matcher("friday").find());
        }

    }
}
