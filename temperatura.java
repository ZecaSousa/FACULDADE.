import java.util.Scanner;
import java.util.Date;

public class temperatura {

    public static void main(String[] args) {

        double fahrenheit;
        double celsius;
        double conversao = 32.;
        double fator = 5.0 / 9;
        Date data = new Date();

        Scanner input = new Scanner(System.in);

        System.out.println("qual a temperatura em fahrenheit atualmente?\n");
        fahrenheit = input.nextDouble();

        System.out.println("exatamente \n" + data);

        celsius = (fahrenheit - conversao) * fator;
        System.out.println("a temperatura do ambiente em celsius e de:\n " + celsius);

        input.close(); // para todo input de scanner precisamos fechar tambem ele
        // entao precisa
        // realizar esse comando

    }
}
