class task41 
{
    public static void main(String[] args) 
    {
        String name = "Arun";
        String city = "Chennai";
        String hobby = "Cricket";
        StringBuilder s = new StringBuilder();
        s.append(name);
        s.append(" FROM ");
        s.append(city);
        s.append(" LOVES ");
        s.append(hobby);
        String op = s.toString().toUpperCase();
        System.out.println(op);
    }
}