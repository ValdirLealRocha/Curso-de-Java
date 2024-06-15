// Aula 30 - https://youtu.be/h-DohVfEslo?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Métodos que irão facilitar sua vida ao trabalhar com Arrays em Java - Curso de Java - Aula 30

import java.util.Arrays;

public class CursoJavaAula30 {

  public static void main(String[] args) {
    // declaração de variáveis
    // Arrya com n indices para passar pra função
    int[] num = {9, 5, 0, 7, 4, 2, 6, 3, 1, 8};
  
    System.out.print("\nnum ordenado...*********************************\n");
    // ordenação do array
    Arrays.sort(num); // ordena crescente...
    // lista o array...
    for(int n : num) {
      System.out.printf("%d - ", n);
    }
  
    System.out.print("\nnum2 preenchido com 10 em todos os elementos...*********************************\n");
    // preenchimento em array com valor único
    int[] num2 = new int[10];
    Arrays.fill(num2, 10); // preenche todos os elementos com o valor informado...
    // lista o array...
    for(int n : num2) {
      System.out.printf("%d - ", n);
    }
  
    System.out.print("\nnum copiado para num2...*********************************\n");
    // cópia de um array...  num em num2
    System.arraycopy(num, 0, num2, 0, num.length); // copia array num em num2
    // lista o array...
    for(int n : num2) {
      System.out.printf("%d - ", n);
    }
  
    System.out.print("\ncompara arrays...*********************************\n");
    // compara igualdade entre arrays...
    int[] num_1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] num_2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] num_3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    int[] num_4 = {10, 4, 7, 23, 4, 10, 8, 0, 4, 9};
    // lista o array...
    System.out.printf("num_1 é igual a num_2: %s%n", (Arrays.equals(num_1, num_2) ? "Igual" : "Diferente"));
    System.out.printf("num_1 é igual a num_3: %s%n", (Arrays.equals(num_1, num_3) ? "Igual" : "Diferente"));
    System.out.printf("num_1 é igual a num_4: %s%n", (Arrays.equals(num_1, num_4) ? "Igual" : "Diferente"));

    System.out.print("\npesquisa binária...*********************************\n");
    // Binary Search
    // caso encontre o elemento retorna o indice do elemento
    // se não encontrar retorna valor negativo
    int valor = 100;
    int pos = Arrays.binarySearch(num_1, valor);
    System.out.printf("%n%d está no array? %s - posição: %d%n", valor, (pos > -1 ? "Sim" : "Não"), pos);
    //
    valor = 5;
    pos = Arrays.binarySearch(num_1, valor);
    System.out.printf("%n%d está no array? %s - posição: %d%n", valor, (pos > -1 ? "Sim" : "Não"), pos);
    // no caso abaixo não vai encontra, pois o array não está ordenado...
    valor = 7; // muito embora o elemento esteja em num_4...
    pos = Arrays.binarySearch(num_4, valor);
    System.out.printf("não ordenado! %n%d está no array? %s - posição: %d%n", valor, (pos > -1 ? "Sim" : "Não"), pos);
    // add a ordenação no array
    Arrays.sort(num_4); // agora vai listar o elemento e sua posição...
    valor = 7; // muito embora o elemento esteja em num_4...
    pos = Arrays.binarySearch(num_4, valor);
    System.out.printf("ordenado! %n%d está no array? %s - posição: %d%n", valor, (pos > -1 ? "Sim" : "Não"), pos);

    System.out.print("\nFIM DO PROGRAMA!!!\n");
  }
}