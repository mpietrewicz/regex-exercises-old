package workshop.java.regex.intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class _VIII_ZeroJedenLubWiecej {

    public static void main(String[] args) {
        /*
                    \d* zero lub więcej
                    \d+ jeden lub więcej

                    TODO 8a napisz wzorzec dla wyszukania w tekście
            	        aaaa
            	        a123aa

            	    TODO 8b napisz wzorzec dla wyszukania w tekście
            	        a123aa
            	            ale nie
            	        aaaa
                 */


                String onlyLetters = "aaaa";
                String letersAndDigitd = "a123aa";

                String zeroOrMoreRegex = "\\d*";
                String oneOrMoreRegex = "\\d+";

                Pattern zeroOrMore = Pattern.compile(zeroOrMoreRegex);
                Pattern oneOrMore = Pattern.compile(oneOrMoreRegex);

                out.println(zeroOrMore.matcher(onlyLetters).find());
                out.println(zeroOrMore.matcher(letersAndDigitd).find());

                out.println(oneOrMore.matcher(onlyLetters).find());
                out.println(oneOrMore.matcher(letersAndDigitd).find());


    }
}
