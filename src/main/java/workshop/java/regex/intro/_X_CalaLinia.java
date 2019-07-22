package workshop.java.regex.intro;

import java.util.regex.Pattern;

import static java.lang.System.out;
import static java.util.regex.Pattern.compile;

public class _X_CalaLinia {

    public static void main(String[] args) {
                    /*
                                TODO 9 napisz wzorzec dla wyszukania w tekście
                        	        successful operation
                        	            ale nie dla
                        	        Error: unsuccessful operation 1
                                    Error: unsuccessful operation 2

                                    ^początek i koniec linii$

                             */

        String textToTest1 = "Error: unsuccessful operation 1";
        String textToTest2 = "Error: unsuccessful operation 2";
        String textToTest3 = "successful operation";

        String poczatekIKoniecRegex = "^successful operation$";


        Pattern poczatekIkoniec = compile(poczatekIKoniecRegex);


        out.println(poczatekIkoniec.matcher(textToTest1).find());
        out.println(poczatekIkoniec.matcher(textToTest2).find());
        out.println(poczatekIkoniec.matcher(textToTest3).find());
    }
}
