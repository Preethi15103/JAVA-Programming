import java.util.*;
class dowhile{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a;
        do{
            a = s.nextInt();
            System.out.println(a);
        }while(a!=0);
            
        System.out.println("Stop");
    }
}