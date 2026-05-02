
import java.util.*;
class arrsort 
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
       for(int i = 0; i < n-1; i++) 
       {
            for(int j = i+1; j < n; j++) 
            {
                if(arr[i] > arr[j]) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }       
            }
        }
        for(int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}