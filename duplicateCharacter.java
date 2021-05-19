import java.util.*;
public class duplicateCharacter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string ");
        String userInput = input.nextLine();
        char[] arr = userInput.toCharArray();
        System.out.println("The duplicates character in the string "+ userInput);
        int count;
        for(int i = 0;i<arr.length;i++)
        {
            count = 1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]='0';
                }
            }
            if(count>1&&arr[i]!='0')
            {
                System.out.println(arr[i]);
            }
        }


    }
}