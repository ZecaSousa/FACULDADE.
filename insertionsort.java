

public class insertionsort {
    public static void main(String[] args) {
 
          int lista [] = new int [5];
          lista[0] = 4;
          lista[1] = 6;
          lista[2] = 214;
          lista[3] = 42;
          lista[4] = 44;
        // declarando os valores que serao amarzenado no array
            for ( int i= 0; i < lista.length - 1; i++) {
                // para  a variavel int i comeca no index 0 e i for menor que a
                // dimensao do meu array menos 1 pois nao quero testar outra posicao
                for ( int j = i + 1; j < lista.length; j++){
                    // para a variavel j para comparar com a posicao seguinte de i
                    // vou esta comparando com cada posicao do array
                    if ( lista[i]> lista[j]){
                        //se o numero na posicao i for maior que o numero na 
                        //posicao j testar
                    int cont = lista[j];
                    //vou esta criando uma variavel auxiliar para esta armazenando
                    // um dos dois valores para serem trocados que esta na posicao i
                    lista[i] = lista [j];
                    // vou salvar o nuemro na posicao i para o numero que esta na posicao j
                    lista [j] = cont;
                    // agora vou ir na variavel j e recolocar oque esta la na variavel cont
                    //  

                    }
                }
            }
            
        for (int i = 0; i < lista.length; i++){
            System.out.println(i + lista[i]);
          
        }
    }

}
   


