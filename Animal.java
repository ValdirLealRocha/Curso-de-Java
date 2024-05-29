// Classe Animal
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
