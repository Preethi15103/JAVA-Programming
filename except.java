class except
{
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};
        try
        {
            System.out.println(arr[7]);
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array Index Out Of Bounds");
        }
        try 
        {
            System.out.println(arr[-1]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array Index Out Of Bounds");
        }
        try
        {
            int i=5;
            System.out.println(arr[i]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds");
        }
        try 
        {
            String s = null;
            System.out.println(s.length());
        } 
        catch (NullPointerException e) 
        {
            System.out.println("Null Pointer");
        }
        try 
        {
            int a = 10 / 0;
            System.out.println(a);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic");
        }

    }
}