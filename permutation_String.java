import java.util.Scanner;
public class permutation_String {
    public static void main(String[] args)
    {
        Scanner input  =new Scanner(System.in);
        System.out.print("Enter the string to find its permutations = ");
        String userInput = input.nextLine();
        int start = 0;
        int length = userInput.length();
        System.out.println("The permutations for string "+ userInput + " is");
        findPermutate(userInput,start,length);
    }

    public static void findPermutate(String s , int start , int end )
    {
        if(start == end -1)
            System.out.println(s);
        else
            for(int i =start;i<end;i++)
            {
                s = swapString(s,start,i);
                findPermutate(s,start+1,end);
                s = swapString(s,start,i);
            }

    }

    public static String swapString(String s,int start, int j)
    {
        char temp;
        char arrayforString[] =s.toCharArray();
        temp = arrayforString[start];
        arrayforString[start] = arrayforString[j];
        arrayforString[j] = temp;
        return String.valueOf(arrayforString);

    }
}
