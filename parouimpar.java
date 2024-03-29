import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("digite um numero inteiro para eu verificar se e par: ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("o numero " + numero + " e par");
        } else {
            System.out.println(numero + "  e impar");
        }

        input.close();

    }

}
