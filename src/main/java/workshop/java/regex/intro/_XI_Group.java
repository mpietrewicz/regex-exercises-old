package workshop.java.regex.intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _XI_Group {

    public static void main(String[] args) {
        /*

                       wzorzec-1234-ABCD
                          vs
                       (regex: 7 małych liter)-(regex 4 cyfry)-(regex 4 wielkie litery)


                                      matcher.group(1)        wzorzec
                                      matcher.group(2)        1234
                                      matcher.group(3)        ABCD
                                      matcher.group(0)        wzorzec-1234-ABCD

                       TODO 11 z "wzorzec" wydrukuj do konsoli wartości jak wyżej


               */



        Pattern pattern = Pattern.compile("([a-z]{7})-(\\d{4})-([A-Z]{4})");


        Matcher m = pattern.matcher("wzorzec-1234-ABCD");
        if(m.matches()) {
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
            System.out.println(m.group(0));

        }
    }
}
