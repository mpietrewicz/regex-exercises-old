package workshop.java.regex.intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;
import static java.util.regex.Pattern.compile;

public class _II_Litera {

    public static void main(String[] args) {
            /*
                      TODO 1 napisz wzorzec do wyszukania,
                             czy w tekście: abcdef
                             znajduje się wzorzec: ł

                             Wydrukuj do konsoli wynik

                             Zmodyfikuj tekst / wzorzec, żeby uzyskać true
              */

        String textToTest1 = "abcdef";
        String textToTest2 = "abcłdef";

        String regexPattern = "ł";

        Pattern wyszukajŁ = compile(regexPattern);

        out.println(wyszukajŁ.matcher(textToTest1).find());
        out.println(wyszukajŁ.matcher(textToTest2).find());
    }
}
