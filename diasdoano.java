import java.util.Scanner;

public class diasdoano {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int diadano;

        System.out.println("qual o valor de 1 a 366 no ano bissexto que eu digo dia e mês correspondente?");
        diadano = imput.nextInt();

        int dia = (366 - diadano) / 12;

        if (diadano <= 31) {
            System.out.println("Voce esta em " + dia + " janeiro");

        } else if (diadano <= 60) {
            System.out.println("Voce esta em " + dia + " fevereiro");

        } else if (diadano <= 91) {
            System.out.println("Voce esta em " + dia + " março");

        } else if (diadano <= 121) {
            System.out.println("Voce esta em " + dia + " abril");

        } else if (diadano <= 152) {
            System.out.println("Voce esta em " + dia + " maio");

        } else if (diadano <= 182) {
            System.out.println("Voce esta em " + dia + " junho");

        } else if (diadano <= 213) {
            System.out.println("Voce esta em " + dia + " julho");

        } else if (diadano <= 244) {
            System.out.println("Voce esta em " + dia + " agosto");

        } else if (diadano <= 274) {
            System.out.println("Voce esta em " + dia + " setembro");

        } else if (diadano <= 305) {
            System.out.println("Voce esta em " + dia + " outubro");

        } else if (diadano <= 335) {
            System.out.println("Voce esta em " + dia + " novembro");

        } else if (diadano <= 366) {
            System.out.println("Voce esta em " + dia + " dezembro");

        }

        imput.close();

    }
}
