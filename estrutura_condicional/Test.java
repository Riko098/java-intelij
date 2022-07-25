package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }



        sc.close();

    }

}

