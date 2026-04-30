import java.util.Scanner;
class task12 {    
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);        
        System.out.print("Enter a number: ");        
        int num = s.nextInt();        
        if (num > 0) 
        {            
            System.out.println("Positive");        
        } 
        else if (num < 0) 
        {            
            System.out.println("Negative");        
        } 
        else 
        {            
            System.out.println("Zero");        
        }        
           
    }
}