import java.util.*;
class task23 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();
        if (str.startsWith("Java")) 
        {
            System.out.println("Yes");
        } else 
        {
            System.out.println("No");
        }
    }
}
