public class Firstlab {
    public static void main(String[] args) {
        int[] m = new int[5];
        m[0] = 6;
        m[1] = 1;
        m[2] = 20;
        m[3] = 8;
        int a = 0;
        for(int i = 0; i < 5; i++)
        {
            a = a + m[i];

        }
        System.out.println(a);

        int b = 0;
        int j = 0;
        while(j < 5)
        {
            b = b + m[j];
            j++;
        }
        System.out.println(b);

        int c = 0;
        int x = 0;
        do
        {
            c = c + m[x];
            x++;
        } while(x < 5);
        System.out.println(c);
    }
}
