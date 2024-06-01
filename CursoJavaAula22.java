// Aula 22 - https://youtu.be/S253c-he7KU?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Você sabe usar SWITCH CASE em Java? [Aprenda] - Curso de Java - Aula 22
public class CursoJavaAula22 {

  public static void main(String[] args) {
    // declaração de variáveis
    int posicao = 1;
    int n1, n2, res;
    String op = "+";
    int nota = 8;
    String resp = "";

    // Estrução de Condição IF
    if(posicao == 1) {
      //Caso verdadeira faça isso..
    }else if(posicao ==2){
      ////Caso verdadeira faça isso..
    };

    // atualiza variável
    posicao = 5;

    // O SWITCH pode ser em alguns casos melhor condicional que o IF.
    switch(posicao) {
      case 1:
        System.out.printf("%n%s", "Medalha de Ouro");
        break;
      case 2:
        System.out.printf("%n%s", "Medalha de Prata");
        break;
      case 3:
        System.out.printf("%n%s", "Medalha de Bronze");
        break;
      default:
        System.out.printf("%n%s", "Sem Medalha");
        break;
    };

    // atualiza variável
    op = "*";
    n1 = 10;
    n2 = 5;
    // O SWITCH pode ser em alguns casos melhor condicional que o IF.
    switch(op) {
      case "+":
        res = (n1 + n2);
        //System.out.printf("%nn1=%d + n2=%d = %d", n1, n2, (n1 + n2));
        break;
      case "-":
        res = (n1 - n2);
        //System.out.printf("%nn1=%d - n2=%d = %d", n1, n2, (n1 - n2));
        break;
      case "*":
        res = (n1 * n2);
        //System.out.printf("%nn1=%d * n2=%d = %d", n1, n2, (n1 * n2));
        break;
      case "/":
        res = (n1 / n2);
        //System.out.printf("%nn1=%d * n2=%d = %d", n1, n2, (n1 * n2));
        break;
      default:
        res = 0;
        System.out.printf("%n%s", "Operação Inválida");
        break;
    };
    System.out.printf("%nOperação: %s : Resultado: %d%n", op, res);
    
    // atualiza variável
    nota = -3;

    // O SWITCH pode ser em alguns casos melhor condicional que o IF.
    switch(nota) {
      case 10: case 9: case 8: case 7:  
        resp = "Aprovado";
        break;
      case 6: case 5: case 4:  
        resp = "Recuperação";
        break;
      case 3: case 2: case 1: case 0:
        resp = "Reprovado";
        break;
      default:
        resp = "Nota Inválida";
        break;
    };
    System.out.printf("%nResultado: %s%n", resp);
  };
};