import java.util.*;
class math
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        //Absolute
        int n = -50;
        System.out.println("Absolute : "+Math.abs(n));

        //Maximum
        int a=45;
        int b=33;
        System.out.println("Maximum : "+Math.max(a,b));

        //Minimum
        int x=450;
        int y=330;
        System.out.println("Minimum : "+Math.min(x,y));

        //Power
        int c=3;
        int d=5;
        System.out.println("Power : "+Math.pow(c,d));

        //Square root
        int e=8;
        System.out.println("Square root : "+Math.sqrt(e));

        //Cube root
        int f=5;
        System.out.println("Cube root : "+Math.cbrt(f));

        //Ceil
        double g = 1.25345;
        System.out.println("Ceil : "+Math.ceil(g));

        //Floor
        double h = 1.5369;
        System.out.println("Floor : "+Math.floor(h));

        //Round
        double i = 6.47545;
        System.out.println("Round : "+Math.round(i));

        //Sine
        int ang1 = 45;
        double rad1 = Math.toRadians(ang1);
        System.out.println("Sine : "+Math.sin(rad1));

        //Cosine
        int ang2 = 60;
        double rad2 = Math.toRadians(ang2);
        System.out.println("Cosine : "+Math.cos(rad2));

        //Tangent
        int ang3 = 45;
        double rad3 = Math.toRadians(ang3);
        System.out.println("Tangent : "+Math.tan(rad3));
    }
}