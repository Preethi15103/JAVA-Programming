class callv 
{
    static void change(int x) 
    {
        x = 50;
    }

    public static void main(String[] args) 
    {
        int a = 10;
        change(a);
        System.out.println(a);
    }
}