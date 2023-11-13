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

        System.out.print("A: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

         System.out.print("B: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i]);
            if (i < b.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

         System.out.print("C: [");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i < c.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
