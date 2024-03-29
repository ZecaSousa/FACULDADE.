import java.util.Scanner;

public class somadenumero {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner input = new Scanner(System.in);

        System.out.println("qual o valor do primeiro numero para a somar: ");
        number1 = input.nextInt();

        System.out.println("qual o valor do segundo numero para a somar: ");
        number2 = input.nextInt();

        int soma = number1 + number2;

        System.out.println("o valor e : " + soma);

        input.close();
    }
}
