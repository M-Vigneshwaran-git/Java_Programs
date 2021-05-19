import java.util.*;
public class Password_Checker
{
    public static final int password_length = 8;
    public static int numeric_Count;
    public static int char_Count;
    public static void main(String[] args)
    {
        System.out.print("""
                PLEASE GO THROUGH THE TERMS AND CONDITIONS.
                1) your password must be length of more than 8
                2) It must contain only letters and digits
                3) It must contain atleast two digits\s\n""");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Password ");
        String User_Input = input.nextLine();
        if(password_Validator(User_Input))
        {

            System.out.println("valid password "+ User_Input);
        }
        else if(User_Input.length()<8) System.out.println("invalid: password length should be higher than 8");
        else if(char_Count<2)System.out.println("invalid: password should contains atleast two or more Characters");
        else if(numeric_Count<2)System.out.println("invalid: password should contains atleast two or more digits");
    }
    public static boolean password_Validator(String password_ToCheck)
    {
        if(password_ToCheck.length() < password_length)
        {
            return false;
        }
        char_Count =0;
        numeric_Count = 0;

        for(int i = 0;i<password_ToCheck.length();i++)
        {
            char traversing_Char = password_ToCheck.charAt(i);
            if(is_numeric(traversing_Char)) numeric_Count++;
            else if(is_letter(traversing_Char)) char_Count++;
            else return false;

        }
        return(char_Count >=2 && numeric_Count>=2);
    }
    public static boolean is_letter(char traversing_Char)
    {
        traversing_Char = Character.toUpperCase(traversing_Char);
        return(traversing_Char >='A' && traversing_Char <='Z');

    }
    public static boolean is_numeric(char traversing_Char)
    {
        return (traversing_Char >='0' && traversing_Char <='9');


    }

}