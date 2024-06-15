// Aula 31 - https://youtu.be/pTkJCBW_Q60?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Como passar parâmetros para o programa? [String[] args] - Curso de Java - Aula 31

public class CursoJavaAula31 {

  public static void main(String[] args) {
    // declaração de variáveis
    int soma = 0;

    System.out.print("\n-------------------------------------------\n");

    // valida parametros da linha de comando terminal...
    if(args.length <= 0) {
      System.out.printf("%s%n", "Sem valores para serem somados!");
      return;
    }

    // soma os valores dos argumentos recebidos da linha de comando...
    for(String n : args) {
      System.out.printf("%s%n", n);
      //soma += (v);
    }

    System.out.print("\nFIM DO PROGRAMA!!!\n");
  }
}