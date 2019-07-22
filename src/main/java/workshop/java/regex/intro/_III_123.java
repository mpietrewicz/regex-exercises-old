package workshop.java.regex.intro;

import java.util.regex.Pattern;

import static java.lang.System.out;
import static java.util.regex.Pattern.compile;

public class _III_123 {

    public static void main(String[] args) {
    /*
                TODO 3 napisz wzorzec dla wyszukania w tekście
                	abc123xyz
        	        jakiś string "123"
                    var zmienna = 123;


             */

        String textToTest1 = "abc123xyz";
        String textToTest2 = "jakiś string \"123\"";
        String textToTest3 = "var zmienna = 123;";
        String textToTest4 = "var zmienna = ABC;";

        String regexPattern = "123";

        Pattern wyszukaj123 = Pattern.compile(regexPattern);

        out.println(wyszukaj123.matcher(textToTest1).find());
        out.println(wyszukaj123.matcher(textToTest2).find());
        out.println(wyszukaj123.matcher(textToTest3).find());
        out.println(wyszukaj123.matcher(textToTest4).find());
    }
}
