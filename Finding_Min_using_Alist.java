import java.util.*;
class Main
{
    static void min(ArrayList <Integer> a)
    {
        //int size = a.size();
        int min = a.get(0);
        for(int i=1;i<a.size();i++)
        {
            if (min>a.get(i))
                min = a.get(i);
            
        }
        System.out.println(min);
    }



    public static void main(String[] args)
    {
        //int a[]={12,23,4,566,7,1};
        ArrayList <Integer> a = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int sizeOfArray = input.nextInt();
        for(int j=0;j<sizeOfArray;j++)
        {
            System.out.printf("Enter the element number %d ",j+1);
            int element = input.nextInt();
            a.add(j,element);
            
        }
        
        min(a);
    }   
    
}