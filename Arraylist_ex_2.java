// program to append an element at the end of the list
import java.util.*;
public class Arraylist_ex_2
{
    // appending an element at the end of the list using add();

    public static void main(String[] args)
    {

        ArrayList <Integer> Numbers = new ArrayList <Integer>();
        Numbers.add(10);
        Numbers.add(20);
        Numbers.add(30);
        System.out.println("Current list "+ Numbers);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the element you want to append = ");
        int userValue = userInput.nextInt();
        Numbers.add(userValue);
        System.out.println("Updated list "+ Numbers);
    }
}