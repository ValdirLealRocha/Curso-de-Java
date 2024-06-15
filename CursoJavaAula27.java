// Aula 27 - https://youtu.be/e3XPo58ltIw?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Passando Arrays como parâmetros para funções - Curso de Java - Aula 27

public class CursoJavaAula27 {

  public static void main(String[] args) {
    // declaração de variáveis
    // // Toda string é um array de caracteres...
    // String nome = "Bruno";
    // for(char c : nome.toCharArray()) {
    //   System.out.printf("%c ", c);
    // }

    // Array de números
    int[] numeros = {10, 5, 15, 20, 100, 25, 14, 8, 3, 98, 75, 62};

    // chama uma função/método para listar o Array, pares e impares...
    parImpar(numeros);
  }

  // função/método para listar o Array, pares e impares...
  public static void parImpar(int[] num) {
    for(int n:num) {
      if(n % 2 == 0) { // operador mod...
        System.out.printf("1 - %d: %s%n", n, "Par");
      }else {
        System.out.printf("1 - %d: %s%n", n, "Ímpar");
      }
    }

    System.out.print("\n*****************************************************\n");

    // função/método para listar o Array, pares e impares...
    for(int n:num) {
      // operador mod...
      System.out.printf("2 - %d: %s%n", n, ((n % 2 == 0 ) ? "Par" :"Ímpar"));
    }
  }

}