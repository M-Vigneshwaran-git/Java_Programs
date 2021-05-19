import java.util.*;
public class reverse_string
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string to see their reverse value");
        String a = userInput.nextLine();
        StringBuilder rev = new StringBuilder();
        char arr[] = a.toCharArray();

        for(int i=arr.length-1;i>-1;--i)
        {
            rev.append(arr[i]);

        }
        System.out.println(rev);
    }
}
