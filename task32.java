class task32 
{
    public static void main(String[] args) 
    {
        int[] arr = {100, 200, 300, 400, 500};
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++) 
        {
            copy[i] = arr[i];
        }
        System.out.println("Prices:");
        for(int i = 0; i < copy.length; i++) 
        {
            System.out.print(copy[i] + " ");
        }
    }
}