package workshop.java.regex.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import workshop.java.regex.exercises.CaptureGroupOrAll;

import java.util.regex.Matcher;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static workshop.java.regex.exercises.CaptureGroupOrAll.FILE_NAME_PATTERN;

@DisplayName("Capture group or all test")
public class CaptureGroupOrAllTest {

    private CaptureGroupOrAll p = new CaptureGroupOrAll();

    @Nested
    @DisplayName("File name")
    class FileName {

        @Test
        @DisplayName("should return true for file name data")
        void findFileName_data() {
            fail();
            assertEquals("data", p.findFileName("data.txt"));
        }

        @Test
        @DisplayName("should return true for file name homework")
        void findFileName_homework() {
            fail();
            assertEquals("homework_1", p.findFileName("Open file homework_1.txt"));
        }

        @Test
        @DisplayName("should return true for file name 333")
        void findFileName_333() {
            fail();
            assertEquals("333", p.findFileName("333.txt has been deleted"));
        }

        @Test
        @DisplayName("should return true for data.txt")
        void fileName_data() {
            fail();
            assertTrue(FILE_NAME_PATTERN.matcher("data.txt").find());
        }

    }

    @Nested
    @DisplayName("Chess player name")
    class ChessPlayerName {

        private String result1 = "Today's chess players are tommy and SANDY.";
        private String result2 = "Today's chess players are Josh and Carol.";
        private String result3 = "Today's chess players are pola and anna.";
        private String result4 = "Today's chess players are Daniel and Eric.";


        @Test
        @DisplayName("should return true for Josh11 VS _Carol_")
        void chessPlayer_josh_carol() {
            fail();
            assertTrue(CaptureGroupOrAll.CHESS_PLAYER_PATTERN.matcher("Josh11 VS _Carol_").find());
        }

        @Test
        @DisplayName("should return true for 89pola VS anna")
        void chessPlayer_pola_anna() {
            fail();
            assertTrue(CaptureGroupOrAll.CHESS_PLAYER_PATTERN.matcher("89pola VS anna").find());
        }

        @Test
        @DisplayName("should return true for Daniel VS 3-Eric")
        void chessPlayer_daniel_eric() {
            fail();
            assertTrue(CaptureGroupOrAll.CHESS_PLAYER_PATTERN.matcher("Daniel VS 3-Eric").find());
        }

        @Test
        @DisplayName("should return Today's chess players are tommy and SANDY.")
        void introduceChessPlayers_tommy_sandy() {
            fail();
            assertEquals(result1, p.introduceChessPlayers("+tommy+ VS SANDY"));
        }

        @Test
        @DisplayName("should return Today's chess players are Josh and Carol.")
        void introduceChessPlayers_josh_carol() {
            fail();
            assertEquals(result2, p.introduceChessPlayers("Josh11 VS _Carol_"));
        }

        @Test
        @DisplayName("should return Today's chess players are pola and anna.")
        void introduceChessPlayers_pola_anna() {
            fail();
            assertEquals(result3, p.introduceChessPlayers("89pola VS anna"));
        }

        @Test
        @DisplayName("should return Today's chess players are Daniel and Eric.")
        void introduceChessPlayers_daniel_eric() {
            fail();
            assertEquals(result4, p.introduceChessPlayers("Daniel VS 3-Eric"));
        }

    }

    @Nested
    @DisplayName("Data in table")
    class DataInTable {

        private String input1 = "Anna|King|F|26";
        private String result1 = "Name: Anna King, Gender: F, Age: 26";
        private String input2 = "Natasha|Petrova|F|40";
        private String result2 = "Name: Natasha Petrova, Gender: F, Age: 40";
        private String input3 = "Arnold|Viking|M|34";
        private String result3 = "Name: Arnold Viking, Gender: M, Age: 34";

        @Test
        @DisplayName("should return Name: Anna King, Gender: F, Age: 26")
        void extractDataFromTable_anna() {
            fail();
            assertEquals(result1, p.extractDataFromTable(input1));
        }

        @Test
        @DisplayName("should return Name: Natasha Petrova, Gender: F, Age: 40")
        void extractDataFromTable_natasha() {
            fail();
            assertEquals(result2, p.extractDataFromTable(input2));
        }

        @Test
        @DisplayName("should return Name: Arnold Viking, Gender: M, Age: 34")
        void extractDataFromTable_arnold() {
            fail();
            assertEquals(result3, p.extractDataFromTable(input3));
        }
    }

    @Nested
    @DisplayName("Capture age and count average")
    class CaptureAge {

        private String input1 = "Tania is 33 years old. Her baby is 1 year old. " +
                "Tania's 2 brothers are 22 years old and 16 years old.";
        private String input2 = "The elephants in the sanctuary are between 2 years old and 64 years old. " +
                "The oldest elephant to ever live here was 70 years old." +
                "Baby elephants need their mother's protection until they are 4 years old. " +
                "They are considered mature at 17 years old.";

        @Test
        @DisplayName("should find 4 matches")
        void captureAge_count_4() {
            fail();
            Matcher m = CaptureGroupOrAll.CAPTURE_AGE_PATTERN.matcher(input1);
            int count = 0;
            while (m.find()) count++;
            assertEquals(4, count);
        }

        @Test
        @DisplayName("should return 18 for ages: 33, 1, 22, 16")
        void captureAge_18() {
            fail();
            assertEquals(18, p.averageAge(input1));
        }

        @Test
        @DisplayName("should return 31.4 for ages: 2, 64, 70, 4, 17")
        void captureAge_31() {
            fail();
            assertEquals(31.4, p.averageAge(input2));
        }
    }

    @Nested
    @DisplayName("Get header text")
    class HeaderText {

        private String input1 = String.format("<article>%n" +
                "  <header>%n" +
                "    <h1>Most important heading here</h1>%n" +
                "    <h3>Less important heading here</h3>%n" +
                "    <p>Some additional information here</p>%n" +
                "  </header>%n" +
                "  <p>Lorem Ipsum dolor set amet....</p>%n" +
                "</article>");

        private String input2 = String.format("<article>%n" +
                "  <header>%n" +
                "    <h1>Breaking news!</h1>%n" +
                "    <h3>New type of virus</h3>%n" +
                "    <p>It is very dangerous. Do not go out.</p>%n" +
                "  </header>%n" +
                "</article>");

        private String output1 = "Most important heading here";
        private String output2 = "Breaking news!";


        @Test
        @DisplayName("should return Most important heading here")
        void getHeaderText_most_important() {
            fail();
            assertEquals(output1, p.getHeadingText(input1));
        }

        @Test
        @DisplayName("should return Breaking news!")
        void getHeaderText_h1_breaking_news() {
            fail();
            assertEquals(output2, p.getHeadingText(input2));
        }

        @Test
        @DisplayName("should return true for most important heading here")
        void getHeaderText_h1_most() {
            fail();
            assertTrue(CaptureGroupOrAll.HEADER_PATTERN.matcher(input1).find());
        }

    }
}
