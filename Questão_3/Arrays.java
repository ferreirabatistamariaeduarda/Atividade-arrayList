package Questão_3;

public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = i + 1;
            b[i] = (i + 1) * 2;
        }

        
        for (int i = 0; i < 10; i++) {
            c[i] = a[i] * b[i];
        }

        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));
        System.out.println("C: " + Arrays.toString(c));
    }

    private static String toString(int[] a) {
        return null;
    }
}
