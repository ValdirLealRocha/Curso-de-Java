// Aula 02 - https://youtu.be/xap-zvN8pOc?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Comandos de impressão e primeiras prática com variáveis - Curso de Java - Aula 02
// Classe principal do Java.
public class CursoJavaAula02 {
  // Main principal função do Java
  public static void main(String[] args) {
    // Variaveis - tipo e nome - tipagem forte

    int n1 = 10; // Numérico
    int n2 = 20; // Numérico
    int n3 = 30; // Numérico
    int res = n1 + n2 + n3; // Somatória
  
    String nome = "Valdir testando..."; // Texto

    // Mostrar mensagem na linha de comando...
    System.out.print("1 - Primeiro comando na tela!"); // Sem quebrar linha
    System.out.print("2 - Primeiro comando na tela!\n"); // Com quebra de linha
    System.out.println("3 - Primeiro comando na tela!"); // Quebra de linha automático
    System.out.printf("4 - Texto: %s - Ano: %d\n","Primeiro comando na tela!",2021); // Com fortmatação
    System.out.printf("5 - Texto: %s %n Ano: %d%n","Primeiro comando na tela!",2021); // Com fortmatação
    System.out.printf("6 - Valor da variável -> Soma: %d - Nome: %s", res, nome); // Com fortmatação
  }
}
