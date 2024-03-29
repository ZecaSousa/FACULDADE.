
public class treindandostrings {
    public static void main(String[] args) {
        System.out.println("ola pessoal".charAt(5)); // buscar o caracter que esta escrito na impressao

        String s = "boa tarde";
        s = s.toUpperCase();
        s = "bom dia";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!!");
        System.out.println(s.startsWith("BOA"));

        var nome = "zeca";
        var sobrenome = "sousa";
        var idade = 33;
        var salario = 15000;

        System.out.println("nome: " + nome + " \nsobrenome: " + sobrenome);

        String frase = String.format("\n\no senhor %s %s tem %d anos e ganha %d \n\n", nome, sobrenome, idade, salario);
        System.out.println(frase);
        System.out.printf("o rapaz %s %s tem %d e ganha %d", nome, sobrenome, idade, salario);// %d sao valores inteiros

    }

}
