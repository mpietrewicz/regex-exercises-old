package workshop.java.regex.intro;

import java.util.regex.Pattern;

import static java.lang.System.out;
import static java.util.regex.Pattern.compile;

public class _IV_Wildcard {


    public static void main(String[] args) {

        /*
                    . oznacza każdy pojedyńczy znak (litera, cyfra, spacja etc.)

                    wyszukanie 'kropki' - używamy backslash \.

                    TODO 4 napisz wzorzec dla wyszukania w tekście
                    	cat.
            	        896.
                        ?=+.
                            ale nie
                        abc1

                 */


        String textToTest1 = "cat.";
        String textToTest2 = "896.";
        String textToTest3 = "?=+.";
        String textToTest4 = "abc1";

        String regexPattern = "...\\.";


        Pattern wyszukaj3ZnakiIKropka = compile(regexPattern);

        out.println(wyszukaj3ZnakiIKropka.matcher(textToTest1).find());
        out.println(wyszukaj3ZnakiIKropka.matcher(textToTest2).find());
        out.println(wyszukaj3ZnakiIKropka.matcher(textToTest3).find());
        out.println(wyszukaj3ZnakiIKropka.matcher(textToTest4).find());
    }

}
