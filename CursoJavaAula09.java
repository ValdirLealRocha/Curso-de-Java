// Aula 09 - https://youtu.be/yf8FQem1JMg?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Entendendo Métodos em Java - Curso de Java - Aula 09
public class CursoJavaAula09 {

  // main é um método principal da classe
  // main é o primeiro método da classe que deve ser executado
  public static void main(String[] args) {
    
    int r; // variavel para o método soma.

    // O que é um método, é uma função criada pra classe.
    // for(int i = 0; i < 10; i++){
    //   canal(); // Após criar o méto, deve chamar o método apara ele ter efeito de execução...
    // }

    // msg("CFB Cursos");
    // msg("Curso de Java");
    msg("Bruno", 5);

    r = soma(10, 5);
    System.out.printf("Soma igual a: %d \n", r); 
    System.out.println(soma2(10, 5)); 
    System.out.println(soma(1, 5, 10, 3, 20, 2)); 
    System.out.println(soma(2.5, 2.5)); 
  }

  // Para se criar um método, vamos seguir a seguinte estrutura 
  // sempre indicar: 
  // modificador de acesso - public static
  // tipo de retorno - void/string/inteiro/objeto/...
  // o nome - main
  // conjunto de parametro deste método - (String[] args)

  // quando o método principal é static os demais métodos a partir dele deve ser static
  // sem retorno = void
  public static void canal(){
    System.out.println("CFB Cursos");
  }

  // Não retorna nada e recebe 2 parametros
  public static void msg(String m, int l){
    for(int i = 0; i < l;i++){
      System.out.println(m);      
    }
  }

  // Retorna um inteiro e recebe 2 parametros
  public static int soma2(int n1, int n2){
    return n1 + n2;
  }

  // Retorna um inteiro e recebe n parametros - lista de valores do mesmo tipo
  public static int soma(int... numeros){
    int res = 0;
    for(int n:numeros){
      res += n;
    }
    return res;
  }

  // Retorna um double e recebe n parametros - lista de valores do mesmo tipo
  // Exemplo de métdo de sobre carga, mantem o mesmo nome mas muda os tipos das variaveis
  public static Double soma(Double... numeros){
    Double res = 0.0;
    for(Double n:numeros){
      res += n;
    }
    return res;
  }
}