// Aula 17 - https://youtu.be/1HQ9qpUR39E?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Criando Calculadora em Java com Orientação a Objetos - Curso de Java - Aula 17

// Aqui fiz uma mudança do que é apresentado na aula, na aula pede pra criar dois arquivos
// um o calc.java e Numero.java, o que era pra programar no cal.java 
// farei no CursoJavaAuça17.java e mantive normal o Numero.java

// Gerencia entrada via teclado.
import java.util.Scanner;

public class CursoJavaAula17 {

  public static void main(String[] args) {

    // Input de teclado
    Scanner scan = new Scanner(System.in);

    // Cria objetos / Cria instancias do objeto
    Numero n1 = new Numero(); // n1 - númerero a ser digitado
    Numero n2 = new Numero(); // n2 - númerero a ser digitado
    Numero res = new Numero(); // res - resultado

    String opc = "S";

    // //
    // // no bloco abaixo só executa uma soma, um processo e finaliza.
    // //
    // // Input 1
    // System.out.printf("%nDigite o valor 1:");
    // n1.setValor(scan.nextInt());
    //
    // // Input 2
    // System.out.printf("%nDigite o valor 2:");
    // n2.setValor(scan.nextInt());
    //
    // // Calcula resultado, manipula métodos da classe Numero
    // res.setValor(n1.getValor() + n2.getValor());
    // System.out.printf("%nA soma do n1: %d com n2: %d é iguall a Res: %d", 
    //                           n1.getValor(), n2.getValor(), res.getValor());

    // || - or
    // Outra observação, no laço utiliza o método 'equals()' e não o '=='
    while(opc.equals("s") || opc.equals("S")) {
      //
      // Criar um loop para ter um ou vários numeros para a somatória final.
      //
      // Input 1
      System.out.printf("%nDigite o valor 1: ");
      n1.setValor(scan.nextInt());

      // Input 2
      System.out.printf("%nDigite o valor 2: ");
      n2.setValor(scan.nextInt());

      // Calcula resultado, manipula métodos da classe Numero
      res.setValor(n1.getValor() + n2.getValor());
      System.out.printf("%nA soma do n1: %d com n2: %d é iguall a Res: %d", 
                                n1.getValor(), n2.getValor(), res.getValor());
      // Pergunta se continuar a somar
      System.out.printf("%n%nDeseja informar outro valor? (Continuar s/S)");
      opc = scan.next();
      System.out.printf("%n%n");
  }
    // libera memória do objeto
    scan.close();
  }
}