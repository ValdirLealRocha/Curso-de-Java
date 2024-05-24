// Aula 04 - https://youtu.be/sRsAbGjBb4g?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Obtendo dados do teclado com um objeto da classe Scanner - Curso de Java - Aula 04
import java.util.Scanner; // Pacote para uso da coleta de dados vindas do teclado

public class CursoJavaAula04 {
  public static void main(String[] args) {
    // Coletar dados do Teclado
    // comandos de entradas.
    Scanner scan = new Scanner(System.in); // Declaração de um objeto e Instancia uma classe
  
    // int n1 = 0, n2 = 0, res = 0; // Criação e inicialização na mesma linha
    int n1 = 0, n2 = 0, n3 = 0, n4 = 0, soma = 0; // Criação e inicialização na mesma linha

    // Esta declaração cria uma CONSTANTE não pode mudar o conteúdo, fica fixo. 
    // Pra ajudar a identificação nomeia em maiúsculas, não é um padrão e sim uma 
    // forma de facilitar a leitura - a palavra 'final' é que define que é uma constant 
    // e não uma variável. A variável pode mudar o seu valor a constante não!
    final int MEDIA = 60; 

    //String nome = "";
    String nome = "", res = "";

    //System.out.print("Digite seu Nome: ");
    //nome = scan.nextLine();

    System.out.print("Digite o Nome do Aluno: ");
    nome = scan.nextLine();

    //System.out.println("Digite o Primeiro Numeral");
    //System.out.print("Digite o Primeiro Numeral: ");
    System.out.print("Digite a Primeira Nota: ");
    n1 = scan.nextInt();
    //System.out.printf("\nPrimeiro Numeral Informado: %d\n", n1);
    //System.out.printf("\nPrimeiro Numeral Informado: %d\n", n1);
    //System.out.printf("Primeiro Numeral Informado: %d\n\n", n1);
    //System.out.printf("Confirmando! Você digitou: %d\n\n", n1);

    //System.out.print("Digite o Segundo Numeral: ");
    System.out.print("Digite a Segunda Nota: ");
    n2 = scan.nextInt();
    //System.out.printf("\nSegundo Numeral Informado: %d\n", n2);
    //System.out.printf("Segundo Numeral Informado: %d\n\n", n2);
    //System.out.printf("Confirmando! Você digitou: %d\n\n", n2);

    System.out.print("Digite a Terceira Nota: ");
    n3 = scan.nextInt();

    System.out.print("Digite a Quarta Nota: ");
    n4 = scan.nextInt();

    //res = n1 + n2;
    soma = n1 + n2 + n3 + n4;
    if(soma >= MEDIA){
      res = "foi Aprovado";
    }else if(soma >= 40){
      res = "está em Recuperação";
    }else{
      res = "foi Reprovado";
    }
    //System.out.printf("A Soma de %d com %d é Igual a: %d\n", n1, n2, res);
    //System.out.printf("%s a Soma de %d com %d é Igual a: %d\n", nome, n1, n2, res);
    System.out.printf("Aluno(a) %s %s, com nota: %d\n", nome, res, soma);

    scan.close(); // Fecha o objeto instanciado, tirar da memória. Todo objeto deve ser fechado/destuído...
  }
}
