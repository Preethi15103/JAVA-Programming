import java.util.*;
class expenser
{
    public static void main(String[] args){
        expense o = new expense();
        o.expen();
    }
}
class expense
{
    void expen()
    {
        int temp=0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Enter your expense name: ");
            String str = s.nextLine();
            if(str.equals("stop"))
            break;
            System.out.println("Enter the expense amount: ");
            int rup = s.nextInt();
            s.nextLine();
            temp = temp+rup;
        }while(true);
        System.out.println("Total expense : " + temp);
    }
}