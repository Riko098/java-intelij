package estrutura_repetitivas.for1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double a, b, c;
        double mediaPonderada = 0;

        for (int i = 1; i <= n; i++) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            mediaPonderada = (a * 2 + b * 3 + c * 5) / 10;
            System.out.printf("%.1f\n", mediaPonderada);
        }

        sc.close();
    }
}
