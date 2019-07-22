package workshop.java.regex.intro;

import java.util.regex.Pattern;

import static java.lang.System.out;

public class _IX_Opcjonalne {

    public static void main(String[] args) {
        /*

                    Opcjonalnie: ab?c    abc, ac

                    Dla znaku zapytania używamy, podobnie jak z kropką - bakcjslash \?

                    TODO 9 napisz wzorzec dla wyszukania w tekście
            	        1 file?
                        3 files?
                        200 files?
            	            ale nie dla
            	        No files?
            	        20 files.

                 */


        String textToTest1 = "1 file";
        String textToTest2 = "3 files?";
        String textToTest3 = "200 files?";
        String textToTest4 = "No files?";
        String textToTest5 = "20 files.";

        String jednaLubWiecejCyfraOpcjonalneSRegex = "\\d+ files?\\?";


        Pattern jednaLubWiecejCyfraOpcjonalneS = Pattern.compile(jednaLubWiecejCyfraOpcjonalneSRegex);


        out.println(jednaLubWiecejCyfraOpcjonalneS.matcher(textToTest1).find());
        out.println(jednaLubWiecejCyfraOpcjonalneS.matcher(textToTest2).find());
        out.println(jednaLubWiecejCyfraOpcjonalneS.matcher(textToTest3).find());
        out.println(jednaLubWiecejCyfraOpcjonalneS.matcher(textToTest4).find());
        out.println(jednaLubWiecejCyfraOpcjonalneS.matcher(textToTest5).find());


    }
}
