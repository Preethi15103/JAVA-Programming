import java.util.*;
class quiz3{
    public static void main(String[] args){
        //while(1) 
        //System.out.println("Hi");
        for(int i=1;i<=2;i++) 
        { 
            for(int j=1;j<=2;j++) 
            { 
                System.out.print(i+j+" "); 
            } 
        }
        int i=0; 
        do 
        { 
            System.out.print(i); 
        } while(i>0);
        Scanner sc = new Scanner(System.in); 
        //int x = sc.nextInt(); 
        //double y = sc.nextDouble(); 
        //System.out.println(x + " " + y);
        //for(int j=1;j<=5;j++)
        //{ 
            //if(j==3) 
            //break; 
        //System.out.println(i); 
        //}
        for(int k=0; k<3; k++) 
        {
            System.out.println(k+" ");
        }
        for(int j=1;j<=5;j++)
        { 
            if(j==3) 
            continue; 
            System.out.print(j); 
        }
        int marks = 75;
if(marks > 90)
  System.out.print("A");
else if(marks > 75)
  System.out.print("B");
else if(marks >= 75)
  System.out.print("C");
else
  System.out.print("D");
int n = 5;
if(n > 2)
  if(n > 10)
    System.out.print("A");
  else
    System.out.print("B");
else
  System.out.print("C");

int a=1; 
while(a<=3)
 System.out.print(a++);
int x = sc.nextInt();
if(x > 0)
  System.out.print("Positive");
else if(x == 0)
  System.out.print("Zero");
else
  System.out.print("Negative");

//for(int t=1; t<=5; t++); 
//System.out.print(t);
int t = 2;
switch(t) {
  case 1:
    System.out.print("A");
  case 2:
    System.out.print("B");
  case 3:
    System.out.print("C");
  default:
    System.out.print("D");
}

int r=5; 
while(r-- > 0); 
System.out.print(r);

int v = 20;
if(v > 10)
  if(v < 30)
    System.out.print("P");
  else
    System.out.print("Q");

for(;;) 
    System.out.println("Hello");
    }
}