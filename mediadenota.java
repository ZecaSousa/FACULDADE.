import java.util.Scanner;

public class mediadenota {

    public static void main(String[] args) {
        int a1;
        int a2;
        int a3;
        int notageral;

        Scanner input = new Scanner(System.in);

        System.out.println("qual a nota que tirou na primeira avaliação?");
        a1 = input.nextInt();

        System.out.println("qual a nota que tirou na segunda avaliação?");
        a2 = input.nextInt();

        System.out.println("qual a nota que tirou na terceira avaliação?");
        a3 = input.nextInt();

        notageral = a1 + a2 + a3;
        if ((a1 <= 30) && (a2 <= 30) && (a3 <= 30)) {
            if (notageral >= 70) {
                System.out.println("Sua nota geral no semestre foi de: " + notageral);
                System.out.println("parabens voce esta aprovado nesse semestre!");
            }

        }

        input.close();

    }

}
