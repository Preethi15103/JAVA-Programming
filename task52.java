class task52 
{
    public static void main(String[] args) 
    {
        Account acc = new Account();
        acc.deposit(1000);
        acc.withdraw(400);
        acc.checkbalance();
    }
}

abstract class Acc 
{
    double balance = 0;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void checkbalance() 
    {
        System.out.println("Balance : " + balance);
    }
}

class Account extends Acc
{
    void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited : " + amount);
    }
    void withdraw(double amount) 
    {
        balance -= amount;
        System.out.println("Withdrawn : " + amount);
    }
}
