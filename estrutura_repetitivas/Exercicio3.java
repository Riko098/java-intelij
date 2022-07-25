package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de combustivel");
        String tipoDeCombustivel = sc.next();
        int qtdGasolina = 0;
        int qtdalcool = 0;
        int qtdDiesel = 0;
        while (!tipoDeCombustivel.equals("4")) {
            if (tipoDeCombustivel.equals("1")) {
                qtdalcool++;
            } else if (tipoDeCombustivel.equals("2")) {
                qtdGasolina++;
            } else if (tipoDeCombustivel.equals("3")) {
                qtdDiesel++;
            } else {
                System.out.println("Tipo de combustivel invalido");
            }
            tipoDeCombustivel = sc.next();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + qtdalcool);
        System.out.println("Gasolina: " + qtdGasolina);
        System.out.println("Diesel: " + qtdDiesel);
        

        sc.close();
    }
}
