class callr 
{
    static void change(sample a) 
    {  
        a.b = 50;
    }
    public static void main(String[] args) 
    {
        sample call = new sample(); 
        call.b = 10;
        change(call);
        System.out.println(call.b); 
    }
}
class sample 
{
    int b;
}