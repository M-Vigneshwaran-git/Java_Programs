import java.util.*;

public class Maximum_occurence {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = userInput.nextLine();
        int[] CountArray = new int[str.length()];
        char maximum_character = str.charAt(0);
        int maximum , i, j;

        char[] string = str.toCharArray();


        for (i = 0; i < string.length; i++) {
            CountArray[i] = 1;
            for (j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != '0') {
                    CountArray[i]++;
                    string[j] = '0';
                }
            }

        }
        maximum = CountArray[0];
        for (i = 0; i < CountArray.length; i++) {
            if (maximum < CountArray[i])
            {
                maximum= CountArray[i];
                maximum_character = string[i];
            }
        }
        System.out.println("The maximum character which occured in the given string is: " + maximum_character+" it occured " + maximum +" times ");

    }
}