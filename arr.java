import java.util.*;
class arr {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++) 
        {
            arr[i] = s.nextInt();
        }
        for(int i = 0; i < 10; i++) 
        {
            System.out.println(arr[i]);
        }
    }
}