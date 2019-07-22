package workshop.java.regex.intro;

import java.util.regex.Pattern;

import static java.lang.System.out;
import static java.util.regex.Pattern.compile;

public class _V_Zakres {

    public static void main(String[] args) {

        /*
                    [abc] oznacza pojedyńczy znak a,b lub c
                    [^123] oznacza pojedyńczy znak, który nie jest 1,2 lub 3

                    TODO 5 napisz wzorzec dla wyszukania w tekście
                    	ala
            	        ela
                            ale nie
                        ola

                 */


        String textToTest1 = "ala";
        String textToTest2 = "ela";
        String textToTest3 = "ola";

        String aeLa = "[ae]la";
        String nieOLa = "[^o]la";


        Pattern wyszukajZOLubE = compile(aeLa);
        Pattern wyszukajBezO = compile(nieOLa);

        out.println(wyszukajZOLubE.matcher(textToTest1).find());
        out.println(wyszukajZOLubE.matcher(textToTest2).find());
        out.println(wyszukajZOLubE.matcher(textToTest3).find());

        out.println(wyszukajBezO.matcher(textToTest1).find());
        out.println(wyszukajBezO.matcher(textToTest2).find());
        out.println(wyszukajBezO.matcher(textToTest3).find());
    }

}
