// Aula 32 - https://youtu.be/aLmr1waxc10?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Aprendendo sobre MATRIZES em JAVA - Curso de Java - Aula 32
// Matriz é um array com duas dimensões, linha e coluna...

import java.security.SecureRandom;

public class CursoJavaAula32 {

  public static void main(String[] args) {
    // declaração de variáveis
    final int linha = 3;
    final int coluna = 5;
    int[][] numeros = new int[linha][coluna];
    //         Colunas
    // Linhas  0 1 2 3 4
    //         1 x x x x
    //         2 x x x x

    System.out.print("\n----------------------------------------------\n");
    // inicializa a matriz com número randomico...
    for(int l = 0; l < linha; l++) {
      for(int c = 0; c < coluna; c++) {
        numeros[l][c] = new SecureRandom().nextInt(100);
      }
    }

    // mostrar a matriz...
    for(int l = 0; l < linha; l++) {
      for(int c = 0; c < coluna; c++) {
        System.out.printf("%d - ", numeros[l][c]);
      }
      System.out.printf("%n");
    }

    System.out.print("\n----------------------------------------------\n");
    iniDados(numeros, linha, coluna);
    impDados(numeros, linha, coluna);
    System.out.print("\n----------------------------------------------\n");

    System.out.print("\nFIM DO PROGRAMA!!!\n");
  }

  // método para inicializar a matriz, dados passados por valor... Cópia dos dados...
  // exceto a matriz e array que sempre são passados por referencia...
  public static void iniDados(int[][] numeros, int linha, int coluna) {
    // inicializa a matriz com número randomico...
    for(int l = 0; l < linha; l++) {
      for(int c = 0; c < coluna; c++) {
        numeros[l][c] = new SecureRandom().nextInt(100);
      }
    }
  }

  // método para listar a matriz, dados passados por valor... Cópia dos dados...
  // exceto a matriz e array que sempre são passados por referencia...
  public static void impDados(int[][] numeros, int linha, int coluna) {
    // mostrar a matriz...
    for(int l = 0; l < linha; l++) {
      for(int c = 0; c < coluna; c++) {
        System.out.printf("%d - ", numeros[l][c]);
      }
      System.out.printf("%n");
    }
  }
}