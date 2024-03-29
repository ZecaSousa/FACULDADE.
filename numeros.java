import java.util.Scanner;
public class numeros {
    public static void main(String[] args){
        
        int valor1;
        int valor2;
        int valor3;
  
        Scanner input = new Scanner(System.in);

        System.out.println("qual o valor do primeiro numero? ");
        valor1 = input.nextInt();

        System.out.println("qual o valor do segundo numero? ");
        valor2 = input.nextInt();

        System.out.println("qual o valor do terceiro numero? ");
        valor3 = input.nextInt();

        if((valor1 < valor2) && (valor1 < valor3)){
            System.out.println("O primeiro número é o menor");
        }
        else if ((valor2 < valor1) && (valor2 < valor3)) {
            System.out.println("o segundo numero e o menor ");
        }
    else if((valor3 < valor1) && (valor3 < valor2)){
        System.out.println("O terceiro número é o menor");
      }
      else{
        System.out.println("Os três números não são diferentes");
      }




     input.close();
    }
}
