import java.util.Random;
import java.util.Arrays;
class random
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        System.out.println(rand.nextInt(10));
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextGaussian());
        byte[] by = new byte[5];
        rand.nextBytes(by);
        System.out.println(Arrays.toString(by));
    }
}