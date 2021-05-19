// program to perform joining of two list
import java.util.*;
public class Arraylist_ex_6
{

    // creating  1st ArrayList
    public static void main(String[] args)
    {

        ArrayList <String> Language_1 = new ArrayList <String>();
        Language_1.add("Java");
        Language_1.add("javascript");
        Language_1.add("Python");
        System.out.println("List 1 is "+ Language_1);

        //  creating 2nd ArrayList
        ArrayList <String> Language_2 = new ArrayList <String>();

        Language_2.add("C");
        Language_2.add("Scala");
        Language_2.add("Php");
        Language_2.add("DotNet");
        System.out.println("List 2 is "+ Language_2);

        // joining two ArrayList using addAll()

        Language_1.addAll(Language_2);
        System.out.println("The joined list is "+Language_1);


    }
}