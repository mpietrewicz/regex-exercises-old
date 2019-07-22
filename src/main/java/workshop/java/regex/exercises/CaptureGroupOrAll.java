package workshop.java.regex.exercises;

import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class CaptureGroupOrAll {


    //CAPTURE GROUP, CAPTURE ALL

    /*
        Write a pattern that captures the text file name.
        data.txt -> data
        Open file homework_1.txt -> homework_1
        333.txt has been deleted -> 333

        Then, given a String, write a method that returns the file name.
     */
    public static Pattern FILE_NAME_PATTERN = Pattern.compile(REPLACE_ME);

    public String findFileName(String input) {
       return "";
    }


    /*
        Write a Pattern that captures the names of the players before and after " VS ":
        Josh11 VS _Carol_ -> Josh Carol
        89pola VS anna    -> pola anna
        Daniel VS 3-Eric  -> Daniel Eric

        Then, given a String, write a method that returns:
        Today's chess players are player1 and player2.

        Example:
        +tommy+ VS SANDY  -> Today's chess players are tommy and SANDY.
     */
    public static Pattern CHESS_PLAYER_PATTERN = Pattern.compile(REPLACE_ME);

    public String introduceChessPlayers(String input) {
       return "";
    }

    /*
        The String below represents a row in a table. Write a Pattern to capture everything between the three | lines.
        Anna|King|F|26
        Then, given a String, write a method that returns:
        Name: Anna King, Gender: F, Age: 26
     */
    public static Pattern TABLE_PATTERN = Pattern.compile(REPLACE_ME);

    public String extractDataFromTable(String input) {
       return "";
    }

    /*
        Write a Pattern that captures people's ages from text.
        Example:
        Tania is 33 years old. Her baby is 1 year old. Tania's 2 brothers are 22 years old and 16 years old.
        -> Capture 33, 1, 22, 16
        Then, write a method that returns the average of the captured numbers.
     */
    public static Pattern CAPTURE_AGE_PATTERN = Pattern.compile(REPLACE_ME);

    public double averageAge(String input) {
        return 0.0;
    }


    /*
        Write a pattern that captures everything between <h1> </h1> tags.
        Then, given a text, write a method that returns the original text with the header changed to upper case.

        Example:
        <article>
          <header>
            <h1>Most important heading here</h1>
            <h3>Less important heading here</h3>
          </header>
        </article>

        -> Most important heading here

     */
    public static Pattern HEADER_PATTERN = Pattern.compile(REPLACE_ME);

    public String getHeadingText(String input) {
       return "";
    }


}
