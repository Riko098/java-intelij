package estrutura_repetitivas.for1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int contadorIn = 0;
        int contadorOut = 0;
        for(int i = 1; i <= n; i++){
             int numero = sc.nextInt();

             if(numero >= 10 && numero <= 20){
                 contadorIn++;
             }else {
                 contadorOut++;
             }
        }
        System.out.println(contadorIn + " in");
        System.out.println(contadorOut + " out");
        sc.close();
    }
}
