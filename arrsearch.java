
import java.util.*;
class arrsearch 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) 
        {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter element to search:");
        int key = s.nextInt();
        for(int i = 0; i < n; i++) 
        {
            if(arr[i] == key) 
            {
                System.out.println("Found");
                return; // stop program
            }
        }
        System.out.println("Not Found");
    }
}