import java.util.*;
class atmpass 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Account a = new Account();
        System.out.println("Enter username:");
        String u = s.nextLine();
        System.out.println("Enter password:");
        String p = s.nextLine();
        if(a.check(u, p)) 
        {
            System.out.println("Enter new password:");
            String np = s.nextLine();
            a.set(np);
            System.out.println("Password changed");
        } 
        else 
        {
            System.out.println("Wrong Username and Password!!!");
        }
    }
}
class Account
{
    private String user = "Prithu";
    private String pass = "1510";
    boolean check(String u, String p) 
    {
        return user.equals(u) && pass.equals(p);
    }
    void set(String np) 
    {
        pass = np;
    }
}