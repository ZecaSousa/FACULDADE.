import java.util.Scanner;

public class indice {

    public static void main(String[] args) {

        double fahrenheit;
        double celsius;
        double conversao = 32.;
        double fator = 5.0 / 9;

        Scanner input = new Scanner(System.in);

        System.out.println("qual a temperatura atual em fahrenheit? \n");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - conversao) * fator;

        if (celsius <= -40.0) {
            System.out.println("a temperatura atualmente e de: " + celsius);
            System.out.println("frio extremo");
        }
        if (celsius <= -27) {
            System.out.println("a temperatura atualmente e de: " + celsius);
            System.out.println("frio muito elevado\n");
        } else if (celsius <= -13) {
            System.out.println("a temperatura atualmente e de: " + celsius);
            System.out.println("frio elevado");
        } else if (celsius <= 9) {
            System.out.println("a temperatura atualmente e de: " + celsius);
            System.out.println("frio ligeiro");
        } else if (celsius <= 26) {
            System.out.println("a temperatura atualmente e de: " + celsius);
            System.out.println("termico");
        } else if (celsius <= 32) {
            System.out.println("a temperatura atualmente e de: " + celsius);
            System.out.println("calor moderado ");
        } else if (celsius <= 38) {
            System.out.println("a temperatura atualmente e de: " + celsius);
            System.out.println("calor elevado ");
        } else if (celsius <= 46) {
            System.out.println("a temperatura atualmente e de: " + celsius);
            System.out.println("calor muito elevado ");
        } else if (celsius > 46) {
            System.out.println("a temperatura atualmente e de: " + celsius);
            System.out.println("calor extremo");
        }

        input.close();

    }
}
