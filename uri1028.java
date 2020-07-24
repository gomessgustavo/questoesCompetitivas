package uri;

import java.util.Scanner;

public class uri1028 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int n = 0, f1, f2;
        double res;
        n = tc.nextInt();

        for (int i = 0; i < n; i++) {
            f1 = tc.nextInt();
            f2 = tc.nextInt();
            System.out.println((int)figurinha(f1, f2));
        }

    }


    private static double figurinha(int f1, int f2) {

        double menorNum = 0, maiorNum = 0, res = 0;

        if (f1 > f2) {
            menorNum = f2;
            maiorNum = f1;
        } else {
            menorNum = f1;
            maiorNum = f2;
        }
        double j = menorNum;
        for (; ; ) {

            if (((menorNum % j) == 0) && ((maiorNum % j) == 0)) {
                return j;
            }


            j--;
        }


    }
}



