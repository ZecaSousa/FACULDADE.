import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        /*criar uma tabuada que recebe um numero interio e fazer uma tabuada que der o valor ate multiplicador de 10
         */
        int menu;

        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao menu principal!!!!");

        System.out.println("Qual das opcoes deseja utilizar? \n 1: Tabuada de soma: \n 2: Tabuada de subtracao: \n 3: Tabuada de multiplicação: \n 4: Tabuada de divisão:");
        menu = input.nextInt();

        if (menu == 1) {
           int nms;
            System.out.println("Qual o valor inteiro que deseja gerar uma tabuada: ");
            nms = input.nextInt();

        System.out.println("\n A tabuada de soma de " + nms );

         for (int x = 1; x <= 10; x++) {

            int resultadosoma = nms + x;
            System.out.println(nms + " + " + x + " = " + resultadosoma );
         }
         } 

         if (menu == 2) {

            int nmsb;
            System.out.println("Qual o valor inteiro que deseja gerar uma tabuada: ");
            nmsb = input.nextInt();

            System.out.println("\n A tabuada de soma de " + nmsb );
            for (int x = 1; x <= 10; x++) {

                int resultadosub = nmsb - x;
                System.out.println(nmsb + " - " + x + " = " + resultadosub );
             }
         }

         if (menu == 3) {
            int nmm;
            System.out.println("Qual o valor inteiro que deseja gerar uma tabuada: ");
            nmm = input.nextInt();

            System.out.println("\n A tabuada de soma de " + nmm );
            for (int x = 1; x <= 10; x++) {

                int resultadomult = nmm * x;
                System.out.println(nmm + " * " + x + " = " + resultadomult );
             }
         }
         if (menu == 4) {
            int nmd;
            System.out.println("Qual o valor inteiro que deseja gerar uma tabuada: ");
            nmd = input.nextInt();

            System.out.println("\n A tabuada de soma de " + nmd );
            for (int x = 1; x <= 10; x++) {

                int resultadodiv = nmd / x;
                System.out.println(nmd + " / " + x + " = " + resultadodiv );
            }
        }



         input.close();
         }
        
        }        
    
