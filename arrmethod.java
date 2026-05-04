import java.util.*;
class arrmethod 
{
    public static void main(String[] args) 
    {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr); 
        System.out.println("Sorted Array:");
        for(int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}