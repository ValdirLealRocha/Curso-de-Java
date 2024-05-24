// Aula 14 - https://youtu.be/Cbdv96Wnr58?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Herança em Java - Curso de Java - Aula 14
// O que é Herança em Orientação a Objetos: É quando eu tenho uma classe
// que herda características de outra classe.
// Classe filho que vai herdar todo conteúdo de uma classe "pai" e tudo
// que implementar na classe pai, vale na classe filho.
// Na classe filho podemos ter outras coisas, mas, 
// tudo que tem na classe pai vale pra classe filho.
public class CursoJavaAula14 {

  public static void main(String[] args) {
    
    Carro c1 = new Carro("Golf");
    Carro c2 = new Carro("HRV");

    CarroCombate c3 = new CarroCombate("Leopardo", 100);
    CarroCombate c4 = new CarroCombate("Pantera", 50);

    c3.atirar();
    c3.atirar();
    c3.atirar();

    c4.sofrerDano(30);
    c1.sofrerDano(5);

    //c1.setLigado(true);
    c1.info();
    c2.info();
    c3.info();
    c4.info();
  }
}