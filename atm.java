import java.util.*;
class atm 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        functions f = new functions();
        int opt;
        do 
        {
            System.out.println("\nEnter the operation to perform : ");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            opt = sc.nextInt();
            if (opt == 1) 
            {
                System.out.println("Enter the amount to be deposited : ");
                float amount = sc.nextFloat();
                f.set_balance(amount);
                System.out.println("Amount Deposited");
            }

            else if (opt == 2) 
            {
                System.out.println("Enter the amount to be withdrawn : ");
                float amo = sc.nextFloat();
                if (amo <= f.get_balance()) 
                { 
                    f.sub_balance(amo);
                    System.out.println("Amount Withdrawn");
                } else 
                {
                    System.out.println("Insufficient bank balance");
                }
            }
            else if (opt == 3) 
            {
                System.out.println("Current Balance : " + f.get_balance());
            }
        } while (opt != 4);
        System.out.println("Thank You For Using ATM");
    }
}

class functions {
    double balance = 5015.30;
    double get_balance() 
    {
        return balance;
    }
    void set_balance(double b) 
    {
        balance += b;
    }
    void sub_balance(double a) 
    {
        balance -= a;
    }
}