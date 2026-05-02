import java.util.*;
class task21
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();
        if (str.length() < 5) 
        {
            System.out.println("Short");
        } else 
        {
            System.out.println("Long");
        }
    }
}
