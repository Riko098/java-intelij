package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String senha = sc.next();

      while (senha.equals("2002") == false){
          System.out.println("Senha Invalida");
          System.out.println("Digite novamente a senha");
          senha = sc.next();
          if (senha.equals("2002")) {
              System.out.println("Acesso permitido");
          }
      }
        sc.close();
    }
}