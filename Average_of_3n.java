import java.util.*;
class Average
{
    int a ,b,c;
    Average(int a,int b,int c)
    {
        this.a =a;
        this.b=b;
        this.c=c;
    }
    int Calculate_Average()
    {
        return (a + b + c) / 3;
        
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1> ");
        int a = input.nextInt();
        System.out.println("Enter number 2> ");
        int b = input.nextInt();
        System.out.println("Enter number 3> ");
        int c = input.nextInt();
        Average A = new Average(a,b,c);
        System.out.println(A.Calculate_Average());
    }
}