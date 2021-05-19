// program to replace existing element with new element:
import java.util.*;
public class Array_list_ex_1
{
    public static void main(String[] args)
    {
        // creating a new arraylist for storing list of fruits names

        ArrayList <String> fruitsList = new ArrayList <String>();
        // adding elements in list using add() ClassNotFoundException

        fruitsList.add("Apple");
        fruitsList.add("Mango");
        fruitsList.add("Papaya");
        fruitsList.add("Grape");
        System.out.println(fruitsList);

        //Example 1: replacing a particular element with given element;

        char ExitStatus;
        do
        {
            Scanner elementToReplace = new Scanner(System.in);
            System.out.print("Enter which element you want to replace from the list - ");
            String replaceElement = elementToReplace.nextLine();
            boolean presentORNot = fruitsList.contains(replaceElement);
            if(presentORNot)
            {
                int position = fruitsList.indexOf(replaceElement);
                System.out.print("Enter the new element to replace ");
                String whereToReplace = elementToReplace.nextLine();
                fruitsList.set(position,whereToReplace);
                System.out.println("The updated list is "+fruitsList);
            }
            else
            {
                System.out.println("Please enter any element from the given list ");
            }
            System.out.print("DO you want to continue y for yes n for no ");
            ExitStatus = elementToReplace.next ().charAt(0);
        }while(ExitStatus=='y');

    }
}