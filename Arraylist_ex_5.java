// program to remove the given element from list
import java.util.*;
public class Arraylist_ex_5
{
    // removing an element at the particular position using remove(value);

    public static void main(String[] args)
    {

        ArrayList <Integer> Numbers = new ArrayList <Integer>();
        Numbers.add(10);
        Numbers.add(20);
        Numbers.add(30);
        System.out.println(Numbers);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the element you want to remove = ");
        int userValue = userInput.nextInt();
        boolean doesContain = Numbers.contains(userValue);
        if(doesContain)
        {
            int pos = Numbers.indexOf(userValue);
            Numbers.remove(pos);
        }
        else
        {
            System.out.println("Enter a proper value");
        }
        System.out.println("List status after removing "+ Numbers);
    }
}