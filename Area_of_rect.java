import java.util.*;
class Area
{
    int length;
    int breadth;
    Area(int l, int b){
        length = l;
        breadth = b;
    }
    int returnArea(){
        return length * breadth;
        
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length> ");
        int length = input.nextInt();
        System.out.println("Enter breadth> ");
        int breadth = input.nextInt();
        Area a = new Area(length,breadth);
        System.out.println(a.returnArea());
        
    }
}
