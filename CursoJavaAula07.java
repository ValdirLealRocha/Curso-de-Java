// Aula 07 - https://youtu.be/d5Kl1hAs_A8?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Métodos da classe Array em Java - Curso de Java - Aula 07

// para usar arrays é preciso deste import.
import java.util.Arrays;

public class CursoJavaAula07 {

  public static void main(String[] args) {
    
    //int[] num = {10, 20, 30, 40, 50};    
    
    // lembrando que é assim que criamos uma contante em java
    final int TAM = 10;

    int[] num = {9, 2, 7, 1, 8, 5, 3, 4, 0, 6};
    int[] numeros = new int[TAM];

    int p = 9;
    int pos = 0;

    // // for tradcicional para percorrer um array
    // for(int i=0; i< num.length; i++){
    //   System.out.printf("%d - ", num[i]);
    // }

    // Organiza nosso array em ordem crescente
    //Arrays.sort(num);
    //Arrays.fill(numeros, 10);
    //System.arraycopy(num, 0, numeros, 0, TAM); // copiou num para numeros

    // for mais simplificado e próprio para fazer leitura em array´s, caso contrário use o for normal...
    for(int n:numeros){
      System.out.printf("%d - ", n);
    }

    // compara os arryas num e numeros
    //System.out.printf("Arrays num e numeros são iguais: %s\n", Arrays.equals(num, numeros) ? "Sim" : "Não");

    // Pesquisa um elemento num array
    Arrays.sort(num);
    pos = Arrays.binarySearch(num, p);
    System.out.printf("\nO Elemento %d esta no Array? %s\n", p, (pos > 0) ? "Sim" : "Não");
  }
}