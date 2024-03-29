import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("qual a sua idade?");
        idade = input.nextInt();
        if ((idade >= 18) && (idade < 100)) {
            System.out.println("Parabens voce e maior de idade " + idade + " anos!!!! ");
        } else if (idade < 18) {
            System.out.println("Infelizmente voce nao e maior de idade " + idade + " anos !!!!");
        } else if (idade >= 100) {
            System.out.println("Infelizmente voce ja deveria estar morto goodbye XD");
        }

        input.close();
    }

}
