// program to perform trim and escaping special characters
import java.util.*;
public class Trim
{
    public static void main(String[] args) {
        String mixed_string  = "  I( have  le@ft &sp#ace $wh%ile) dec^la*ring to check trim function  ";
        System.out.println(mixed_string);
        System.out.println(mixed_string.length());
        // to replace symbols mixed with strings
        String removing_special_characters = mixed_string.replaceAll("[!@#$%^&*()]",""); //#$@^&*%()
        System.out.println(removing_special_characters);
        System.out.println(removing_special_characters.length());

        String aftertrim = removing_special_characters.trim();
        System.out.println(aftertrim);
        System.out.println(aftertrim.length());

    }
}