import java.util.Scanner;

public class semanascomswitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int diadasemana;

        System.out.println("qual o numero do dia da semana que vc deseja saber?");
        diadasemana = input.nextInt();

        switch (diadasemana) {
            case 1:
                System.out.println("segunda feira");
                break;
            case 2:
                System.out.println("terca feira");
                break;
            case 3:
                System.out.println("quarta feira");
                break;
            case 4:
                System.out.println("quinta feira");
                break;
            case 5:
                System.out.println("sexta feira");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;

            default:
                break;
        }
        input.close();
    }
}
