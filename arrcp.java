import java.util.*;
class arrcp 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        int[] cp1 = arr.clone();
        int[] cp2 = Arrays.copyOf(arr, arr.length);
        int[] cp3 = new int[arr.length];
        System.arraycopy(arr, 0, cp3, 0, arr.length);
        System.out.println("Cp Array:");
        for(int i = 0; i < cp1.length; i++) 
        {
            System.out.println(cp1[i] + " " + cp2[i] + " " + cp3[i]);
        }
    }
}