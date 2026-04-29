class leapyear{
    public static void main(String[] args){
        int yr = 2028;
        if(yr%4 == 0)
        {
            if(yr%100 != 0)
            {
                System.out.println("It is a Leap Year");
            }
            else if(yr%400 == 0)
            {
                System.out.println("It is a Leap Year");
            }
        }
        else 
        {
            System.out.println("It is Not a Leap Year");
        }
    }
}