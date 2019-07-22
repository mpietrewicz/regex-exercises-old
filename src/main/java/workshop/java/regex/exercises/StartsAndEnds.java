package workshop.java.regex.exercises;

import java.util.regex.Pattern;

import static workshop.java.regex.exercises.RegexUtil.REPLACE_ME;

public class StartsAndEnds {



    //STARTS AND ENDS

    /*
        Write a pattern that matches words that are at least 3 letters long,
        end with one S and appear in the end of the String:

        Funny video about cows -> matches cows
        Let's visit some parks -> matches parks
        Life hacks             -> matches hacks

        And does not match:
        kindness
        Fun facts?
        I know what this is
     */
    public static Pattern END_WITH_S_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches any IP address that starts with 1 and ends with 1
        and occurs in the begging of the String:
        168.19.122.91  |  London    |  UK
        102.12.40.131  |  New Delhi |  India
        121.197.49.71  |  Sydney    |  Australia

        And does not match:
        216.10.187.221 |  Beijing   |  China
        Chicago   |  124.31.20.421  |  USA
        1021240131  | Buenos Aires  |  Argentina
        102.12.24.0131 |  Managua   |  Nicaragua
     */
    public static Pattern IP_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a pattern that matches:
        metal
        Metal
        metals
        Metals
        And does not match:
        heavy metal
        metallic
        metal tool
        nonmetal
     */
    public static Pattern METAL_PATTERN = Pattern.compile(REPLACE_ME);


    /*
        Write a Pattern that matches the html bold tags only in the beginning and end of the String:
        <b>This text is bold.</b>
        <b>PHOTO</b>
        <b> HTML is 26 years old.   </b>
        <b></b>
        And does not match:
        This movie is <b>THE BOMB</b>!
        <b>Click to view the gallery.
        Like!</b>
     */
    public static Pattern BOLD_PATTERN = Pattern.compile(REPLACE_ME);

    /*
        Write a Pattern that matches the suffix -bird or -birds only in the end of the String:
        Check out that hummingbird
        kingbirds
        tiny sugarbird
        And does not match:
        love bird
        two birds
        bird
        butcherbird from Australia
     */
    public static Pattern BIRD_PATTERN = Pattern.compile(REPLACE_ME);

}
