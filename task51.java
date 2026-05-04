import java.util.Random;
import java.util.Arrays;
class task51 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        System.out.println("ID: " + rand.nextInt(1000));
        System.out.println("Marks: " + rand.nextDouble() * 100);
        System.out.println("Attendance: " + rand.nextFloat() * 100);
        System.out.println("Status: " + (rand.nextBoolean() ? "Pass" : "Fail"));
        System.out.println("Reg No: " + rand.nextLong());
        System.out.println("Performance: " + rand.nextGaussian() * 10);
        byte[] by = new byte[5];
        rand.nextBytes(by);
        System.out.println("Bytes: " + Arrays.toString(by));
        System.out.println("5 Numbers: " + Arrays.toString(rand.ints(5, 0, 100).toArray()));
    }
}
