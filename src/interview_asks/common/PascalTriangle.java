package interview_asks.common;

public class PascalTriangle {
    public static void main(String[] args) {

        printPascals(5);
    }

    public static void printPascals(int rows) {

        System.out.println("1 ");

        for (int i = 1; i <= rows; i++) {
            System.out.print("1 ");
            for (int j = 1; j <= i; j++) {
                int v = fact(i) / (fact(j) * fact(i - j));
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static int fact(int n) {
        int fact = 1;

        if (n == 0)
            return 1;
        else {
            for (int i = 1; i <= n; i++)
                fact = fact * i;
        }

        return fact;
    }
}
