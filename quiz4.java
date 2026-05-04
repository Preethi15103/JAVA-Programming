import java.util.*;
class quiz4
{
    public static void main(String[] args)
    {
        String s = "hello"; 
        char[] ch = s.toCharArray(); 
        System.out.println(ch[1]);

        int[][] a = new int[2][2];
        System.out.println(a[0][1]);

        int[] src = {1,2,3};
        int[] copy = Arrays.copyOf(src, 5);
        System.out.println(Arrays.toString(copy));

        int[] b = new int[]{1,2,3}; 
        System.out.println(b.length * b[0]);

        int[] arr = new int[3];
        System.out.println(arr[1]);

        int[] ar = {3,1,2}; 
        Arrays.sort(ar); 
        System.out.println(Arrays.toString(ar));

        int[][] c = {{1,2}, {3,4}};
        System.out.println(c[1][0]);

        int[] d = {1,2,3,4};
        System.out.println(d.length);

        String[] str = new String[3]; 
        System.out.println(str[0]);

        int[] arra = new int[0]; 
        System.out.println(arra.length);

        // int[] arl = null; 
        // System.out.println(arl.length);

        int[] nums = {10, 20, 30};
        for (int x : nums) {
            System.out.print(x + " ");
        }

        int[][] z = new int[2][];
        z[0] = new int[2];
        z[1] = new int[4];
        System.out.println(z[1].length);

        int[] sr = {10,20,30,40,50};
        int[] dest = new int[5];
        System.arraycopy(sr, 0, dest, 0, 2);
        System.out.println(Arrays.toString(dest));

        final int[] y = {1,2,3}; 
        y[0] = 10; 
        System.out.println(y[0]);
    }
}