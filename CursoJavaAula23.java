// Aula 23 - https://youtu.be/8g18j8fXUfo?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Você sabe usar BREAK e CONTINUE em Java? [Aprenda nesta aula] - Curso de Java - Aula 23
public class CursoJavaAula23 {

  public static void main(String[] args) {
    // declaração de variáveis
    int cont = 100;

    for(int i = 0; i < cont; i++) {
      if(i >= 10 && i <= 60) {
        continue; // continua o processo...
        //break; // encerra imediatamente o bloco...
      }
      System.out.printf("%d" + (i == 99 ? "" : " - "), i);
    }

  }

}