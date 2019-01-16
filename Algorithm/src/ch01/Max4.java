package ch01;

public class Max4 {
    public static void main(String[] args) {
        System.out.println("max4(a,b,c,d) : "+max4(1,2,3,4));
        System.out.println("min3(a,b,c) : "+min3(1,2,3));
        System.out.println("min4(a,b,c,d) : "+min4(2,3,4,5));

    }

    static int max4(int a, int b, int c, int d) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }
}
