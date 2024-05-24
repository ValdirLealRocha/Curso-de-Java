// Aula 13 - https://youtu.be/TW5FthKNr50?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Métodos e atributos STATIC - Curso de Java - Aula 13
// desta aula em diante irei eliminar as linhas comentadas da aula anterior, 
// caso não faça sentido para esta aula, assim manterei mais limpo o código 
// e meu aprendizado mais claro.
//
// NOTA: Para ter mais clareza no código cada classe jogador será redefinida para 
// cada aula em diante, nesta aula vale a classe JogadorAula13.java
//
public class CursoJavaAula13 {

  public static void main(String[] args) {
    
    int num = 0;

    // Está sendo usado a propriedade alerta, antes de instanciar a classe de JogadorAula13
    //System.out.printf("%nAlerta: %s%n", (JogadorAula13.alerta ? "Sim" : "Não"));

    JogadorAula13.pontos();
    JogadorAula13.pontos();
    JogadorAula13.pontos();

    JogadorAula13 j1 = new JogadorAula13(++num);
    JogadorAula13 j2 = new JogadorAula13(++num);
    JogadorAula13 j3 = new JogadorAula13(++num);

    // inicializado fora da classe...
    JogadorAula13.alerta = true;

    // todos estes objetos estão utilizando o mesmo endereço de memória do alerta, 
    // porque ele é static na classe.
    j1.info();
    j2.info();
    j3.info();

    //System.out.printf("%nVidas do jogador 1: %d",j1.getVidas());

  }
}