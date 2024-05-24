// Aula 08 - https://youtu.be/XKDSNSJvlxM?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Matrizes em Java - Curso de Java - Aula 08

// Gerar numeros randomicos
//import java.security.SecureRandom;

public class CursoJavaAula08 {

  public static void main(String[] args) {
    
    // Um array é uma coleção de variaveis do mesmo tipo
    // Uma matriz é uma coleção de arrays, onde terei indice de linhas e indice de colunas
    // final int linhas = 3;
    // final int colunas = 5;

    // matriz
    //int[][] numeros = new int[linhas][colunas];

    // for tradicional
    // for(int l = 0; l< linhas; l++){ // le/percorre o indice da linha
    //   for(int c = 0; c < colunas; c++){ // le/percorre o indice da coluna
    //     numeros[l][c] = new SecureRandom().nextInt(100); // Gera um número randômico de 0 a 99 que é igual a 100
    //   }
    // }
    
    // for tradicional pra listar a matriz preenchida
    /*for(int l = 0; l< linhas; l++){ // le/percorre o indice da linha
      for(int c = 0; c < colunas; c++){ // le/percorre o indice da coluna
        // "%2d" - define duas posicoes "9" = " 9", se mudar SecureRandom().nextInt(100)
        // ajustar o tamanho das casas em "%2d | "
        System.out.printf("%2d | ", numeros[l][c]); 
      }
      System.out.print("\n");
      // Exemplo de saida do for acima
      // 20 | 75 | 97 | 66 | 39 | 
      // 89 | 38 | 54 | 53 | 34 |
      // 28 |  4 | 12 | 36 |  6 |    >>> definindo o tamanho tudo fica alinhadinho...
    }*/  

    // // for para array/matriz
    // for(int[] n:num){
    //   for(int v:n){
    //     System.out.printf("%3d | ", v); 
    //   }
    //   System.out.print("\n");
    // }

    // Criar uma matriz e inicializar... 3 linhas por 5 colunas...
    int [][] num = { { 10,  20,  30,  40,  50},
                     {  1,   2,   3,   4,   5},
                     {100, 200, 300, 400, 500} };

    // for para array/matriz
    for(int[] n:num){
      for(int v:n){
        System.out.printf("%3d | ", v); 
      }
      System.out.print("\n");
    }
  }
}