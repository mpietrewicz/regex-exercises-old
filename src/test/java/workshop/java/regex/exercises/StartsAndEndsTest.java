package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.StartsAndEnds;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Starts and ends test")
public class StartsAndEndsTest {

    @Nested
    @DisplayName("Words at least 3 letters long that end with S")
    class EndWithS {

        @Test
        @DisplayName("should return true for Funny video about cows")
        void endsWithS_cows() {
            fail();
            assertTrue(StartsAndEnds.END_WITH_S_PATTERN.matcher("Funny video about cows").find());
        }

        @Test
        @DisplayName("should return true for Let's visit some parks")
        void endsWithS_parks() {
            fail();
            assertTrue(StartsAndEnds.END_WITH_S_PATTERN.matcher("Let's visit some parks").find());
        }

        @Test
        @DisplayName("should return true for Life hacks")
        void endsWithS_hacks() {
            fail();
            assertTrue(StartsAndEnds.END_WITH_S_PATTERN.matcher("Life hacks").find());
        }

        @Test
        @DisplayName("should return false for kindness")
        void endsWithS_kindness() {
            fail();
            assertFalse(StartsAndEnds.END_WITH_S_PATTERN.matcher("kindness").find());
        }

        @Test
        @DisplayName("should return false for Fun facts?")
        void endsWithS_this_is() {
            fail();
            assertFalse(StartsAndEnds.END_WITH_S_PATTERN.matcher("I know what this is").find());
        }

        @Test
        @DisplayName("should return false for is")
        void endsWithS_is() {
            fail();
            assertFalse(StartsAndEnds.END_WITH_S_PATTERN.matcher("is").find());
        }
    }

    @Nested
    @DisplayName("Find IP address that starts and ends with 1")
    class IPAddress {

        @Test
        @DisplayName("should return true for 168.19.122.91")
        void ipAddress_168() {
            fail();
            assertTrue(StartsAndEnds.IP_PATTERN.matcher("168.19.122.91  |  London    |  UK").find());
        }

        @Test
        @DisplayName("should return true for 102.12.40.131")
        void ipAddress_102() {
            fail();
            assertTrue(StartsAndEnds.IP_PATTERN.matcher("102.12.40.131  |  New Delhi |  India").find());
        }

        @Test
        @DisplayName("should return true for 121.197.49.71")
        void ipAddress_121() {
            fail();
            assertTrue(StartsAndEnds.IP_PATTERN.matcher("121.197.49.71  |  Sydney    |  Australia").find());
        }

        @Test
        @DisplayName("should return false for 216.10.187.221")
        void ipAddress_216() {
            fail();
            assertFalse(StartsAndEnds.IP_PATTERN.matcher("216.10.187.221 |  Beijing   |  China").find());
        }

        @Test
        @DisplayName("should return false for Chicago   |  124.31.20.421  |  USA")
        void ipAddress_Chicago() {
            fail();
            assertFalse(StartsAndEnds.IP_PATTERN.matcher("Chicago   |  124.31.20.421  |  USA").find());
        }

        @Test
        @DisplayName("should return false for 1021240131")
        void ipAddress_10212() {
            fail();
            assertFalse(StartsAndEnds.IP_PATTERN.matcher("1021240131  | Buenos Aires  |  Argentina").find());
        }

        @Test
        @DisplayName("should return false for 102.12.24.0131")
        void ipAddress_0131() {
            fail();
            assertFalse(StartsAndEnds.IP_PATTERN.matcher("102.12.24.0131 |  Managua   |  Nicaragua").find());
        }
    }

    @Nested
    @DisplayName("Metal")
    class Metal {

        @Test
        @DisplayName("should return true for metal")
        void metal_metal() {
            fail();
            assertTrue(StartsAndEnds.METAL_PATTERN.matcher("metal").find());
        }

        @Test
        @DisplayName("should return true for metals")
        void metal_metals() {
            fail();
            assertTrue(StartsAndEnds.METAL_PATTERN.matcher("metals").find());
        }

        @Test
        @DisplayName("should return true for Metal")
        void metal_Metal() {
            fail();
            assertTrue(StartsAndEnds.METAL_PATTERN.matcher("Metal").find());
        }

        @Test
        @DisplayName("should return true for Metals")
        void metal_Metals() {
            fail();
            assertTrue(StartsAndEnds.METAL_PATTERN.matcher("Metals").find());
        }

        @Test
        @DisplayName("should return false for heavy metal")
        void metal_heavy_metal() {
            fail();
            assertFalse(StartsAndEnds.METAL_PATTERN.matcher("heavy metal").find());
        }

        @Test
        @DisplayName("should return false for metallic")
        void metal_metallic() {
            fail();
            assertFalse(StartsAndEnds.METAL_PATTERN.matcher("metallic").find());
        }

        @Test
        @DisplayName("should return false for metal tool")
        void metal_metal_tool() {
            fail();
            assertFalse(StartsAndEnds.METAL_PATTERN.matcher("metal tool").find());
        }

        @Test
        @DisplayName("should return false for nonmetal")
        void metal_nonmetal() {
            fail();
            assertFalse(StartsAndEnds.METAL_PATTERN.matcher("nonmetal").find());
        }
    }

    @Nested
    @DisplayName("Bold pattern")
    class Bold {

        @Test
        @DisplayName("should return true for <b>This text is bold.</b>")
        void bold_this_text() {
            fail();
            assertTrue(StartsAndEnds.BOLD_PATTERN.matcher("<b>This text is bold.</b>").find());
        }

        @Test
        @DisplayName("should return true for <b>PHOTO</b>")
        void bold_PHOTO() {
            fail();
            assertTrue(StartsAndEnds.BOLD_PATTERN.matcher("<b>PHOTO</b>").find());
        }

        @Test
        @DisplayName("should return true for <b> HTML is 26 years old.   </b>")
        void bold_html() {
            fail();
            assertTrue(StartsAndEnds.BOLD_PATTERN.matcher("<b> HTML is 26 years old.   </b>").find());
        }

        @Test
        @DisplayName("should return false for This movie is <b>THE BOMB</b>!")
        void bold_this_movie() {
            fail();
            assertFalse(StartsAndEnds.BOLD_PATTERN.matcher("This movie is <b>THE BOMB</b>!").find());
        }

        @Test
        @DisplayName("should return false for This movie is Like!</b>")
        void bold_like() {
            fail();
            assertFalse(StartsAndEnds.BOLD_PATTERN.matcher("Like!</b>").find());
        }

        @Test
        @DisplayName("should return false for <b>Click to view the gallery.!")
        void bold_click_here() {
            fail();
            assertFalse(StartsAndEnds.BOLD_PATTERN.matcher("<b>Click to view the gallery.").find());
        }
    }

    @Nested
    @DisplayName("Bird pattern")
    class Bird {

        @Test
        @DisplayName("should return true for Check out that hummingbird")
        void bird_hummingbird() {
            fail();
            assertTrue(StartsAndEnds.BIRD_PATTERN.matcher("Check out that hummingbird").find());
        }

        @Test
        @DisplayName("should return true for kingbirds")
        void bird_kingbirds() {
            fail();
            assertTrue(StartsAndEnds.BIRD_PATTERN.matcher("kingbirds").find());
        }

        @Test
        @DisplayName("should return true for tiny sugarbird")
        void bird_sugarbird() {
            fail();
            assertTrue(StartsAndEnds.BIRD_PATTERN.matcher("tiny sugarbird").find());
        }

        @Test
        @DisplayName("should return false for love bird")
        void bird_love_bird() {
            fail();
            assertFalse(StartsAndEnds.BIRD_PATTERN.matcher("love bird").find());
        }

        @Test
        @DisplayName("should return false for butcherbird from Australia")
        void bird_butcherbird() {
            fail();
            assertFalse(StartsAndEnds.BIRD_PATTERN.matcher("butcherbird from Australia").find());
        }

        @Test
        @DisplayName("should return false for bird")
        void bird_bird() {
            fail();
            assertFalse(StartsAndEnds.BIRD_PATTERN.matcher("bird").find());
        }
    }

}
