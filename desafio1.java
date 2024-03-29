import java.util.Scanner;

public class desafio1 {
    /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

    public static void main(String[] args) {
        
        
        int calculo;

        Scanner input = new Scanner(System.in);

        System.out.println("digite qual calculo deseja fazer? \n 1: área do triângulo retângulo \n 2: a área do círculo de raio \n 3: a área do trapézio \n 4: a área do quadrado \n 5: a área do retângulo \n");
        calculo = input.nextInt();

        if (calculo == 1) {

            double a;
            double c;
            double area;

            System.out.println("qual o tamanho da base do triangulo retangulo? ");
        a = input.nextDouble();

        System.out.println("qual a altura do triangulo retangulo? ");
        c = input.nextDouble();

        area = (a * c) /2;

        System.out.println("a area do triangulo retangulo e de: " + area);
            
        }
        if (calculo == 2) {
            float pi = 3.14159f;
            float raio;
            float areadocirculo;

            System.out.println("qual o raio do circulo? ");
            raio = input.nextFloat();

            areadocirculo = pi * (raio * raio);

            System.out.println("a area do circulo e de: " + areadocirculo);
           
        }
        if (calculo == 3) {
            float bsinferior;
            float bssuperior;
            float altura;
            float areadotrapezio;

            System.out.println("qual o valor da base inferior do trapezio? ");
            bsinferior = input.nextFloat();

            System.out.println("qual o valor da base superior do trapezio? ");
            bssuperior = input.nextFloat();

            System.out.println("qual o valor da altura do trapezio? ");
            altura = input.nextFloat();

            areadotrapezio = (bsinferior + bssuperior) * altura /2;

            System.out.println("a area do trapezio e de: " + areadotrapezio);
            
        }
        if (calculo == 4) {
            float lquadrado;
            float areaquadrado;

            System.out.println("qual o valor do lado do quadrado? ");
            lquadrado = input.nextFloat();

            areaquadrado = lquadrado * lquadrado;

            System.out.println("a area do quadrado e de: " + areaquadrado);
            
        }
        if (calculo == 5) {
            float bretangulo;
            float aretangulo;
            float arearetangulo;

            System.out.println("qual o valor da base do retangulo? ");
            bretangulo = input.nextFloat();

            System.out.println("qual o valor da altura do retangulo? ");
            aretangulo = input.nextFloat();

            arearetangulo = bretangulo * aretangulo;

            System.out.println("a area do retangulo e de: " + arearetangulo);

        }
        else if (calculo > 5) {
            System.out.println("Opcao invalida.\nReinicie o programa para tentar novamente.");
            
        }


        input.close();



// colocar o limitante da variavel das condicionais para nao passar de 5 com um aviso de numero invalido



    }

}
