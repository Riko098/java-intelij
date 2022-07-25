package estrutura_repetitivas;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Date data = new Date();
        System.out.println(data);
        Date data2 = new Date(2022, 07, 25);
        System.out.println(data2);
        if (data.equals(data2)) {
            System.out.println("É a data de hoje");
        } else {
            System.out.println("Não é a data de hoje");
        }
    }
}
