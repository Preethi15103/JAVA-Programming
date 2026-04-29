class op{
    public static void main(String[] args){
        int a = 15;
        int b = 10;
        System.out.println("Arithmatic Operations");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println("Relational Operations");
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        System.out.println("Logical Operations");
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(~b);

        System.out.println("Bitwise Operations");
        System.out.println(a&b);
        System.out.println(a^b);
        System.out.println(a>>1);
        System.out.println(a<<1);

        System.out.println("Ternary Operations");
        System.out.println((a % 2 == 0) ? "Even" : "Odd");
        System.out.println((b % 2 == 0) ? "Even" : "Odd");

        System.out.println("Increment Operations");
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(++b);

        System.out.println("Decrement Operations");
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(b--);
        System.out.println(--b);

        System.out.println(a++ + ++a + --a);
    }
}