import java.util.Scanner;

public class Roteiro1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("informe o seu nome");
        nome = input.nextLine();

        System.out.printf("Nome informado %s\n", nome);

        System.out.println("qual a sua idade?");
        idade = input.nextInt();

        System.out.println("idade informada \n" + idade);

        input.close();

    }
}
