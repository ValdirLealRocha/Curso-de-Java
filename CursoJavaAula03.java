// Aula 03 - https://youtu.be/qQWizjnAtbs?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Comandos de decisão em Java (IF, IF..ELSE, SWITCH e ?) - Curso de Java - Aula 03
// If, If..Else, Switch e ?
public class CursoJavaAula03 {
  // Main principal função do Java.
  public static void main(String[] args) {
    // Operadores lógicos: -, ==, >, <, >=, <=, !=, !, && 'and', || 'OR', (o retorno será 'true' ou 'false')

    //int nota = 65; // Teste com o valor de 50 e não vai entrar no IF
    //int faltas = 10;
    //int maxFaltas = 5;
    //int media = 60;
    //String res = "";
    //int nres = 0;

    int pos = 1;

    //IF - "./Diagramas/Diagrama da Estrutura do IF.png"
    //if(nota >= media){
    //  System.out.println("Aprovado");
    //}
    //System.out.println("Fim do Programa!");

    // IFF..ELSE "./Diagramas/Diagrama da Estrutura do IF-ELSE.png"
    //nota = 50; // alterar valor para testar operação e ver a mensagem gerada
    //if(nota >= media){
    //  System.out.println("Aprovado");
    //}else{
    //  System.out.println("Reprovado");
    //}
    //System.out.println("Fim do Programa!");

    // IFF..ELSEIF..ELSE "./Diagramas/Diagrama da Estrutura do IF-ELSE 1.png"
    //nota = 30; // alterar valor para testar operação e ver a mensagem gerada
    //if(nota >= media){
    //  System.out.println("Aprovado");
    //}else if(nota >= 40){ // Define as condições e avaliações que forem preciso...
    //  System.out.println("Recuperação");
    //}else{
    //  System.out.println("Reprovado");
    //}
    //System.out.println("Fim do Programa!");
    //nota = 85; // alterar valor para testar operação e ver a mensagem gerada
    // Tabela verdade && <-> AND
    // /*
    //   V V = V
    //   V F = F
    //   F V = F
    // */
    //  Tabela verdade || <-> OR
    // /*
    //   V V = V
    //   V F = V
    //   F V = V
    //   F F = F
    // */
    //if((nota >= media) && (faltas <= maxFaltas)){
    //  System.out.println("Aprovado");
    //}else if(nota >= 40){ // Define as condições e avaliações que forem preciso...
    //  System.out.println("Recuperação");
    //}else{
    //  System.out.println("Reprovado");
    //}
    //System.out.println("Fim do Programa!");

    // ? - Condicional Ternária
    //res = (nota >= media ? "Aprovado" : "Reprovado");
    //System.out.println(res);
    //
    //nres = (nota >= media ? 1 : 0);
    //System.out.println("Resultado: " + (nres == 1 ? "Aprovado" : "Reprovado"));

    // SWITCH - "./Diagramas/Diagrama da Estrutura do SWITCH.png"
    // pra várias condições melhor este comando que o IF
    //pos = 7;
    switch(pos){
      case 1:
        System.out.println("Primeiro Lugar!");
        break; // força uma parada e sai do Switch
      case 2:
        System.out.println("Segundo Lugar!");
        break; // força uma parada e sai do Switch
        case 3:
        System.out.println("Terceiro Lugar!");
        break; // força uma parada e sai do Switch
      case 4: case 5: case 6: // Teste várias condições do case...
        System.out.println("Premio de Participação.");
        break; // força uma parada e sai do Switch
      default:
        System.out.println("Agradecemos sua Participação, até a Próxima. :(");
        break; // força uma parada e sai do Switch
    }
  }
}  
