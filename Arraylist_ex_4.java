// program to remove element from a particular position
import java.util.*;
public class Arraylist_ex_4
{
    // removing an element at the particular position using remove(value);

    public static void main(String[] args)
    {

        ArrayList <Integer> Numbers = new ArrayList <Integer>();
        Numbers.add(10);
        Numbers.add(20);
        Numbers.add(30);
        System.out.println("Current list "+Numbers);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter position where you want to the remove element = ");
        int userChoice = userInput.nextInt();
        int removedElement = Numbers.get(userChoice);
        Numbers.remove(userChoice);
        System.out.println("The element "+" " +removedElement+ " in the postion "+userChoice+" has removed ");
        System.out.println("list status after removing "+Numbers);
    }
}