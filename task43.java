import java.util.*;
class task43 
{
    public static void main(String[] args) 
    {
        String[] cust = {"Arun", "Bala", "Cathy", "Divya", "Eshan"};
        Random rand = new Random();
        int win = rand.nextInt(cust.length);
        System.out.println("Winner is: " + cust[win]);
    }
}