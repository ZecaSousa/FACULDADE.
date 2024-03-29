//criar a manipulacao do objeto Account.

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        
        //criar um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        //criar um objeto Account e o atribui a myAccount
        Account myAccount = new Account();

        //exibe o valor inicial do nome (null)
        System.out.printf("Seu nome inicial e: %s%n%n", myAccount.getName());

        //solicia e le o nome 
        System.out.println("por favor insira o nome: ");
        String theName = input.nextLine(); //le uma linha de texto
        myAccount.setName(theName); //insere theName em myAccount
        System.out.println(); //gera a saida da linha em branco

        //exibe o nome armazenado no objeto myAccount
        System.out.printf("o nome do objeto myAccount e: %n%s%n", myAccount.getName());

        
        input.close();

    }

}
