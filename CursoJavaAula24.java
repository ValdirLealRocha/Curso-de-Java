// Aula 24 - https://youtu.be/d3z3FDtVoDw?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Como criar e manipular Array em Java [Aprenda nesta aula] - Curso de Java - Aula 24
public class CursoJavaAula24 {

  public static void main(String[] args) {
    // declaração de variáveis
    final int tamanho = 7; // constante
    int[] num = new int[tamanho]; // array com 5 elementos, equevalem a cinco variáveis...

    // poderia inicializar o array direto...,
    int[] num1 = {52, 100,3, 15, 527, 112, 79};

    System.out.print("\n-----------------------------------------\n");

    // Java inicializa auto com 0...
    System.out.printf("\n%d\n", num[0]);

    System.out.print("\n-----------------------------------------\n");

    // inicializar os elementos do array...
    num[0] = 52;
    num[1] = 100;
    num[2] = 3;
    num[3] = 15;
    num[4] = 527;
    num[5] = 112;
    num[6] = 79;

    // Mosytra os elementos/indices...
    System.out.printf("num[0] = %d\n", num[0]);
    System.out.printf("num[1] = %d\n", num[1]);
    System.out.printf("num[2] = %d\n", num[2]);
    System.out.printf("num[3] = %d\n", num[3]);
    System.out.printf("num[4] = %d\n", num[4]);

    System.out.print("\n-----------------------------------------\n");
    // looping para percorrer o Array For...
    for(int i = 0; i < num.length; i++) {
      System.out.printf("num[" + i + "] = %d\n", num[i]);
    }

    System.out.print("\n-----------------------------------------\n");
    // looping especial para percorrer o Array...
    for(int n: num) {
      System.out.printf("%d%n", n);
    }

    System.out.print("\n-----------------------------------------");
    System.out.print("\n-----------------------------------------");

  }

}