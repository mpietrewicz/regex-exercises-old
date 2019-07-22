package workshop.java.regex.intro;

import java.util.regex.Pattern;

import static java.lang.System.out;
import static java.util.regex.Pattern.compile;

public class _VII_IloscPowtorzen {

    public static void main(String[] args) {

        /*
            w{2} ww
            a{2,3} aa aaa

            TODO 7 napisz wzorzec dla wyszukania w tekście
                wwwxyz
                wwxyz
                wxyz
                    ale nie
                xyzww
                wxzy

         */


        String textToTest1 = "wwwxyz";
        String textToTest2 = "wwxyz";
        String textToTest3 = "wxyz";
        String textToTest4 = "xyzww";
        String textToTest5 = "wxzy";

        String regexPattern = "w{1,3}xyz";

        Pattern wyszukaj1Do3WPrefix = compile(regexPattern);

        out.println(wyszukaj1Do3WPrefix.matcher(textToTest1).find());
        out.println(wyszukaj1Do3WPrefix.matcher(textToTest2).find());
        out.println(wyszukaj1Do3WPrefix.matcher(textToTest3).find());
        out.println(wyszukaj1Do3WPrefix.matcher(textToTest4).find());
        out.println(wyszukaj1Do3WPrefix.matcher(textToTest5).find());

    }

}
