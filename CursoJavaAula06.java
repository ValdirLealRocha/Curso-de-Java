// Aula 06 - https://youtu.be/-Hmzi-mhThc?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Como criar Array/Vetor em Java - Curso de Java - Aula 06

import java.util.Scanner; // Pacote para uso da coleta de dados vindas do teclado

public class CursoJavaAula06 {

  public static void main(String[] args) {
    // // De forma simples um array é um conjunto de variáveis do mesmo tipo...
    // // uma variável armazena uma única informação, o array pode armazenar de um a N variáveis,
    // // sendo acesadas por um indice.
    //
    // final int TAM = 5; // inicializa uma constante
    //
    // // coleção de variáveis, ou seja, um array. Como é int já será inicializado com 0
    // //int[] num=new int[5]; // Equivale a esta declaração de modo direto "int n1, n2, n3, n4, n5;"
    // int[] num=new int[TAM]; // Equivale a esta declaração de modo direto "int n1, n2, n3, n4, n5;"
    //
    // // int[] numeros={10, 20, 30, 40, 50}; // inicialização direta no respectivos indices do array
    // // //             0   1   2   3   4
    // int[] numeros={10, 20, 30, 40, 50, 60, 70, 80, 90}; // inicialização direta no respectivos indices do array
    // //             0   1   2   3   4   5   6   7   8
    //
    // // iniciar os indices no array num
    // num[0] = 10;
    // num[1] = 5;
    // num[2] = 15;
    // num[3] = 0;
    // num[4] = 8;
    //
    // //System.out.printf("%d\n", num[0]); // Inicia o indice no 0 e não no 1
    //
    // //System.out.printf("%d\n", numeros[1]); // Inicia o indice no 0 e não no 1
    //
    // // loop FOR mais indicado para os arrays, pois sabemos as interações
    // for(int i=0; i<5;i++){
    //   System.out.printf("numeros[%d]: %d\n", i, numeros[i]); // Inicia o indice no 0 e não no 1
    // }
    //
    // System.out.printf("\n");
    //
    // // loop FOR mais indicado para os arrays, pois sabemos as interações
    // for(int i=0; i<numeros.length;i++){
    //   System.out.printf("numeros[%d]: %d\n", i, numeros[i]); // Inicia o indice no 0 e não no 1
    // }
    //
    // System.out.printf("\n");
    //
    // for(int i=0; i<TAM;i++){
    //   System.out.printf("num[%d]: %d\n", i, num[i]); // Inicia o indice no 0 e não no 1
    // }

    // Gabaritos de provas
    final int TAM = 5;

    char[] gabarito={'a', 'a', 'd', 'b', 'c'};
    char[] respostas=new char[TAM];

    int nota = 0;

    //respostas[0] = 'a';
    //respostas[1] = 'b';
    //respostas[2] = 'c';
    //respostas[3] = 'b';
    //respostas[4] = 'c';
    // Comentado pois no for pedimos pro usuário informar a resposta. 

    Scanner scan = new Scanner(System.in); // Declaração de um objeto e Instancia uma classe

    for(int i = 0; i < TAM; i++){

      System.out.printf("Informe a Resposta %d: ", i);
      respostas[i] = scan.nextLine().charAt(0);

    }

    for(int i = 0; i < TAM; i++){

      if(respostas[i] == gabarito[i]){
        nota++;
      }

    }

    System.out.printf("Nota do Aluno: %d\n", nota);

    scan.close(); // Fecha o objeto instanciado, tirar da memória. Todo objeto deve ser fechado/destuído...
  }

}