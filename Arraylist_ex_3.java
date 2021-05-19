//program to append element at particular position
import java.util.*;
public class Arraylist_ex_3
{
    // appending an element at the particular position using add();

    public static void main(String[] args)
    {

        ArrayList <Integer> Numbers = new ArrayList <Integer>();
        Numbers.add(10);
        Numbers.add(20);
        Numbers.add(30);
        System.out.println(Numbers);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the element you want to append = ");
        int userValue = userInput.nextInt();
        System.out.print("Enter position where you want to the add element = ");
        int userChoice = userInput.nextInt();
        Numbers.add(userChoice,userValue);
        System.out.println("after inserting "+userValue+ " in the position "+userChoice+" list is "+ Numbers);
    }
}