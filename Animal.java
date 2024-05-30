// ****************************************************************************
// Este bloco abaixo foi utilizado na aula 18
// Nesta aula 19, será criado outro código e vou manter um hitórico comentado...
// Classe Animal
/* ****************************************************************************
public class Animal implements SerVivo {

  // declaração e inicialização das propriedades
  //public Boolean vivo = true;
  // mudando pra private irem os inicializar dentro do construtor da classe..
  private Boolean vivo;

  public Animal(){
    this.vivo = false;
  };
  
  public void mover(){};
  public void comer(int massa){};
  public void info(){
    System.out.printf("Vivo: %s%n", this.vivo ? "Sim" : "Não");
  };
}
*/
// ****************************************************************************

// Nesta aula vamos implementar a Interface SerVivo e vamos criar uma classe abstrata
abstract class Animal implements SerVivo {
  // Construtor
  public Animal(){};

  // Métodos da Interface SerVivo, a serem implementados aqui...
  public void mover(){};
  public void comer(int massa){};
  public void info(){};
}