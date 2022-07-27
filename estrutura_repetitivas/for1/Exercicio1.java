package estrutura_repetitivas.for1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i < x ; i++) {
            if( i % 2 != 0){
                System.out.printf("%d\n", i);
            }
        }

        sc.close();
    }
}
