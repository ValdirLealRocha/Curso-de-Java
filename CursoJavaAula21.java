// Aula 21 - https://youtu.be/XCHPMisj7G0?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Exercício Classes Java P1 - Curso de Java - Aula 20
// Exercício Classes Java P2 - Curso de Java - Aula 21
// Nesta aula iremos atualizar esta classe, a classe formiga, 
// a classe animal abastrata e a interface SerVivo e mais a classe Vegetais, 
// criada na aula 20. Continuando na Aula 21...
public class CursoJavaAula21 {

  public static void main(String[] args) {

    // usar as classes ...
    Sapo a1 = new Sapo(10, 10, 10);
    Aranha a2 = new Aranha(5, 5, 5, 3);
    Formiga a3 = new Formiga(2, 2, 2);
    Vegetal v1 = new Vegetal(1);
    Vegetal v2 = new Vegetal(5);
    Vegetal v3 = new Vegetal(10);

    a2.info();
    a2.atacar(a3);
    a2.comer(a3.getMassa());
    a2.info();

    //System.out.printf("%nO Animal está %s", (a3.getVivo() ? "VIVO" : "MORTO"));

  }
}