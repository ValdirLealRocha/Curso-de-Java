// Aula 26 - https://youtu.be/e3XPo58ltIw?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Você consegue resolver este desafio em Java? [Exercício Java] - Curso de Java - Aula 26

// biblioteca pra trabalhar com o teclado...
import java.util.Scanner;

public class CursoJavaAula26 {

  public static void main(String[] args) {
    // declaração de variáveis
    // Captura dados do teclado...
    Scanner scan = new Scanner(System.in);
    // constante das perguntas
    final int numPerguntas = 5;
    // pontuação por questão...
    int pontoQuestao = 2;
    // gabarito para as validações das perguntas respondidas...
    char[] gabarito = {'a', 'c', 'b', 'a', 'c'};
    // Array com as perguntas
    String[] perguntas = {
      "Qual é a maior estrela do nosso sistema solar?",
      "Qual é a primeira letra do nosso alfabeto?",
      "2 x 10 é igual a?",
      "O fantástico muno de ____. (desenho dos anos 80)",
      "Qual é o valor de PI?",
    };
    // Array com as alternativas
    String[] alternativas = {
      "a) Sol  | b) Lua  | c) Marte",
      "a) Z    | b) C    | c) A",
      "a) 10   | b) 20   | c) 12",
      "a) Bob  | b) Carl | c) Zec",
      "a) 3.10 | b) 3    | c) 3.14",
    };
    // Array com as respostas do usuário
    char[] respostas = new char[numPerguntas];
    // 
    char resp;
    // nota
    int nota = 0;
    // Aluno
    String aluno;

    // captura o nome via teclado
    System.out.print("Digite seu nome: ");
    aluno = scan.nextLine();

    // Monta as perguntas e as alternativas para o usuário responder
    for(int i = 0; i < numPerguntas; i++) {
      System.out.println("-----------------------------------");
      System.out.printf("Pergunta %d%n", i + 1); // incrementa número da pergunta
      System.out.printf("%s%n", perguntas[i]); // mostra pergunta
      System.out.printf("%s%n", alternativas[i]); // mostra alternativa
      resp = scan.nextLine().charAt(0); // captura resposta do teclado
      respostas[i] = resp; // armazena a resposta do usuário
    }

    // valida as respostas conforme o gabarito
    System.out.printf("%s%n","Fim da Prova, Confira o Resultado!");
    // varre as perguntas e valçida as corretas conforme o gabarito
    for(int i = 0; i < numPerguntas; i++) {
      // compara gabarito com as respostas corretas
      if(gabarito[i] == respostas[i]) {
        // define a pontuação para os acertos...
        nota += pontoQuestao;
      }
    }

    // mensagem final...
    System.out.printf("%s sua nota foi %d, você foi %s - suas respostas [%s] - veja no gabarito [%s]", aluno, nota, (nota >= 6 ? "aprovado" : "reprovado"), (respostas[0] + "-" + respostas[1] + "-" + respostas[2] + "-" + respostas[3] + "-" + respostas[4]), (gabarito[0] + "-" + gabarito[1] + "-" + gabarito[2] + "-" + gabarito[3] + "-" + gabarito[4]));

    // close...
    scan.close();

  }

}