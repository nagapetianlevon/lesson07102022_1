import java.util.Scanner;
public class Main {
    public static void InputMass(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 10 + (int) (Math.random() * (100 - 10 + 1));
        }
    }

    public static void InputMass(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {


                a[i][j] = 10 + (int) (Math.random() * (100 - 10 + 1));
            }
        }
    }

    public static void OutputMass(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void OutputMass(int[][] a) {
        for (int i = 0; i < a.length; i++) {

            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] MinMax(int[] a) {
        int max = 0;
        int min = 0;
        int i = 1;
        while (i < a.length) {
            if (a[i] >= a[max])
                max = i;
            if (a[i] <= a[min])
                min = i;
            i++;
        }
        int[] result = new int[2];
        result[0] = min;
        result[1] = max;
        return result;
    }

    public static void Out(int[] res, int[] a) {
        System.out.println(res[0] + " " + res[0]);
        System.out.println(res[1] + " " + res[1]);

    }

    public static void Reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int k = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = k;

        }
    }

    public static void Sdvig_LK(int[] a, int k)
    {

        for (int i = 0; i < k; i++) {


            int c = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = c;
        }

    }

    public static void rotRight(int[]a)
    {

            int c = a[a.length - 1];
            for (int j = 0; j < a.length - 1; j++) {
                a[a.length - 1 - j] = a[a.length - 2 - j];
            }
            a[0] = c;

    }

    static void pringG()
    {
        System.out.println("G= " + G);
    }

    static final double G = 6.6720e-10;
    static int x;
    static int y;
    static {
        x = 5;
        y = 100;
    }
    static int Summ(int a, int b)
    {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        pringG();
        System.out.println();
        double PI = Math.PI;
        int z = Summ(1, 1);
        System.out.println(z);

        /*int n = in.nextInt();
        int[] a = new int[n];
        InputMass(a);
        OutputMass(a);*/

        // Reverse(a);
     //   Sdvig_LK(a, 4);
        /*rotRight(a);

        OutputMass(a);*/
//        InputMass(b);
        int [][] matrix = new int[10][10];
        InputMass(matrix);
        OutputMass(matrix);


    }
}
