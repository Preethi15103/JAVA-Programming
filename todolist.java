import java.util.*;
class todolist{
    public static void main(String[] args){
        System.out.println("Enter your task: ");
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        todo str = new todo();
        str.todol(st);
    }
}

class todo{
    void todol(String a)
    {
        if(a.isBlank())
        {
            System.out.println("Nothing is entered Please Check It");
            return;
        }
        else
        {
            System.out.println("Task name : "+a);
        }
        System.out.println("Thank You For Entering!!");
    }
}