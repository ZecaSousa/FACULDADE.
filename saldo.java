import java.util.Scanner;

public class saldo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo;

        System.out.println("qual o valor que esta em sua conta bancaria?");
        saldo = input.nextDouble();

        if (saldo == 0) {
            System.out.println("infelizmente sua conta esta com saldo zerado!! va trabalhar... " + saldo);
        } else if (saldo > 0) {
            System.out.println("Seu saldo e de " + saldo + " e esta positiva sua conta bancaria.");
        } else if (saldo < 0) {
            System.out.println("infelizmente sua conta esta com saldo negativo! va trabalhar. " + saldo);
        }
        input.close();
    }
}

/*
 * Programa que leia saldo da conta de um cliente que se for negativo imprimir
 * uma frase
 * se for positivo mostrar o saldo e dizer pagamento concluido
 * 
 * imprimir para o usuario
 * "Digite o valor presente em sua conta bancaria precisamente" e armazenar isso
 * em uma variavel com nome saldo
 * buscar a variavel salario e realizar uma estrutura de condicao que se for um
 * saldo positivo imprimir
 * "Seu saldo e de *** e esta positiva sua conta bancaria"
 * se o valor armazenado na variavel saldo for igual a zero imprimir para o
 * usuario que "infelizmente sua conta esta com saldo zerado!! va trabalhar"
 * se o valor armazenado na variavel saldo for de um numero negativo imprimir
 * para o usuario que
 * "infelizmente sua conta esta com saldo negativo! va trabalhar."
 * 
 */